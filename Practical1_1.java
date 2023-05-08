/* write a program to check if a number is even or odd...
input var=10
output: 10 is an even number
input var=37:
output: 37 is odd number
input: var=0
output: 0 is even number
*/

class practical1_1 {
	public static void main(String[] args) {
		int var= 0;
			if(var%2==0) {
				System.out.println(var+ "is even number");
			} else {
				System.out.println(var+ "id odd number");
			}
		}
	}