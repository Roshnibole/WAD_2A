//sum of all elements in the array

import java.io.*;
class Rosh {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter size of an element :");
	int Size= Integer.parseInt(br.readLine());
	
	int arr[]=new int[Size];
	System.out.println("Enter elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
	int sum=0;
		for(int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
			System.out.println("sum is :" +sum);
	}
}