public class MyTime extends MyDate{
    int second;
    int minute;
    int hour;


    public MyTime(int day, int month, int year, int second, int minute, int hour,int dayOfWeek) {
        super(day, month, year,dayOfWeek);
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    @Override
    public String getDate(char c){
       String  s="";
       s+=super.getDate(c);
       s+=" "+hour+""+c+""+minute+""+c+""+second;
return s;
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
