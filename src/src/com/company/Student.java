package com.company;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentNumber;


    private Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }

    private String getName() {
        return this.name;
    }

    private String getStudentNumber(){
        return this.studentNumber;
    }

    public String toString(){
        return this.getName() + " (" + this.getStudentNumber() + ")";
    }

        public static void main(String[] args) {
            ArrayList<Student> list = new ArrayList<Student>();

            while (true) {
                System.out.print("name: ");
                String inputName = Week1.StringReader();

                if (inputName.isEmpty()) {
                    System.out.println("");
                    break;
                }

                System.out.print("student number: ");
                String inputStudentNumber = Week1.StringReader();

                list.add(new Student(inputName, inputStudentNumber));
            }

            for (Student student : list) {
                System.out.println(student);
            }

            System.out.print("\nGive search term: ");
            String searchTerm = Week1.StringReader();
            System.out.println("Result: ");

            for (Student student : list) {
                if (student.getName().contains(searchTerm)){
                    System.out.println(student);
                }
            }
        }
}
