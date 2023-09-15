import java.util.Arrays;

public class EmployeeBook {
    int count = 0;
    private Employee employee;

    private EmployeeBook(Employee employee) {

        this.employee = employee;
        count++;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    private employeeStorage (String surname, String name, String patronymic, int department, double salary) {
        Employee[] storage = new Employee[10]; //поле типа Employee[10]
    }

    private String toString() {
        return this.employee;
    }

    public static double calcSalary(Employee[] arr) {
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSalary = sumSalary + arr[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sumSalary);
        return sumSalary;
    }

    public static double minSalary(Employee[] arr) {
        int minIndex = 0;
        double minSalary = arr[0].getSalary();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getSalary() <= minSalary) {
                minSalary = arr[i].getSalary();
                minIndex = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой " + arr[minIndex]);
        return minSalary;
    }

    public static double maxSalary(Employee[] arr) {
        int maxIndex = 0;
        double maxSalary = arr[0].getSalary();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getSalary() >= maxSalary) {
                maxSalary = arr[i].getSalary();
                maxIndex = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой " + arr[maxIndex]);
        return maxSalary;
    }

    public static double midleSalary(Employee[] arr) {
        double sumSalary = 0;
        int index = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sumSalary = sumSalary + arr[i].getSalary();
        }
        double midleSalary = sumSalary / index;
        System.out.println("Среднее значение зарплат " + midleSalary);
        return midleSalary;
    }

    public static void listNames(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getSurname() + " " + arr[i].getName() + " " + arr[i].getPatronymic());
        }
    }

    public static void indexSalary(Employee[] arr, double index) {
        double indexSal = 0;
        for (int i = 0; i < arr.length; i++) {
            indexSal = arr[i].getSalary() * index;
            arr[i].setSalary(indexSal);
            System.out.println(arr[i]);
        }
    }

    public static void changeDepartment(Employee[] arr, int department, double indexSal) {
        int indexEmployeeDep = 0; //количество сотрудников в отделе
        int minIndex = 0;
        int maxIndex = 0;
        double minSal = 150000;
        double maxSal = 90000;
        double sumSalaryDep = 0; //сумма зарплат в отделе
        double midleSalaryDep = 0; //средняя зарплата в отделе
        double indexSalDep = 0; //индексированная зарплата
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                indexEmployeeDep++;
                if (arr[i].getSalary() <= minSal) { //сотрудник с мин зарплатой
                    minSal = arr[i].getSalary();
                    minIndex = i;
                }
                if (arr[i].getSalary() >= maxSal) { //сотрудник с макс зарплатой
                    maxSal = arr[i].getSalary();
                    maxIndex = i;
                }
                sumSalaryDep = sumSalaryDep + arr[i].getSalary(); //сумма зарплат на отдел
                midleSalaryDep = sumSalaryDep / indexEmployeeDep; //средняя зарплата по отделу

            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + department + " отделе " + arr[minIndex]);
        System.out.println("Сотрудник с максимальной зарплатой в " + department + " отделе " + arr[maxIndex]);
        System.out.println("Сумма затрат на зарплату по " + department + " отделу " + sumSalaryDep);
        System.out.println("Средняя зарплата по отделу " + midleSalaryDep);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                indexSalDep = arr[i].getSalary() * indexSal; //индексация зарплаты в отделе
                arr[i].setSalary(indexSalDep);
                System.out.println("Индексация зарплаты в отделе " + arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getDepartment() == department) {
                System.out.println("ID:" + arr[i].getId() + " " + arr[i].getSurname() + " " + arr[i].getName() + " " + arr[i].getPatronymic() + " " + arr[i].getSalary());
                //все сотрудники отдела
            }
        }
    }

    public static void choiceNumber(Employee[] arr, double indexSalary) {
        System.out.println("Зарплата меньше " + indexSalary);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() < indexSalary) { //зарплата меньше indexSalary
                System.out.println("ID:" + arr[i].getId() + " " + arr[i].getSurname() + " " + arr[i].getName() + " " + arr[i].getPatronymic() + " " + arr[i].getSalary());
            }
        }
        System.out.println("Зарплата больше " + indexSalary);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSalary() >= indexSalary) { //зарплата больше indexSalary
                System.out.println("ID:" + arr[i].getId() + " " + arr[i].getSurname() + " " + arr[i].getName() + " " + arr[i].getPatronymic() + " " + arr[i].getSalary());
            }
        }
    }

}
