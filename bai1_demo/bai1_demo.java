package bai1_demo;

import java.util.Scanner;

public class bai1_demo {
    public static void main(String[] args) {
        System.out.println("đặng thanh phương");
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("phần tử a ["+i+"] :" );
            a[i]= input.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(a[i]  );

        }
        System.out.println("\n");
        print(a);
    }
    public static void print(int []a){
            int max = 0;
            int []b = new int[a.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <=i; j++) {
                    if(a[i]==a[j]){
                        b[i]++;
                    }
            }
        }
        max = b[0];
        for(int i =1 ;i<a.length;i++){
            if(b[i]> max){
                max = b[i];
            }
        }
        for (int i = 0; i <a.length ; i++) {
            if(b[i]== max){
                System.out.println("a["+i+"] nhiều nhất");
            }
        }
    }
}
