public class CarInsurancePolicy2 {
	
	private int policyNumber;
	private int numPayments;
	private String residentCity;
	
	//constructor that requires parameters for all three data fields
	public CarInsurancePolicy2(int num, int payments, String city){
		
		policyNumber=num;
		numPayments=payments;
		residentCity=city;
	}
	
	/*
	//a two-parameter constructor that requires only a policy number and the number of payments. 
	//This constructor assigns Mayfield to residentCity
	public CarInsurancePolicy2(int num, int payments){
		
		policyNumber=num;
		numPayments=payments;
		residentCity="Mayfield";
	}
	*/
	
	//passes the two parameters and one constant value to the three-parameter constructor:
	public CarInsurancePolicy2(int num, int payments){
		
		this(num, payments, "Mayfield");
	}
	
	
	//constructor that requires only a policy number parameter.
	//This constructor uses the default values
	/*
	public CarInsurancePolicy2(int num){
		
		policyNumber=num;
		numPayments=2;
		residentCity="Mayfield";
	}
	*/
	
	//passes the policy number and two constant values to the three-parameter constructor:
	public CarInsurancePolicy2(int num){
		
		this(num, 2, "Mayfield");
	}
	
	public void display() {
		
		System.out.println("Policy #" + policyNumber + ". "+ numPayments+ 
		" payments annualy. Driver resides in " + residentCity + ".");
	}
	
}