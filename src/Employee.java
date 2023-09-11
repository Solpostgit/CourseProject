public class Employee {
    public static int count = 0;
    //int id;
    FullName fullName;
    private int department;
    private int salary;

    public Employee(FullName fullName, int department, int salary) {
        this.count = count + 1;
        //count++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }
    /*
    public int getCount() {
        return count;
    } */
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
        return this.fullName + " Отдел " + this.department + " Зарплата " + this.salary;
    }
}
