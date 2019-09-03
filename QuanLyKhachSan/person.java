package QuanLyKhachSan;


import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class person {
    private String name;
    private Date birthday;
    private String id;

    public person() {
    }

    public person(String name,Date birthday,String id) {
        this.name = name;
        this.birthday = birthday;
        this.id = id;
    }
    public void nhapTT(Scanner input){
        System.out.println("---<Thông tin khách hàng>---");
        System.out.println("Nhập họ và tên khách hàng : ");
        this.name = input.nextLine();
        System.out.println("Nhập ngày sinh : ");
        String ns = input.nextLine();
        this.birthday =chuyenStringDate(ns);
        System.out.println("Nhập số CMTND : ");
        this.id = input.nextLine();
    }
    public void hienThiTT(){
        System.out.println("Họ và tên : " + this.name);
        System.out.println("Ngày sinh : " + this.birthday);
        System.out.println("Số CMTND : " + this.id);
    }
    public Date chuyenStringDate(String str){
        SimpleDateFormat day = new SimpleDateFormat("dd-MM-yyyy");
        Date ns = null;
        try {
            ns = day.parse(str);
        }
        catch (Exception e){
            System.out.println("lỗi định dạng thời gian");
        }
        return ns;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
