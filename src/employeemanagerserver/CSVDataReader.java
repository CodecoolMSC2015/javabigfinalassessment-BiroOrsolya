package employeemanagerserver;

import java.util.List;
import java.util.Set;

public class CSVDataReader extends DataReader
{
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}

	public Set<Person> getPersons()
	{
		return null;
	}
}
