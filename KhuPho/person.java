package KhuPho;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class person {
        private String name;
        private Date birthday;
        private String job;

    public person() {
    }
    public person(String name,Date birthday, String job){
        this.name = name;
        this.birthday = birthday;
        this.job = job;
    }
    public void nhapTT(Scanner input){
        System.out.println("Nhập họ và tên : ");
        this.name = input.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String ns = input.nextLine();
        this.birthday = chuyenStringDate(ns);
        System.out.println("Nghề nghiêp : ");
        this.job = input.nextLine();
    }
    public void hienThiTT(){
        System.out.println("Họ và tên : " + getName() );
        System.out.println("Ngày sinh : " + getBirthday());
        System.out.println("Nghề nghiệp : " + getJob());
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getJob() {
        return job;
    }

    public String getName() {
        return name;
    }

    public Date chuyenStringDate(String str){
        Date ns = null;
        SimpleDateFormat day = new SimpleDateFormat("dd-MM-yyyy");
       try{
           ns = day.parse(str);
       }
       catch (Exception e){
           System.out.println("Lỗi định dạng thời gian");
       }
       return ns;
    }
}
