package GAmeLeaction.Practic;

import java.util.Objects;

public class Student {
    
    private String name;
    private String lastName;
    private float averageMark;


    public Student(String name, String lastname, float averageMark) {
        this.name = name;
        this.lastName = name;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAvergeMark(float averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Float.compare(student.averageMark, averageMark) == 0 && Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, averageMark);
    }

    @Override
    public String toString() {
        return "Student{ " +
        "name = " + name + "\n" +
        "lastname = " + lastName + "\n" +
        "averagemark = " + averageMark + "}\n" +
        "--------------";
    }

}
