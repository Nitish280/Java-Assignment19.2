import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
/*
 * here we are creating a program to Add all the student objects
 *  to an object of TreeSet and retrieving all the elements of
 *  the set using iterator.
 */
//here we are creating class which impliments comparable
public class StudentTree implements Comparable<StudentTree> {
	//here we are taking three different field for student class
	String name;

	int rollNo;

	String department;
	
	//here we are creating the constructor for studend class

	public StudentTree(String name, int rollNo, String department) {
		this.name = name;

		this.rollNo = rollNo;

		this.department = department;
	}
	
	//here we are using the getter and setter

	public String getname() {
		return name;

	}

	public void setname(String name) {
		this.name = name;

	}
	public void setname(int rollNo) {
		this.rollNo = rollNo;

	}

	public String getdepartment() {
		return department;

	}

	public void setdepartment(String department) {
		this.department = department;
	}
	@Override
	//here we are using tostring() to return the value of the object
	public String toString() {
		return name + ", " + rollNo + ", " + department;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method
		//here we are creating the TreeSet
		TreeSet<StudentTree> set = new TreeSet<StudentTree>();

		//here we are  Adding elements to TreeSet

		set.add(new StudentTree("Nitish", 12, "ECE"));

		set.add(new StudentTree("Vishal", 10, "EEE"));

		set.add(new StudentTree("Abhishek", 15, "Civil"));

		set.add(new StudentTree("Bhwani", 20, "IT"));

		set.add(new StudentTree("Vishwas", 52, "CS"));

		set.add(new StudentTree("Mithun", 31, "IT"));
		//here we are Iterating through TreeSet

		Iterator<StudentTree> it = set.iterator();

		while (it.hasNext()) {
			StudentTree student = (StudentTree) it.next();

			System.out.println(student);

		}
	}

	@Override
	//here we are creating the compare to method which is of return type
	public int compareTo(StudentTree s) {
		// TODO Auto-generated method stub
		//here we are apllying condition for comparing 
		//on the basis of roll no
		 if(rollNo>s.rollNo){  
		        return 1;  
		    }else if(rollNo<s.rollNo){  
		        return -1;  
		    }else{  
		    return 0;  
		    }  
		
	}
}
