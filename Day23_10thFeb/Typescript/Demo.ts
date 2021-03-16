class Employee{

    empid;
    ename;
    salary;

    constructor(empid,ename,salary)
    {
        this.empid=empid;
        this.ename=ename;
        this.salary=salary;
    }

    getEmp()
    {
        console.log("\n***EMployee Data***");
        return "\nID: "+this.empid+"\nName: "+this.ename+"\nSalary: "+this.salary+"\n "
    }
}

let e=new Employee(1,"Nik",333333);
console.log(e.getEmp());