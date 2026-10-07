public class MyTime extends MyDate{
    int second;
    int minute;
    int hour;


    public MyTime(int day, int month, int year, int second, int minute, int hour) {
        super(day, month, year);
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    @Override
    public String getDate(char c){
        StringBuilder sb = new StringBuilder();
        sb.append(getDay());
        sb.append(c);
        sb.append(getMonth());
        sb.append(c);
        sb.append(getYear());
        sb.append(" ");
        sb.append(hour);
        sb.append(c);
        sb.append(minute);
        sb.append(c);
        sb.append(second);
        return sb.toString();
    }
    public String getDate(char c1,char c2){
        StringBuilder sb = new StringBuilder();
        sb.append(getDay());
        sb.append(c1);
        sb.append(getMonth());
        sb.append(c1);
        sb.append(getYear());
        sb.append(" ");
        sb.append(hour);
        sb.append(c2);
        sb.append(minute);
        sb.append(c2);
        sb.append(second);
        return sb.toString();
    }
}

