import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//initialisation phase
		int total = 0;
		int gradeCounter = 1;

		while(gradeCounter <=10) {
			System.out.print("Enter grade: "); //prompt
			int grade = input.nextInt(); //reading in our input . input next grade
			total = total + grade; // add grade to total
			gradeCounter = gradeCounter + 1; //increment the counter by 1
		}
		
		int average = total /10; //integer division
		
		System.out.printf("%n Total of all 10 grades is %d %n", total);
		System.out.printf("%n Class average is %d %n", average);
	}

}
