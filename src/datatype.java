import java.util.Scanner;
interface A
{
    void add(int a,int b);
}
interface B
{
    void sub(int a,int b);
}
public class datatype {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a and b val=");
        int p=sc.nextInt();
        int q=sc.nextInt();
    A obj1=(a,b) -> System.out.println("add="+(a+b));
    B obj2=(a,b) -> System.out.println("sub="+(a-b));
    obj1.add(p,q);
    obj2.sub(p,q);
    }
}
