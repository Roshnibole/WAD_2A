// product of odd element only
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
	int product=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				product=product*arr[i];
			}
		}
			System.out.println(" Product of odd element is " + product);
		}
	}
	