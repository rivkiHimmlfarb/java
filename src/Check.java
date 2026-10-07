public class Check {

    public static void main(String[] args) {
        MyTime time = new MyTime(9,9,2026,20,33,23);
        System.out.println(time.getDate('/',':'));
    }
}
