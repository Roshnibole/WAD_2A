/* print an array by giving the input from the user */
import java.io.*;
class Rosh {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int arr[]=new int[6];
		System.out.println(" enter input");
	for(int x=0; x<6; x++) {
		arr[x] = Integer.parseInt(br.readLine());
	}
		System.out.println("for loop");
		
	for(int i=0; i<6; i++) {
		System.out.println(arr[i]);
		}
	}
}	
	