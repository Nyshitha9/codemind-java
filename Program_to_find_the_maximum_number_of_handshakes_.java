import java.util.Scanner;
class A
{
    public static void main (String[]args)
    {
        int total;
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        total=(n*(n-1))/2;
        System.out.println(total);
        
    }
}