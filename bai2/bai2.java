package bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("đặng thanh phương");
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng a: ");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            System.out.println("phần tử a ["+ i +"] :" );
            a[i]= input.nextInt();
        }
        System.out.println("nhập số phần tử của mảng b: ");
        int m = input.nextInt();
        int[] b =new int[m];
        for (int i=0;i<m;i++){
            System.out.println("phần tử b ["+i+"] :" );
            b[i]= input.nextInt();
        }
        System.out.println("nhập vị trí cần trèn ở mảng a");
        int x = input.nextInt();
        int p = m+n;
        int []c = new int[p];
        for (int i = 0; i <p ; i++) {
            i=0;

        }
    }
}
