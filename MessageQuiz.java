import java.util.Scanner;

public class MessageQuiz{

	public static void main(String[] args){
	
		char answer = 'Y';
		Scanner keyboard = new Scanner(System.in);
		
		
			while(answer != 'N'){
				System.out.println("Do you want me to print this message again?");
				System.out.println("Press Y for yes or N for no");
				answer = keyboard.next().charAt(0);
			
			}
	}
}