package KhuPho;

import java.util.Scanner;

public class hoDan {
    private int soTv;
    private String soNha;
    private  person[] person1;
    public hoDan() {
        this.person1 = new person[15];
    }

    public hoDan(int soTv , String soNha,person[] person1) {
        this.soTv = soTv;
        this.soNha =soNha;
        this.person1 = person1;
    }
    public void nhapTT2(Scanner input){
        System.out.println("Số thành viên trong hộ : ");
        int n = input.nextInt();
        input.nextLine();
        System.out.println("Nhập số nhà : ");
        this.soNha = input.nextLine();
        for (int i=0;i<n;i++){
            System.out.println("Nhập thông tin thành viên thứ " +(i+1) +" :");
            person1[i] = new person();
            person1[i].nhapTT(input);
        }
    }
    public void hienThiTT2(){
        System.out.println("Số nhà : " + this.soNha);
        System.out.println("Số thành viên : " + this.soTv);
        for (int i = 0; i < this.soTv ; i++) {
            System.out.println("---Thành viên thứ " +(i+1) +" ---");
            person1[i].hienThiTT();
        }
    }
}
