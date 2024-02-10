package exercise1;
import java.util.Comparator;

public class CompareByName implements Comparator <Student>
{

	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.getName().compareTo(stud2.getName());
	}
	
}
