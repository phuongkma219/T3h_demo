package QL_hs;

import java.util.Date;
import java.util.Scanner;

public class student extends person implements Comparable<student>{
    private String grade;
    private String course;
    private String semester;

    public student(String name, Date birthday, String qHuong, String grade, String course, String semester) {
        super(name,birthday,qHuong);
        this.grade = grade;
        this.course = course;
        this.semester = semester;
    }

    public student() {
    }
    @Override
    public void nhapTT(Scanner input){
        super.nhapTT(input);
        System.out.println("Nhập Khóa học : ");
        this.course = input.nextLine();
        System.out.println("Nhập lớp học : ");
        this.grade = input.nextLine();
        System.out.println("Nhập học kỳ : ");
        this.semester = input.nextLine();

    }
    @Override
    public  void hienThiTT(){
        super.hienThiTT();
        System.out.println("Lớp : " + this.grade);
        System.out.println("Học kỳ : " + this.semester);
        System.out.println("Khóa : " + this.course);
    }


    @Override
    public int compareTo(student o) {
        return getName().compareTo(o.getName());//sắp xếp theo thứ tự tăng dần
        //o.getName.compareTo(getName) - sắp xếp giảm dần.
    }
}
