/* write a java program , in which according to month no print the no. of days in that month
input: month=7
output: july has 31 days
input: month=13
output: invalid month
input:month=-6
output:invalid month
*/

class practical {
	public static void main(String[] args) {
		int month=7;
			if(month==1) {
				System.out.println("january has 31 days");
			} else if(month==2) {
				System.out.println("february has 28 or 29 days");
			}else if(month==3) {
				System.out.println("march has 31 days");
			}else if(month==4) {
				System.out.println("april has 30 days");
			}else if(month==5) {
				System.out.println("may has 31 days");
			}else if(month==6) {
				System.out.println("june has 30 days");
			}else if(month==7) {
				System.out.println("july has 31 days");
			}else if(month==8) {
				System.out.println("august has 31 days");
			}else if(month==9) {
				System.out.println("september has 31 days");
			}else if(month==10) {
				System.out.println("october has 31 days");
			}else if(month==11) {
				System.out.println("november has 31 days");
			}else if(month==12) {
				System.out.println("december has 31 days");
			}else {
					System.out.println("invalid month");
			}
	}
}
	
	