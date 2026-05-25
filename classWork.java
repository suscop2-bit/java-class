import java.util.Scanner;
public class classWork {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
			//NUMBER 1
			
			System.out.print("what is your name ");
			String name = scanner.nextLine();
			
			System.out.print("what is your age ");
			int age = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("what is your address ");
			String address = scanner.nextLine();
			
			System.out.print("Your name is " + name + " you are " + age + "years old " + "and you live at: " + address);
			
			System.out.println("");
			System.out.println("");
			
			//NUMBER 2
			double num1, num2, num3, num4, num5;
			double sum, average, product;
			
			
			System.out.print("enter a number ");
			num1 = scanner.nextInt();
			System.out.print("enter a number ");
			num2 = scanner.nextInt();
			System.out.print("enter a number ");
			num3 = scanner.nextInt();
			System.out.print("enter a number ");
			num4 = scanner.nextInt();
			System.out.print("enter a number ");
			num5 = scanner.nextInt();
			
			sum = num1 + num2 + num3 + num4 + num5;
			average = sum / 5;
			product = num1 * num2 * num3 * num4 * num5;
			
			System.out.println("sum: " + sum);
			System.out.println("average: " + average);
			System.out.println("product: " + product);
			System.out.println("");
			//NUMBER 3
			
			System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
        
			boolean isEven = (number % 2 == 0);
        
			System.out.println(isEven);

		
		scanner.close();

	
	
	}
}