//WAP to find no of odd and even numbers  in an array. display sum value

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
	int evenCount=0;
	int oddCount=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
			System.out.println(evenCount);
			System.out.println(oddCount);
		}
	}
