import java.util.Scanner;

public class singleinherit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and cols for 1st matrix");
        int r1=sc.nextInt();//3
        int c1=sc.nextInt();//3
        System.out.println("enter the number of rows and cols for 2nd matrix");
        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        System.out.println("enter the elements for 1st matrix:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
               a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements for 2nd matrix:");
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                c[i][j]=0;
                for(int k=0;k<c1;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
