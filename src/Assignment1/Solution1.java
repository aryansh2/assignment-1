package Assignment1;
import java.util.Scanner;
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double speed;
        double time;
        double distance;
        double gravity=9.8;
        System.out.println("Input time");
        time=sc.nextDouble();
        speed=gravity*time;
        distance=(gravity*Math.pow(time,2))/2;
        System.out.println("");
    }
}
