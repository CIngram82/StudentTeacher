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
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", id=" + id +
        ", grade=" + grade +
        '}';
  }
}
