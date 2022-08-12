import java.io.Console;
import java.util.Scanner;

public class main {

	static char cord;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ceiling Fan Options");
		System.out.println("Left Cord to change direction");
		System.out.println("Right cord to change speed.");
		
		do {
		cord = scanner.next().charAt(0);
		
		switch(cord) {
		  case 'l':
		    Direction.ChangeDirection();
		    break;
		  case 'r':
		    Speed.changeSpeed();
		    break;
		  default:
		    System.out.println("Invalid input received... Now exiting...");
			}
		}while(cord == 'l' || cord == 'r');
	}
	
	

}
