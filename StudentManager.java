
package Inheritance;


public class StudentManager extends UserManager{
    
    
    public  void  DoHomework ( Student  student ) {
		      System.out.println(student.getFirstName()+" ödevini yaptı.");
	}
}
