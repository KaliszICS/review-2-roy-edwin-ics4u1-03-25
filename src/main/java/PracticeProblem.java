import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}
	
	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String int1 = in.nextLine(); 
		System.out.println(int1);

	}

	public static void q2() {
		System.out.print("In: ");
		Scanner in = new Scanner(System.in);
		int firstimput = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int secondimput = in.nextInt();
		in.nextLine();
		System.out.println(firstimput/secondimput);
		System.out.println(firstimput%secondimput);
		
	}

	/* 3. Get a String using "In: " as the prompt.  Output the String + " was the text you wrote" on the same line.
	4. Get an integer from user input using "In: " as the prompt.  Output the result of the integer times by 5.
	5. Get a boolean using "In: " as the prompt.  Output the boolean followed by " is a boolean"
	6. Get a double using "In: " as the prompt.  Output the double - 3.2.*/

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String prompt1 = in.nextLine();
		System.out.println(prompt1 + " was the text you wrote");	

	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int numtimesfive = in.nextInt();
		in.nextLine();
		System.out.println(5*numtimesfive);
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean boo = in.nextBoolean();
		in.nextLine();
		System.out.println(boo + " is a boolean");
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double yippie = in.nextDouble();
		in.nextLine();
		System.out.println(yippie-3.2);
		
	}

}
