package software.reuse.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(103, 3.5));
        students.add(new Student(101, 3.2));
        students.add(new Student(102, 3.8));

        System.out.println("Original:");
        students.forEach(System.out::println);

        Collections.sort(students);
        System.out.println("\nSorted by rollNo (Comparable):");
        students.forEach(System.out::println);

        students.sort(new CgpaComparator());
        System.out.println("\nSorted by CGPA descending (Comparator):");
        students.forEach(System.out::println);
    }
}