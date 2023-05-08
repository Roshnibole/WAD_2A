/* write a java program, take a number and print whether is is less than 10 or greater than 10
input1: var=5
output: 5 is leaa than 10
input2: var=16
output: 16 is greater than 10
input3: var=10
output: 10 is equal to 10
*/

class practical1_2 {
	public static void main(String[] args) {
		int var=10;
			if(var>10) {
				System.out.println(var+ " is greater than 10");
			} else if(var<10) {
				System.out.println( var+ "is less than 10");
			}else {
				System.out.println(var +"is equal to 10");
			}
		}
	}
	
	
//OR you can add one more condition at the else part...you can write else if(var==10) sop (10 is equal to 10)
