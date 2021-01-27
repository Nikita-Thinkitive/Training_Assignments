
public class EmployeeData {
	static int empid = 1;
	static int Pt = 200;
	String ename;
	double baseSalary, pf, Hrf, medical, gross_Salary, netsalary;

	

	public EmployeeData() // constructor
	{
		empid = 1;
		ename = "Virat";
		baseSalary = 10000;
		Pt = 200;

	}

	
	  public EmployeeData(int empid, String ename, double baseSalary, double medical) {// Parameterized Constructor { 
	  this.empid = empid; 
	  this.ename =ename;
this.baseSalary = baseSalary; 
this.medical = medical;
	 
	  }
	  
	  public EmployeeData(double pf, double Hrf) { 
		  this();
		  this.pf = pf; 
		  this.Hrf =Hrf;
	  
	  }
	  
	  public EmployeeData(double pf, double Hrf, double medical, double gross_Salary) { 
		  this(pf, Hrf); // constructor chaining 
		  this.medical =medical; 
	  this.gross_Salary = gross_Salary;
	  
	 }
	 

	public double Calc_Hrf() {
		double hrf = 0.5 * baseSalary;
		return hrf;
	}

	public double Calc_PF() {

		double pf = 0.12 * baseSalary;
		return pf;
	}

	public double Calc_gross_Salary() {
		double gross = baseSalary + Calc_Hrf() + medical;
		return gross;
	}

	public double Calc_Net_Salary() {
		double net = Calc_gross_Salary() - pf - Pt;
		return net;
	}

	public void printData() {
		System.out.println("***Employee Details***");
		System.out.println("Employee Id: " + empid);
		System.out.println("Employee Name: " + ename);
		System.out.println("Employee Basic Salary : " + baseSalary);
		System.out.println("Employee PT: " + EmployeeData.Pt);
		System.out.println("******************************************");
		System.out.println("Employee HRA: " + Calc_Hrf());
		System.out.println("Employee PF: " + Calc_PF());
		System.out.println("Employee Medical Insurance: " + medical);
		System.out.println("*********************************************");
		System.out.println("Employee Gross Salary: " + Calc_gross_Salary());
		System.out.println("Employee Net Salary: " + Calc_Net_Salary());
	}

}
