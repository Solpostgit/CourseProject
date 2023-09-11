public class Employee {
    public static int count = 1;
    private int id;
    FullName fullName;
    private int department;
    private int salary;

    public Employee(int id, FullName fullName, int department, int salary) {
        this.id = count;
        count++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
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
        return "ID " + this.id + this.fullName + " Отдел " + this.department + " Зарплата " + this.salary;
    }
}
