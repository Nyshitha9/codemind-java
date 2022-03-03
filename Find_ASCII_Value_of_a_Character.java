import java.util.Scanner;
class A
{

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);  
        int ascii = c;
        int value = (int) c;
        System.out.println(value);
    }
}
