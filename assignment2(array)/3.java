//sum of even and odd numbers in an array

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
	int evenSum=0;
	int oddSum=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenSum=evenSum+arr[i];
			} else {
				oddSum=oddSum+arr[i];
			}
		}
			System.out.println("even sum is :" + evenSum);
			System.out.println("odd sum is :" + oddSum);
		}
	}
