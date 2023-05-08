/* write a java program that checks a number from 0 to 5 and 
prints its spelling, if the number is greater than 5 print the nuber is greater than 5
input1: var=4;
output: four
input:6
output: 6 is greater than 5
input var=-6
output: invalid number
*/
class practical1_4 {
	public static void main(String[] args) {
		int var=-6;
			if(var==0) {
				System.out.println("Zero");
			}else if(var==1) {
				System.out.println("one");
			}else if(var==2) {
				System.out.println("two"); 
			}else if(var==3) {
				System.out.println("three"); 
			}else if(var==4) {
				System.out.println("four"); 
			}else if(var==5) {
				System.out.println("five"); 
			}else if(var>5) {
				System.out.println(var +" is greater than 5");
			}else {
				System.out.println("invalid number");
			}
		}
	}
	