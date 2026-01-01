import java.util.Scanner;
public class Test{

public static void acceptData(int[] arr){
Scanner sc= new Scanner(System.in);
for(int i=0;i<arr.length;i++){
System.out.println("Enter Elements of the array :");
arr[i] = sc.nextInt();
}
}

public static void addData(int [] arr){
int sum=0;

for(int i=0;i<arr.length;i++){
sum=sum+arr[i];

}
System.out.println( "Sum of array Element is: " + sum + "\n");
}

public static void displayData(int [] arr){
System.out.println("The Elements are : " + "\n");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
}
}

public static void main(String[] args){
int[] arr=new int[10];
acceptData(arr);
addData(arr);

displayData(arr);
}

}
