import java.util.Scanner;
public class Test1{
public static void displayData(int[] arr){
Scanner sc=new Scanner (System.in);
for(int i=0;i<arr.length;i++)
{
System.out.println("Enter Numbers:");
arr[i]=sc.nextInt();
}
for(int j=0;j<arr.length;j++)
{
int Count=0;
for(int k=1; k<=arr[j]; k++) 
{

if(arr[j] % k ==0) 
{
Count ++ ; 
}
}
if (Count ==2) {
System.out.println(arr[j] + "  is Prime " + "\n");
}
}
}

public static void addOdd(int[] arr){

int sum=0;

for(int i=0;i<10;i=i+2){
sum=sum+arr[i];
System.out.println("Odd Nuumbers are : \t" + arr[i]);
}
System.out.println("Sum is : " + sum);
}


public static void main(String[] args){
int[] arr = new int[10];
displayData(arr);

addOdd(arr);


}
}
