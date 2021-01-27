
public class Marketing_Executive extends EmployeeData{
	double tourallowance,phoneallowance;
	int kms_travell;
	public Marketing_Executive() {
		// TODO Auto-generated constructor stub
		tourallowance=5;
		phoneallowance=1500;
	}
	public double get_tourallowance()
	{
		double tour=5;
		tour=tour*tourallowance;
		return tour;
	}

	public void printData() {
		
		//super.printData();
		System.out.println("Tour allowance: " + get_tourallowance());
		System.out.println("Phone Allowance: " + phoneallowance);
		
		
		System.out.println("*********************************************");
		
	}

}
