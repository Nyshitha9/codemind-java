import java.util.Scanner;
class A
{
    public static void main (String[]args)
    {
        
        double avg;
        Scanner s = new Scanner(System.in);
        double n=s.nextDouble();
        double m=s.nextDouble();
        
        if(n>=1&m<=1000)
        {
            avg=((n+m)/2);
            System.out.printf("%.4f",(double)avg);
        }
    }
}