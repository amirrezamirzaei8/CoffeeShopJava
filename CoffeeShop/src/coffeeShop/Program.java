/*
 * Name: Amirreza Mirzaei
 */
package coffeeShop;

public class Program {

	public static void main(String[] args) {
        double targetWeight = User.inputDouble("Enter the target weight: ");
        double tolerance = User.inputDouble("Enter the tolerance: ");
        Roastery roastery = new Roastery(targetWeight, tolerance);
        roastery.assessCoffeeBoxes();
        roastery.createReport();
		System.out.println("Program by Amirreza Mirzaei");
		
	}

}
