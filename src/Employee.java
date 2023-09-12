public class Employee {
    static int count = 0;
    private int id;
    FullName fullName;
    private int department;
    private int salary;

    public Employee(FullName fullName, int department, int salary) {
        count++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    FullName getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID:" + this.id + " " + this.fullName + " Отдел " + this.department + " Зарплата " + this.salary;
    }
}
