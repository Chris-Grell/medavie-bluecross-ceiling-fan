public class Direction {

	static String direction = "Clockwise";
	
	public static void ChangeDirection() {
		
		if(direction == "Clockwise") {
			
			direction = "Counter-Clockwise";
			
		}else {
			
			direction = "Clockwise";
			
		}
		
		System.out.println("The fan is now spinning " + direction);
	}
	public static String getDirection() {
		return direction;
	}
}
