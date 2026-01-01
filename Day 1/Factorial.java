import java.util.Scanner;

class Factorial {
public static int fact(int n){
if (n<=1)
{
return 1;
}
else {
int f=1;
for (int i=1; i<=n; i++)
{
f=f*i;
}
return f;
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Number : ");
int n=sc.nextInt();
int ans= fact(n);

System.out.println("FActorial of given number is : " + ans);
}
}