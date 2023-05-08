/* write a program to check day number(1-7) and print the corresponding day of week
input1:1
output:monday
input2:6
output:saturday
input3:8
output:not a day of week
*/

class p1{
	public static void main(String[] args) {
		int x=1;
			if(x==1) {
				System.out.println("monday");
			}else if(x==2) {
				System.out.println("tuesday");
			}else if(x==3){
				System.out.println("wednesday");
			}else if(x==4){
				System.out.println("thursday");
			}else if(x==5){
				System.out.println("friday");
			}else if(x==6){
				System.out.println("saturday");
			}else if(x==7){
				System.out.println("sunday");
			}else {
				System.out.println("not a day of week");
			}
		}
	}