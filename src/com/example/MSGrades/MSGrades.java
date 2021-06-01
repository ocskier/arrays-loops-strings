package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    ArrayList<String> students = new ArrayList<>();
    ArrayList<Integer> mathGrades = new ArrayList<>();
    ArrayList<Integer> scienceGrades = new ArrayList<>();
    ArrayList<Integer> englishGrades = new ArrayList<>();

    public MSGrades(){
        // Add some students and their grades to the array lists
        students.add("Joe Bob");
        students.add("Dorothy Jane");

        mathGrades.add(87);
        mathGrades.add(98);

        scienceGrades.add(76);
        scienceGrades.add(78);

        englishGrades.add(95);
        englishGrades.add(92);
    }

    public void printStudents(){
        for(String student:this.students){
            System.out.println(student);
        }
    }

    public void printStudentGrades(int studentIndex){
        System.out.println(this.students.get(studentIndex));
        System.out.println("Math: " + this.mathGrades.get(studentIndex));
        System.out.println("Science: " + this.scienceGrades.get(studentIndex));
        System.out.println("English: " + this.englishGrades.get(studentIndex));
    }

    public static void main(String[] args) {
        // write your code here
        MSGrades LRMSGrade8 = new MSGrades();
        System.out.println();
        System.out.println("Middle School Roster");
        System.out.println("====================");
        LRMSGrade8.printStudents();
        System.out.println();

        for (int i=0; i < LRMSGrade8.teachers.length; i++){
            String teacher = "Teacher: ".concat(LRMSGrade8.teachers[i]);
            System.out.println(teacher);
        }

        System.out.println("\nStudent Grades:\n");
        for (int i =0; i < LRMSGrade8.students.size(); i++){
            LRMSGrade8.printStudentGrades(i);
            System.out.println();
        }
    }
}
