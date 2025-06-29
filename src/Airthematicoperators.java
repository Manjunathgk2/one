import java.util.Scanner;

public class Airthematicoperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a val:");
        int a=sc.nextInt();
        System.out.println("enter the b val:");
        int b=sc.nextInt();
        System.out.println("enter the c val:");
        int c=sc.nextInt();
        if(a>=b)
        {
            if(a>=c)
            {
                System.out.println(a + " is large");
            }
            else
            {
                System.out.println(c + " is large");
            }
        }
        else
        {
            if(b>=c)
            {
                System.out.println(b + " is large");
            }
            else
            {   
                System.out.println(c + " is large");
            }
        }


    }
}
