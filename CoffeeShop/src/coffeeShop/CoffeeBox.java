/*
 * Name: Amirreza Mirzaei
 */
package coffeeShop;

public class CoffeeBox {
	private static long count = 0;
    private double weight;

    public CoffeeBox(double weight) {
    	// set the value of weight in the variable
    	this.weight = weight;
    	count++;
    }

    public String classifyBox(double targetWeight, double tolerance) {
    	String result;
    	//this is the condition used for checking if the logic is correct
    	if(weight<=(targetWeight+tolerance)&& weight>=(targetWeight-tolerance))
    	{
    		result="pass";
    	}
    	else {
    		result="fail";
    	}
    	return result;
    }
	public static long getCount() {
		return count;
	}
}
