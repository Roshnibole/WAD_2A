class Rosh {
	public static void main(String[] args) {
	
	System.out.println("initialize array in different ways");
	
	System.out.println("1st way to declare array :");
	int arr1[]=new int[4];
	arr1[0]=10;
	arr1[1]=40;
	arr1[2]=20;
	arr1[3]=30;
		
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	System.out.println(arr1[3]);
	
	System.out.println("2nd way to declare array :");
	int arr2[]=new int[] {100,200,300,400};
	
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	System.out.println(arr1[3]);
	
	System.out.println("3rd way to declare array :");
	
	int arr3[]={123,134,23,45};
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	System.out.println(arr1[2]);
	System.out.println(arr1[3]);
	
/*	System.out.println("we cant declare array as like below");
	int arr1[]=new int[4]{19,27,23,45);	//it gives error
*/	
	}
}
	