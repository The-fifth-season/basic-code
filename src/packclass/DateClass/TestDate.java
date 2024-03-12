package packclass.DateClass;
//日期相关的类：

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        //Date 类
        Date date = new Date();                 //获取当前时间；
        System.out.println(date);

        //SimpleDateFormat 类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");       //设置时间的格式 SSS代表毫秒
        System.out.println(sdf.format(date));                                                 //按格式输出日期
        Date date1 = sdf.parse("2015-8-01 00:00:00 000");                              //获取指定时间，但得按sdf中设定的格式
        System.out.println(sdf.format(date1));
        //Calendar calendar1 = sdf.parse("2015-8-01 00:00:00 000");                              报错,必须得是Date类型

        // Calendar 类                    Calender————日历
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(sdf.format(calendar.getTime()));                             //按格式输出

        //Calendar 类中的add方法
        calendar.add(Calendar.HOUR_OF_DAY,1);                   //增加一小时、1ms、1s等
        calendar.add(Calendar.DAY_OF_YEAR,-1);                  //减少一天
        calendar.add(Calendar.WEEK_OF_MONTH,1);                 //增加一周
        calendar.add(Calendar.YEAR,1);                          //增加一年
        System.out.println(sdf.format(calendar.getTime()));

        //Calendar 类中的get方法
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));                //月初开始按7天一周算，是本月的第几周
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));                       //按日历上来算，今天是本月的第几周————可能本周第一天就是周六，过两天就直接是下一周
        calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH)+1;                     //获取月份要+1，要不是重0月开始计数的
        System.out.println(month);

        calendar.setTime(date1);                                        //获取date1的时间，Date类型的时间可以自己设定
        System.out.println(sdf.format(calendar.getTime()));

    }
}