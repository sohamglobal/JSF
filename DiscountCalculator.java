//sample managed bean
package mybeans;

public class DiscountCalculator 
{
	private double purchamt;
	private double discount;
	
	public DiscountCalculator()
	{
		purchamt=0.0;
		discount=0.0;
	}

	public double getPurchamt() {
		return purchamt;
	}

	public void setPurchamt(double purchamt) {
		this.purchamt = purchamt;
		calcDisc();
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	private void calcDisc()
	{
		discount=purchamt*10/100;
	}

}
