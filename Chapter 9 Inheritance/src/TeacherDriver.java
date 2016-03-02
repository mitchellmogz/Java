import java.util.Scanner;

public class TeacherDriver {

	public static void main(String[] args) {
		
			//I see right through you any hour
		int grammer;
		int spelling;
		int length;
		int content;
		int points;
		
			//you got to know
		GradedActivity grade = new GradedActivity();
		
			//ahhhhahhhahhahhaaa
		Scanner keyboard = new Scanner(System.in);
		
			//im currently getting abducted
		System.out.println(grade);
		
			//OHHH sometimes i get a good feeling
		System.out.println("\nPlease enter points earned for Grammer.");
		grammer = keyboard.nextInt();
		
			while (grammer > 30)
			{
				System.out.println("Only 30 possible points.");
				grammer = keyboard.nextInt();
			}
		
		System.out.println("Please enter points earned for Spelling.");
		spelling = keyboard.nextInt();
		
			while (spelling > 20)
		{
				System.out.println("Only 20 possible points.");
				spelling = keyboard.nextInt();
		}
		
		System.out.println("Please enter points earned for Correct Length.");
		length = keyboard.nextInt();

			while (length > 20)
		{
				System.out.println("Only 20 possible points.");
				length = keyboard.nextInt();
		}
		
		System.out.println("Please enter points earned for Content.");
		content = keyboard.nextInt();
		
			while (content > 30)
		{
				System.out.println("Only 30 possible points.");
				content = keyboard.nextInt();
		}
		
			//sail with me into the dark
		points = grammer + spelling + length + content;
		GradedActivity.setScore(points);
		
			//esolc
		keyboard.close();
		
			//object
		Essay paper = new Essay(grammer, spelling, length, content);
		
			//Action, Thriller
		System.out.println(paper);
		
		
		
		System.out.println(grade.getGrade());
		
	}

}
