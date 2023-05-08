import java.io.*;
import java.util.*;
class Rosh {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter size of an array :");
		int Size=Integer.parseInt(br.readLine());
		
	int arr[]=new int[Size];
	System.out.println("Enter elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
	int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("the sum of odd number is :" +sum );
	}
}
	
		