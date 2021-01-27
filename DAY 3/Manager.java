
public class Manager extends EmployeeData{
	
	double foodallowance,managerallowance,otherallowance,man_gross_salary,man_net_salary;
	
	public Manager() {
		// TODO Auto-generated constructor stub
		foodallowance=10;
		managerallowance=10;
		otherallowance=100;
		//man_gross_salary=100;
		//man_net_salary=100;
	}
	public Manager( int empid, String ename, double baseSalary, double medical) 
	{
		super(empid,ename,baseSalary,medical);
		managerallowance=0.1*baseSalary;
		otherallowance=0.03*baseSalary;
		foodallowance=0.08*baseSalary;
	}
	
	/*
	 * public double get_foodallowance() { double food=0.08*baseSalary; return food;
	 * }
	 * 
	 * public double get_managerallowance() { double manage=0.1*baseSalary; return
	 * manage; } public double get_otherallowance() { double other=0.03*baseSalary;
	 * return other; }
	 */
	@Override
	public double Calc_gross_Salary() {
		// TODO Auto-generated method stub
		this.man_gross_salary=super.Calc_gross_Salary()+this.managerallowance+this.foodallowance+this.otherallowance;
		return this.man_gross_salary;
	}
	
	public void printData() {
		
		//super.printData();
		System.out.println("\n*********************************************");
		System.out.println("Manager Food allowance: " + managerallowance);
		System.out.println(" Manageral Allowance: " + foodallowance);
		System.out.println(" Other Allowance  : " + otherallowance);
		
		System.out.println("*********************************************");
		System.out.println("Manager Gross Salary: " + Calc_gross_Salary());
		System.out.println("Manager Net Salary: " + Calc_Net_Salary());
		System.out.println("*********************************************\n");
	}

}
