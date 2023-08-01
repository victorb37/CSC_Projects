import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String string = "";
		boolean bool = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Starting game. Enter Quit to stop playing.");
		
		while(bool == true) {
			
			System.out.print("\nEnter a string that you would like reversed: ");
			string = input.next().toUpperCase();
			
			if(string.equals("QUIT")) {
				bool = false;
				return;
			}
			
			System.out.println("You entered ---> " + string);
			
			System.out.print("Reversed String ---> ");
			for(int i = string.length() - 1; i>=0; i--) {
				System.out.print(string.charAt(i));
			}
			
			System.out.println();
			
		}
		
		input.close();

	}

}
