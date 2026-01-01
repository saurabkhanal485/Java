import java.util.Scanner;
class AddNumbers{
public static void main(String [] args){
Scanner sc=new Scanner (System.in);
System.out.println("Enter Number");

int n1=sc.nextInt();
int n2=sc.nextInt();
int sum = n1+n2;
System.out.println("N1:  "+n1 + "+" + "N2:  "+n2 + "=" + sum);
}
}