
package Inheritance;

public class Instructor extends User{
    
      private String firstName;
    
      private String lastName;
      
      private int numberOfStudents;

    public Instructor(String firstName, String lastName, int numberOfStudents, int id, String email) {
        super(id, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfStudents = numberOfStudents;
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

  
      
      
}
