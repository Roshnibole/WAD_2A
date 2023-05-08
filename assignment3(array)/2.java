import java.io.*;
class Rosh {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("enter size of an array");
	int size=Integer.parseInt(br.readLine());
	
	int arr[]=new int[size];
	System.out.println("enter elements");
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int i=arr[size];
		while(i!=0) {
			System.out.println(i%10);
			i=i/10
		}
	}
}
		
	/*	for(int i=arr[i]; i<arr.length; i++) {
			int rev=arr[i]%10;
			System.out.println(rev);
			arr[i]=arr[i]/10;
		}
	}
}
	*/		