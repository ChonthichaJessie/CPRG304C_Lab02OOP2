package exercise1;

import java.util.Comparator;

public class CompareByAgeThenName implements Comparator <Student>
{

	@Override
	public int compare(Student stud1, Student stud2) {
		int ageDecision = stud1.compareTo(stud2);

		if (ageDecision != 0) {
			return ageDecision;
		}

		// if same age, then compare by name
		return new CompareByName().compare(stud1, stud2);
	}
	
}

