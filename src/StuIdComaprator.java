import java.util.Comparator;

public class StuIdComaprator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getsId()-o2.getsId();
    }
}
