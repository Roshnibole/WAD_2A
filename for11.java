//write a program to print odd numbers from 1-50

class Rosh {
	public static void main(String[] args) {
		int N=50;
			for(int i=1; i<=N; i++) {
				if(i%2!=0) {
					System.out.println(i);
				}
			}
		}
	}