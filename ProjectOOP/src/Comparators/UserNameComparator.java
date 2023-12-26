package Comparators;

import java.util.Comparator;

import People.User;
public class UserNameComparator implements Comparator<User>{

	@Override
	public int compare(User o1, User o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
