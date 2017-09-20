package com.ChrisIngram;

import java.util.*;

public class Main {

  public static void main(String[] args) {

    List<Student> allStudents = new ArrayList<>();

    allStudents.add(new Student("mike", "jones", 1, 1));
    allStudents.add(new Student("Rolando", "Roberson", 2, 1));
    allStudents.add(new Student("Doyle", "King", 3, 1));
    allStudents.add(new Student("Tami", "Burton", 4, 1));
    allStudents.add(new Student("Billy", "Moody", 5, 1));
    allStudents.add(new Student("Bessie	", "Osborne", 6, 1));
    allStudents.add(new Student("Virgil", "Burke", 7, 1));
    allStudents.add(new Student("Kent", "Wilkerson", 8, 1));
    allStudents.add(new Student("Monique", "Duncan", 9, 1));
    allStudents.add(new Student("Sheila", "Garza", 10, 1));
    allStudents.add(new Student("Alberto", "Brewer", 11, 1));
    allStudents.add(new Student("Alan", "Spencer", 12, 1));
    allStudents.add(new Student("Guadalupe", "Andrews", 13, 1));
    allStudents.add(new Student("Barbara", "Rowe", 14, 1));
    allStudents.add(new Student("Jaime", "Harrison", 15, 1));


    List<Teacher> allTeachers = new ArrayList<>();

    allTeachers.add(new Teacher("Olga", "Baker", 101, 1));
    allTeachers.add(new Teacher("Bryan", "Wheeler", 102, 1));
    allTeachers.add(new Teacher("Marilyn", "Nash", 103, 1));

    Set<Student> firstGradeOne = new HashSet<>();
    Set<Student> firstGradeTwo = new HashSet<>();
    Set<Student> firstGradeThree = new HashSet<>();


    for (int i = 0; i < allStudents.size();){
      firstGradeOne.add(allStudents.get(i++));
      firstGradeTwo.add(allStudents.get(i++));
      firstGradeThree.add(allStudents.get(i++));
    }

    Map<Teacher,Set<Student>> firstGradeClasses = new HashMap();

    firstGradeClasses.put(allTeachers.get(0), firstGradeOne);
    firstGradeClasses.put(allTeachers.get(1), firstGradeTwo);
    firstGradeClasses.put(allTeachers.get(2), firstGradeThree);


  }


}
