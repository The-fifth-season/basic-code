package object;

import java.util.Objects;

//⒉请根据以下代码自行定义能满足需要的MyDate类,在MyDate类中覆盖equals方法，使其判断当两个MxDate类型对象的年月日都相同时，
//结果为true，否则为false。public boolean equals(Object o)
public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
//toString 重写,重写后看到的是属性，不重写看到的是地址
    @Override
    public String toString() {
        return "MyDate{year=" + year +
                ", month=" + month +
                ", day=" + day +
                "}";
    }
//equals 重写对比的是属性，不重写对比的是地址，一些特殊类型，例如String等，系统的类中已经重写过了
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }
//hashCode 重写
    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
    /*public boolean equals(Object obj){
        MyDate myDate = (MyDate) obj;
        return this.day==myDate.day&&this.year==myDate.year&&this.month==myDate.month;
    }*/
}
