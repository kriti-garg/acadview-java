import java.util.*;
public class Count1and0
{
    public static void main(String[] args)
    {
        int n, m, count=0,c1=0;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Decimal Number:");
        n = s.nextInt();
        while(n>0)
        {
            int a=n%2;
            x=a+x;
            n=n/2;
        }
        int l = x.length();
        for(int i=0;i<l;i++)
        {
            if(x.charAt(i)=='1')
            {
                count++;
            }
            else
            {
              c1++;
            }
        }
        System.out.println("No. of 1's are:"+count);
        System.out.println();
        System.out.println("No. of 0's are:"+c1);
      }
    }
