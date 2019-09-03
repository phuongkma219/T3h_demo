package QL_hs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QL_hs {
    public static void main(String[] args) {
        ArrayList<student> st = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số lượng sinh viên : ");
        int n = input.nextInt();
        input.nextLine();
        for (int i = 0; i < n; i++) {
            student x = new student();
            x.nhapTT(input);
            st.add(x);
        }
        for(int i=0;i< st.size();i++){
            System.out.println("Sinh viên thứ " + (i+1)+ " : ");
            st.get(i).hienThiTT();
        }
        System.out.println("Các sinh viên quê ở Hà Nội : ");
        for (int i = 0; i < st.size(); i++) {
            if(st.get(i).getqHuong().equalsIgnoreCase("Hà Nội")){
                st.get(i).hienThiTT();
            }
        }
        System.out.println("Sắp xếp theo alpha ");
        Collections.sort(st);
        for(int i=0;i< st.size();i++){
            System.out.println("Sinh viên thứ " + (i+1)+ " : ");
            st.get(i).hienThiTT();
        }
    }
}
