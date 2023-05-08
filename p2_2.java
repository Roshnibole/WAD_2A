/* write a program to calculate factorial of the given number
input: 6
output: 6 factorial is 720
*/

class Demo {
	public static void main(String[] args) {
		int N=6;
		int i=1;
		int factorial=1;
			while(i<=N) {
				factorial=factorial*i;
			}
			System.out.println(factorial);

		}
	}
	