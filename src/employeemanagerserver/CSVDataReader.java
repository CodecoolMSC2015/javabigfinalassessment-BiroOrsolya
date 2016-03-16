package employeemanagerserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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

	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner scanner = new Scanner(new File("C:\\Workspace\\Dojo\\src\\file\\persons.csv"));

		scanner.useDelimiter(",");

		while (scanner.hasNext())
		{
			System.out.print(scanner.next() + " ");
		}

		scanner.close();
	}
}
