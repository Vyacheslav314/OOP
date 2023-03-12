package Lection5_1;


public class Worker {
    

    private String name;
    private int salary;
    private boolean vacation;
    private short cabinet;
    private int phoneNumber;

    public Worker(String name, int salary, boolean vacation, short cabinet, int phoneNumber) {
        this.name = name;
        this.salary = salary;
    }

    public Worker(int salary) {
        this.salary = salary;
    }

    public Worker(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public boolean isVacation() {
        return vacation;
    }
    public void setVacation(boolean vacation) {
        this.vacation = vacation;
    }
    public short getCabinet() {
        return cabinet;
    }
    public void setCabinet(short cabinet) {
        this.cabinet = cabinet;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
