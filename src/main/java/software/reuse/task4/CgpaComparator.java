package software.reuse.task4;

import java.util.Comparator;

public class CgpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getCgpa(), a.getCgpa());
    }
}