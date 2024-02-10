package exercise1;

public class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	public Student( String name, int age )
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "Name: " + name + " | Age : " + age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public int compareTo( Student that)
	{
		if(this.age > that.age)
		{
			return 1;
		}
		if(this.age < that.age)
		{
			return -1;
		}
		return 0;
	
	}
	
	
}
