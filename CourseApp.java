/*
*imports
*/
import java.util.Date;
/*
*super class Person
*/
class Person {
  /*
  *instance variables
  */
  String name;
  String email;
  Date birthDate;

  /*
  *person constructor with a @param name
  */
  public Person(String name) {
    this.name = name;
  }

  /*
  *person constructor with @params name, email and birthDate
  */
  public Person(String name, String email, Date birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }

  /*
  * getters and setters for class Person instance variables
  */
  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public Date getBirthDate() {
    return this.birthDate;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setEmail(String newEmail) {
    this.email = newEmail;
  }

  public void setBirthDate(Date newBirthDate) {
    this.birthDate = newBirthDate;
  }

  /*
  *method toString which returns a Persons data;
  *the method coolects values from the getters and setters;
  *and concatenates them inti a String
  */
  public String toString() {
    return getName() + ", " + getEmail() + ", " + getBirthDate();
  }
}

/*
*class Student
*/
class Student {
  /*
  *instance variables
  */
  String regNo;
  String[] courses = new string[4];
  
}

/*
*main class CourseApp
*/
public class CourseApp{
  public static void main(String[] args) {

  }
}
