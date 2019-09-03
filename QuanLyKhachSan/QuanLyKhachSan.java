package QuanLyKhachSan;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyKhachSan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<KhachSan> abc = new ArrayList<>();
        System.out.println("Nhập số lượng khách trọ : ");
        int n = input.nextInt();
        input.nextLine();
        for(int i =0;i<n;i++){
            KhachSan x = new KhachSan();
            x.nhapTT2(input);
            abc.add(x);
        }
        System.out.println("--Danh Sách Khách Trọ--");
        for (int i=0;i<abc.size();i++){
            System.out.println("Khách hàng thứ " +i);
            abc.get(i).hienThiTT2();
        }
        System.out.println("Tên khách hàng thanh toán : ");
        String search = input.nextLine();
        for(int i=0;i<abc.size();i++){
            if(search.equals(abc.get(i).getKhach().getName())){
                System.out.println("Số tiền thanh toán : " + abc.get(i).ThanhToan() );
                abc.remove(i);
            }
        }
        System.out.println("--Danh Sách Khách Trọ--");
        for (int i=0;i<abc.size();i++){
            System.out.println("Khách hàng thứ " +i);
            abc.get(i).hienThiTT2();
        }
//        System.out.println("Tên khách hàng muốn xóa : ");
//        String tenkhach = input.nextLine();
//        for(int i=0;i<abc.size();i++){
//            if(tenkhach.equals(abc.get(i).getKhach().getName())){
//                abc.remove(i);
//            }
//        }

    }

}
