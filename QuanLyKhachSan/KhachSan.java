package QuanLyKhachSan;

import java.util.Scanner;

public class KhachSan {
    private int SoNgay;
    private String LoaiP;
    private Double GiaTro;
    person person1;

    public KhachSan() {
    }

    public KhachSan(int soNgay, String LoaiP, Double GiaTro, person person1) {
        this.SoNgay = soNgay;
        this.LoaiP = LoaiP;
        this.GiaTro = GiaTro;
        this.person1 = person1;
    }
    public void nhapTT2(Scanner input){
        person1 = new person();
        this.person1.nhapTT(input);
        System.out.println("Số ngày trọ : ");
        this.SoNgay = input.nextInt();
        input.nextLine();
        System.out.println("Loại phòng trọ : ");
        this.LoaiP = input.nextLine();
        System.out.println("Giá Phòng : ");
        this.GiaTro= input.nextDouble();
        input.nextLine();
    }
    public void hienThiTT2(){
        person1.hienThiTT();
        System.out.println("Số ngày trọ : " + this.SoNgay);
        System.out.println("Loại phòng trọ : " + this.LoaiP);
        System.out.println("Giá Phòng : " + this.GiaTro);

    }
    public person getKhach()
    {
        return this.person1;
    }
    public double ThanhToan(){
        return this.SoNgay*this.GiaTro;
    }

}

