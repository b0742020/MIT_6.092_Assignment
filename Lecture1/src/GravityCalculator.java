
public class GravityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gravity = -9.81;
		double initialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = .5*gravity*fallingTime*fallingTime;
		finalPosition = finalPosition+initialVelocity*fallingTime;
		finalPosition = finalPosition+initialPosition;
		
		
		System.out.println("The object's position after " + fallingTime + " seconds is " + finalPosition + " m");

	}

}
