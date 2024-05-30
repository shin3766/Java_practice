package me.yoosup.JavaJungSuk.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ex10_1 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 0, 1);



        SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd은 2번째 일요일입니다.");

        System.out.println(sf.format(2020-1-1));
    }
}
