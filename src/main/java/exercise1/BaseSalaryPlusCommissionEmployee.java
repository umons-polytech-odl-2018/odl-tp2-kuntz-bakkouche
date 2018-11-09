package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee{

	private int baseSalary;
	private int comission;

	public  BaseSalaryPlusCommissionEmployee(String name, int baseSalary, int comission)
	{
		this.name = name;
		this.baseSalary = baseSalary;
		this.comission = comission;
	}

	public int computSalary (){
		return this.baseSalary +this.comission*this.workedHours;
	}

}
