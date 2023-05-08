/* write a program to find a maximum number between three numbers
input1:
num1=1
num2=2
num3=3
output: 3 is the maximum between 1,2 and three

input2:
num1=1
num2=4
num3=3
output: 4 is the maximum between 1,4 and 3

input3: 
num1=42
num2=32
num3=42
output: 42 is the maximum

*/
class p1 {
		public static void main(String[] args) {
			int num1=1;
			int num2=2;
			int num3=3;
				if(num1>num2>num3) {
					System.out.println(num1+"is greater than num2 and num3");
				}else if(num2>num1>num3) {
					System.out.println(num2+"is greater than num1 and num3");
				}else if(num3>num2>num1) {
					System.out.println(num3+"is greater than num2 and num1");
				}else if(num1=num2>num3) {
					System.out.println(num1+ "is greater than num3");
				}
		}
}