import java.util.Scanner;

public class Class1 {

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
	public static void Factorial(int[] arr) {
		
		for (int i=0; i<arr.length; i++) {
			int fact=1;
		
			int n=arr[i];
		if ( arr[i]==0) {
			System.out.println("Factorial of " + arr[i] + " is " + 1);
		}
			while (n!=0) {
				fact=fact*n;
				n--;
			}
			System.out.println("Factorial of " + arr[i] + " is " + fact);
		}
		}	
	
	public static void MaxPrime(int[]arr) {
		int size = arr.length;
		int[] arr2 =new int[size];
		
		for (int i = 0; i< arr.length; i++) {
			int count=0;
			for (int j=1; j<=arr[i]; j++) {
				if (arr[i] % j ==0) {
					count ++ ;
				}
				
			}
			if (count == 2) {
				arr2[i] = arr[i];
			}
		}
		
		
		int maxPrime = arr2[0];
		
		
		for (int i=1; i<arr2.length; i++) {
			
			if (maxPrime < arr2[i]) {
				maxPrime=arr2[i];
			}
		}
		
		System.out.println("Maximum Prime number in the array Is : " + maxPrime);

	}
	public static void MinPrime(int[]arr) {
		int size = arr.length;
		int[] arr2 =new int[size];
		int k=0;
		
		for (int i = 0; i< arr.length; i++) {
			int count=0;
			for (int j=1; j<=arr[i]; j++) {
				if (arr[i] % j ==0) {
					count ++ ;
				}
				
			}
			
			if (count == 2) {
				arr2[k] = arr[i];
				k++;
			}
		}
		

		int minPrime = arr2[0];
		
		
		for (int i=1; i<k; i++) {
		
		if (minPrime > arr2[i] ) {
				minPrime=arr2[i];
			}

		}
		System.out.println("Minimum Prime number in the array Is : " + minPrime);


	}}
		
			
		
	


