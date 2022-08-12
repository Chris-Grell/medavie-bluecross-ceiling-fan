public class Speed {

	static int currentSpeed = 1;

	public static void changeSpeed() {
		
		if(currentSpeed < 3) {
			
			currentSpeed++;
			System.out.println("Setting fan speed to " + currentSpeed);
		}else {
			
			currentSpeed = 0;
			System.out.println("Turning fan off...");
			
		}
	}
	public static int getCurrentSpeed() {
		return currentSpeed;
	}

}
