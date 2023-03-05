package GAmeLeaction.Practic;

public class Main {
    
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "ivanov", 5);
        Student student2 = new Student("Ivan1", "ivanov1", 4);
        Student student3 = new Student("Ivan2", "ivanov2", 3);
        StudentGroup group1 = new StudentGroup();
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);

        StudentIterator iter = new StudentIterator(group1);
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        

    }

}
