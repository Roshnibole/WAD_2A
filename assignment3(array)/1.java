/* class Rosh {
	public static void main(String[] args) {
	
	int arr[]={0,2};
	System.out.println("array count is" + arr.length);
	}
}
*/

import java.io.*;
class Rosh {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter size of an array");
			int size=Integer.parseInt(br.readLine());
				
		int arr[]=new int[size];
			System.out.println("enter elements :");
				
			for(int i=0; i<arr.length; i++) {
				arr[i]=Integer.parseInt(br.readLine());
			}
		System.out.println("enter count of elements");
		System.out.println(arr.length);
	
	}
}