//print only vowels from the array

import java.io.*;
class Rosh {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter size of an element :");
	int Size= Integer.parseInt(br.readLine());
	
	char arr[]=new char[Size];
	System.out.println("Enter elements :");
		for(int i=0; i<arr.length; i++) {
			arr[i]=(char)br.read();
		}
	for(int i=0; i<arr.length;i++) {
		if(arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U' ) {
			System.out.println(arr[i]+"");
			}
		}
	}
}