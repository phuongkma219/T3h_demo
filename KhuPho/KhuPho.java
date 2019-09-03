package KhuPho;

import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    public static void main(String[] args) {
        ArrayList<hoDan> abc = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số hộ dân : ");
        int n = input.nextInt();
        for (int i = 0; i <n ; i++) {
            hoDan x = new hoDan();
            x.nhapTT2(input);
            abc.add(x);
        }
        for (int i = 0; i <abc.size() ; i++) {
            System.out.println("Hộ dân thứ " + (i+1) + " : ");
            abc.get(i).hienThiTT2();
        }
    }
}
