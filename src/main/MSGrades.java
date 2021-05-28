package main;
import java.util.ArrayList;

public class MSGrades {

    String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    ArrayList<String> students = new ArrayList<String>();
    ArrayList<Integer> mathGrades = new ArrayList<Integer>();
    ArrayList<Integer>  scienceGrades = new ArrayList<Integer>();
    ArrayList<Integer> englishGrades = new ArrayList<Integer>();

    public MSGrades(){
        // Add some students and their grades to the array lists

    }
    public void addStudent(String name){
        this.students.add(name);
    }

    public static void main(String[] args) {
        // write your code here

    }
}
