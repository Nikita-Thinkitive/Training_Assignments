
public class Employment {
	  
	
	
	
	public static void main(String[] args) {
		Marketing_Executive market=new Marketing_Executive();
		Manager manage=new Manager();
		EmployeeData emp=new EmployeeData();
		emp.printData();
		market.printData();
		manage.printData();
		
		EmployeeData arr[]= {emp,market,manage,new EmployeeData(1,"Kkk",30000,1300),new Manager(4, "ABHI", 1500, 1000),new Marketing_Executive()};
		
		for(EmployeeData data:arr)
		{
			System.out.println("\n\nArray:*****************************\n\n");
			data.printData();
		}
		
		
		
		
		//market.get_tourallowance();
	}

	
	
}
/*OUTPUT
 * ***Employee Details***
Employee Id: 1
Employee Name: Virat
Employee Basic Salary : 10000.0
Employee PT: 200
******************************************
Employee HRA: 5000.0
Employee PF: 1200.0
Employee Medical Insurance: 0.0
*********************************************
Employee Gross Salary: 15000.0
Employee Net Salary: 14800.0
Tour allowance: 25.0
Phone Allowance: 1500.0
*********************************************

*********************************************
Manager Food allowance: 10.0
 Manageral Allowance: 10.0
 Other Allowance  : 100.0
*********************************************
Manager Gross Salary: 15120.0
Manager Net Salary: 14920.0
*********************************************



Array:*****************************


***Employee Details***
Employee Id: 1
Employee Name: Virat
Employee Basic Salary : 10000.0
Employee PT: 200
******************************************
Employee HRA: 5000.0
Employee PF: 1200.0
Employee Medical Insurance: 0.0
*********************************************
Employee Gross Salary: 15000.0
Employee Net Salary: 14800.0


Array:*****************************


Tour allowance: 25.0
Phone Allowance: 1500.0
*********************************************


Array:*****************************



*********************************************
Manager Food allowance: 10.0
 Manageral Allowance: 10.0
 Other Allowance  : 100.0
*********************************************
Manager Gross Salary: 15120.0
Manager Net Salary: 14920.0
*********************************************



Array:*****************************


***Employee Details***
Employee Id: 1
Employee Name: Kkk
Employee Basic Salary : 30000.0
Employee PT: 200
******************************************
Employee HRA: 15000.0
Employee PF: 3600.0
Employee Medical Insurance: 1300.0
*********************************************
Employee Gross Salary: 46300.0
Employee Net Salary: 46100.0


Array:*****************************



*********************************************
Manager Food allowance: 150.0
 Manageral Allowance: 120.0
 Other Allowance  : 45.0
*********************************************
Manager Gross Salary: 3565.0
Manager Net Salary: 3365.0
*********************************************



Array:*****************************


Tour allowance: 25.0
Phone Allowance: 1500.0
*********************************************

 * */
