package exercise1;

public abstract class Employee {

	protected String name;

	protected int Sales =0;

	protected int workedHours=0;


	public Employee()
	{

	}


	public int computeSalary() {
		return 0;
	}

	public void sell() { }

	public void workOneHour() { }

	public String getName() {
		return this.name;
	}
}

