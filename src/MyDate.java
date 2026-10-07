public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }
    public MyDate() {
        MyDate myDate = new MyDate();
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1 && day<=12)
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month>=1 && month<=12)
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1 &&year<=9999)
        this.year = year;
    }

    public String getDate(char c){
        return day+""+c+month+c+year;
    }


}
