import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        }
    public static void ex1(String s,char c){
        int index=s.indexOf(c);
        if (index==-1)return;
        System.out.println(s.substring(0,index));
    }
    public static void ex2(String s1,String s2,String s3){
       String []arr=new String[3];
       arr[0]=s1;
       arr[1]=s2;
       arr[2]=s3;
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }

    public static void ex3(){
        StringBuilder concat=new StringBuilder();
            String s=sc.nextLine();
        while (!s.equals("end")){
            concat.append(s);
        }
        System.out.println(concat);
    }


    }
