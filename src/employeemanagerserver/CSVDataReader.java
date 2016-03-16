package employeemanagerserver;

import java.util.Set;

public class CSVDataReader extends DataReader
{
	String csvFilePath;

	public CSVDataReader(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}

	public Set<Person> getPersons()
	{
		return null;
	}
}
