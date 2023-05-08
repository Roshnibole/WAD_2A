/* write a program in which student should enter marks of five different subjects. if all subject having above passing marks add
them and provide switch case to print grades(first class, second class,...etc) if student get fail in any subject program should print "you failed in exam"
*/
import java.io.*;
import java.util.*;

class Rosh {
	public static void main(String[] args) throws IOException {
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	
		
		System.out.println("enter marks of students :");
		String marks=br.readLine();
			StringTokenizer st=new StringTokenizer(marks,",");
			
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken());
	System.out.println("student one marks");
	int stud1=Integer.parseInt(br.readLine());
	System.out.println(stud1);
	
	System.out.println("student two marks");
	int stud2=Integer.parseInt(br.readLine());
	System.out.println(stud2);
	
	System.out.println("student three marks");
	int stud3=Integer.parseInt(br.readLine());
	System.out.println(stud3);
	
	System.out.println("student four marks");
	int stud4=Integer.parseInt(br.readLine());
	System.out.println(stud4);
	
	System.out.println("student five marks");
	int stud5=Integer.parseInt(br.readLine());
	System.out.println(stud5);
			}
	}
	
}
	