// composite numbers: are those numbers which does not have 2 factors

class Rosh {
	public static void main(String[] args) {
		int N=10;
		int count=0;
			for(int i=1; i<=N; i++) {
			if(N%i==0) {
				count++;
			}
		}
			if(count==0 ) {
				System.out.println("neither prime nor composite");
			}else if (count!=2) {
				System.out.println("composite number");
			}
			else if(count==1) {
				System.out.println("neither prime nor composite");
			}else  {
				System.out.println("not composite");
			}
		}
	}
