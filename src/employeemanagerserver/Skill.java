package employeemanagerserver;

public class Skill
{
	String name;
	String descrption;
	double rate;

	public Skill(String name, String descrption)
	{
		this.name = name;
		this.descrption = descrption;
	}

	public String getName()
	{
		return name;
	}

	public String getDescrption()
	{
		return descrption;
	}

	public double getRate()
	{
		return rate;
	}

}
