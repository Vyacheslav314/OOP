package GAmeLeaction.Practic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    
    private List<Student> group = new ArrayList<>();

    public void addStudent(Student student) {
        this.group.add(student);
    }

    public List<Student> getGroupList() {
        return group;
    }

    public void setStudentGroup(List<Student> gList) {
        this.group = gList;
    }


    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(this);
    }

    

}
