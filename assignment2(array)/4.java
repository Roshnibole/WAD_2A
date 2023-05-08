//search a specific element from an array and return its index

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
		System.out.println("search element");
	int search=Integer.parseInt(br.readLine());
	for(int i=0; i<arr.length; i++) {
		if(arr[i]==search) {
		System.out.println(i);
		}
	}
}
}