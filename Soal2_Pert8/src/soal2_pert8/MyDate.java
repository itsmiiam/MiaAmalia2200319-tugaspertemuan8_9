package soal2_pert8;

// MyDate.java
import java.util.Calendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        Calendar cal = Calendar.getInstance();
        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH);
        this.day = cal.get(Calendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + (month) + "-" + day;
    }
}
