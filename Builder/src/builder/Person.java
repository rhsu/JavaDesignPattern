package builder;

public class Person
{
	private final String lastName;
	private final String firstName;
	private final String middleName;

	public Person(
		final String newLastName,
		final String newFirstName,
		final String newMiddleName)
	{
		this.lastName = newLastName;
		this.firstName = newFirstName;
		this.middleName = newMiddleName;
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s %s", firstName, middleName, lastName);
	}
	
	public static class PersonBuilder
	{
		private String nestedLastName;
		private String nestedFirstName;
		private String nestedMiddleName;

		public PersonBuilder lastName(String newLastName)
		{
			this.nestedLastName = newLastName;
			return this;
		}
		
		public PersonBuilder firstName(String newFirstName)
		{
			this.nestedFirstName = newFirstName;
			return this;
		}
		
		public PersonBuilder middleName(String newMiddleName)
		{
			this.nestedMiddleName = newMiddleName;
			return this;
		}
		
		public Person createPerson()
		{
			return new Person(nestedLastName, nestedFirstName, nestedMiddleName);
		}
	}
	
	public static void main(String[] args)
	{
		Person test = new PersonBuilder()
			.lastName("Carver")
			.firstName("George")
			.middleName("Washington")
			.createPerson();
		
		System.out.println(test);
	}
}
