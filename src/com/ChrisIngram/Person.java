package com.ChrisIngram;

public abstract class Person {
  private String firstName;
  private String lastName;
  private int id;
  private int grade;

  public Person(String firstName, String lastName, int id, int grade) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.grade = grade;
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

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;

    if (id != person.id) return false;
    if (grade != person.grade) return false;
    if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
    return lastName != null ? lastName.equals(person.lastName) : person.lastName == null;
  }

  @Override
  public int hashCode() {
    int result = firstName != null ? firstName.hashCode() : 0;
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + id;
    result = 31 * result + grade;
    return result;
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", id=" + id +
        ", grade=" + grade +
        '}';
  }
}
