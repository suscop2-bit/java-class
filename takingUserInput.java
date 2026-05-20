import java.util.Scanner;

public class takingUserInput {
    
    public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter your name: ");
		String name = scanner.nextLine();
		
		System.out.print("enter your age ");
		int age = scanner.nextInt();
		Scanner.nextLine();
		
		System.out.print("Are you a student? (true/false)");
		boolean student = scanner.nextBoolean();
		
		System.out.print("what is your gpa? ");
		double gpa = scanner.nextDouble();
		Scanner.nextLine();
		
		System.out.println(" ");
		System.out.println("your nane is " + name);
		System.out.println("you are " + age);
		System.out.println("you have a gpa of: " + gpa);
		System.out.println("student: " + student);
		
		if(student) {
			System.out.println("you are enrolled");
		}
		else {
			System.out.print("omo get out");
		}
		
		scanner.close();
		
    }
}






