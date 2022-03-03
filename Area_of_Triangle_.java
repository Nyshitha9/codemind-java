import java.util.Scanner;
import java.util.*;

class A
{
    public static void main(String[]args)
    {
        double s,area;
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        s=(a+b+c)/2;
        area=s*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(area));
    }
}