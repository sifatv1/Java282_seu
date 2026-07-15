import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        //input nilam
        Scanner sc  = new Scanner(System.in);

        // Radius output a show korar jonne
        System.out.print("Enter Radious: ");
        // User-এর দেওয়া radius input নেওয়া হচ্ছে
        double r = sc.nextByte();
        double area = 3.1416*r*r;
        System.out.println("area of circle :" + area);

        sc.close(); // aita na dilaw hobe  progrram close korar jonne
    }
}
