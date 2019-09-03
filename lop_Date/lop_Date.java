package lop_Date;

import java.util.Date;

public class lop_Date {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);//xuất ra ngày,giờ tại thời điểm hiện tại
        long nowGiay = now.getTime();
        System.out.println(nowGiay);//xuất ra thời gian tính bằng mini giây
    }
}
