import java.util.Scanner;
class A
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int hurl = s.nextInt();
        int spin = s.nextInt();
        int speed = s.nextInt();
        int ch=10;
        switch(ch)
            {
               case 10:
                   if(hurl>50&&spin>60&&speed>100)
                   {
                   System.out.println("10");
                   break;
                   }
               case '9':
               if(hurl>50&&spin>60&&speed<100)
               {
                   System.out.println("9");
                   break;
               }
               case '8':
                   if(hurl<50&&spin>60&&speed>100)
                   {
                   System.out.println("8");
                   break;
                   }
               case '7':
                   if(hurl>50&&spin<60&&speed>100)
                   {
                   System.out.println("7");
                   break;
                   }
               case '6':
                   if(hurl>50 || spin>60 || speed>100)
                   {
                   System.out.println("6");
                   break;
                   }
               default:
                   System.out.println("5");
                   break;
            }
          }
        }