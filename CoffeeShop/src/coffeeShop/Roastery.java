/*
 * Name: Amirreza Mirzaei
 */
package coffeeShop;

public class Roastery {

    private int totalPassed = 0;
    private double totalWeightPassed = 0;
    private final double targetWeight;
    private final double tolerance;
    
    
    public Roastery(double targetWeight, double tolerance) {
    	this.targetWeight = targetWeight;
    	this.tolerance = tolerance;
    }

    public void assessCoffeeBoxes() {
    	boolean condition = true;
    	String choice = "yes";
    	double weight;
    	CoffeeBox coffeeBox;
    	String result;
    	// implement a loop to read the weight from the user and check whether it is tolerable
    	// you need to keep track of passed (not failed) coffee boxes count and sum of their weight
       	while(condition) {
    		weight = User.inputDouble("Enter the weight of the coffee box: ");
    		coffeeBox = new CoffeeBox(weight);
    		result = coffeeBox.classifyBox(targetWeight, tolerance);
    		System.out.println("Classification " + result);
    		
    		//condition to check if the classification passed or not
			if(result.equals("pass")) {
				totalPassed= totalPassed + 1;
				totalWeightPassed = totalWeightPassed + weight;
				choice= User.inputString("Do you want to access another coffee box?(yes/no):");
			}
			else {
				choice= User.inputString("Do you want to access another coffee box?(yes/no):");
			}
			
			// condition to stop the loop if the user inputs no
			if(choice.equals("no")) {
					condition=false;
			
		}
		}}
    public void createReport() {
        System.out.println("Total coffee boxes assessed: " + CoffeeBox.getCount());
        System.out.println("Number of coffee boxes passed: " + totalPassed);
        System.out.println("Number of coffee boxes failed: " + (CoffeeBox.getCount() - totalPassed));
        System.out.println("Total weight of passed coffee boxes: " + totalWeightPassed);
        System.out.println("Average weight of passed coffee boxes: " + (totalWeightPassed / totalPassed));
    }
}
