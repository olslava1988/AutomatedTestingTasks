import.java.util.Arrays
import.java.lang

public class Faculty{
	private String facultyName;
	
	public String getFacultyName() {
		return facultyName;
	}
	
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	
	public Faculty(String facultyName) {
		this.facultyName = facultyName;
	}
	
	private List<String> facultyNames = new ArrayList<>();

	public void addFacultyNames(String facultyName) {
		this.facultyNames.add(facultyName);
	}
	
	public List<String> getFacultyNames() {
		return facultyNames;
	}
}

public class Group extends Faculty{
	private String groupName;
	
	public String getGroupName() {
		return groupName;
	}
	
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	public Group(String groupName) {
		super(facultyName);
		this.groupName = groupName;
	}
	
	private List<String> groupNames = new ArrayList<>();

	public void addGroupNames(String groupName) {
		this.groupNames.add(groupName);
	}
	
	public List<String> getGroupNames() {
		return groupNames;
	}
}

public class Student extends Group{
	private String name;
	private String subject;
	private int mark;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public int getMark() {
		return mark;
	}
	
	public void setMark(int mark){
		this.mark = mark;
	}
	
	public Student(String name, String subject, int mark) {
		super(groupName);
		this.name = name;
		this.subject = subject;
		this.mark = mark;
	}
	
	private List<String> subjects = new ArrayList<>();

	public void addSubject(String subject) {
		this.subjects.add(subject);
	}
	
	public List<String> getSubjects() {
		return subjects;
	}
	
	private List<Integer> marks = new ArrayList<>();
	
	public void addMark(int mark) {
		this.marks.add(mark);
	}
	
	public List<Integer> getMarks() {
		return marks;
	}
}

public class AverageMark {
	
	int[] mark = new int[10];
	int subjects = 5;
	int sumOfMarks = 0;
	
	public static void main (String[] args) {
		for (int i = 0; i <= 10; i++) {
			int mark = (int) (Math.random()*11);
		}
		System.out.println(Arrays.toString(mark));
		
			for(int i = 0; i <= mark.length; i++) {
				sumOfMarks = sumOfMarks + mark[5];
			}
				double averageMark += 0;
				
			for (int i = 0; i <=5; i++){
			averageMark += sumOfMarks/5;
			}
			System.out.println(averageMark);
	}
}
		
public class AverageMarkOnSubject {
	
	int[] markOnSubject = new int[10];
	
	
	public static void main (String[] args) {
		for (int i = 0; i <= 10; i++) {
			int markOnSubject = (int) (Math.random()*11);
		}
		System.out.println(Arrays.toString(markOnSubject));
		
		double averageMarkOnSubject += 0;
		
		for (int i = 0; i <=10; i++){
			averageMarkOnSubject += markOnSubject[i];
			averageMarkOnSubject /= 11;
		}
		System.out.println(averageMarkOnSubject);
	}
}

public class AverageMarkForUniversity extends AverageMarkOnSubject{
	
	super(markOnSubject);
	int students = 1000;
	int sumOfMarks = 0;
	
	public static void main (String[] args) {
		for(int i = 0; i <= markOnSubject.length; i++) {
				sumOfMarks = sumOfMarks + markOnSubject[1];
			}
				double averageMarkForUniversity += 0;
				
			for (int i = 0; i <=5; i++){
			averageMarkForUniversity += sumOfMarks/1000;
			}
			System.out.println(averageMarkForUniversity);
	}
}

class ExceptionOfMark{ 
    
	public static void main(String args[]){ 
        try { 
            if (mark < 0 || mark > 10) 
        } catch (ArrayIndexOutOfBoundsException ae) { 
            System.out.println(ae);
        } 
    }
}

class ExceptionOfSubject{
	
	public static void main(String args[]){ 
        try { 
            if (subject = 0) 
        } catch (ArithmeticException e) { 
            System.out.println("Subjects are absent");
        } 
    }
}

class ExceptionOfAbsentStudents{
	
	public static void main(String args[]){ 
        try { 
            if (students = 0) 
		} catch (ArithmeticException e) { 
            System.out.println("Students are absent");
        } 
    }
}

class ExceptionOfGroupAbsenсe{
	
	public static void main(String args[]){ 
        try { 
            if (groupName = null) 
        } catch (IndexOutOfBoundsException ie) { 
            System.out.println(ie);
        } 
    }
}

class ExceptionOfFacultyAbsenсe{
	
	public static void main(String args[]){ 
        try { 
            if (facultyName = null) 
        } catch (IndexOutOfBoundsException ie) { 
            System.out.println(ie);
        } 
    }
}



   















