/*
*super class Person
*/
class Person {
  /*
  *instance variables
  */
  String name;
  String email;
  Date birthDate

  /*
  *person constructor with a @param name
  */
  public Person(String name) {
    this.name = name;
  }

  /*
  *person constructor with @params name, email and birthDate
  */
  public Person(String name, String email Date birthDate) {
    this.name = name;
    this.email = email;
    this.birthDate = birthDate;
  }
}
