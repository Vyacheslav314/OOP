package GAmeLeaction.Practic;

import java.util.Iterator;
import java.util.List;

public class StudentIterator implements Iterator<Student> {
    
    private int count;
    private final List<Student> students;

    public StudentIterator(StudentGroup sGroup) {
        this.count = 0;
        this.students = sGroup.getGroupList();
    }


    @Override
    public boolean hasNext() {
        return count <= students.size() - 1;
    }

    @Override
    public Student next() {
        return students.get(count++);
    }

}
