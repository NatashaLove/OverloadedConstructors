public class CarInsurancePolicy {
	
	private int policyNumber;
	private int numPayments;
	private String residentCity;
	
	//constructor that requires parameters for all three data fields
	public CarInsurancePolicy(int num, int payments, String city){
		
		policyNumber=num;
		numPayments=payments;
		residentCity=city;
	}
	
	//a two-parameter constructor that requires only a policy number and the number of payments. 
	//This constructor assigns Mayfield to residentCity
	public CarInsurancePolicy(int num, int payments){
		
		policyNumber=num;
		numPayments=payments;
		residentCity="Mayfield";
	}
	
	//constructor that requires only a policy number parameter.
	//This constructor uses the default values
	public CarInsurancePolicy(int num){
		
		policyNumber=num;
		numPayments=2;
		residentCity="Mayfield";
	}
	
	public void display() {
		
		System.out.println("Policy #" + policyNumber + ". "+ numPayments+ 
		" payments annualy. Driver resides in " + residentCity + ".");
	}
	
}