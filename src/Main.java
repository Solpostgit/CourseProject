import java.util.Arrays;

public class Main {

    public static double calcSalary(Employee[] arr) {
        double sumSalary = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSalary = sumSalary + arr[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + sumSalary);
        return sumSalary;
    }

    public static double minSalary(Employee[] arr) {
        double minSalary = 150000;
        for (int i = 0; i < arr.length - 1 && arr[i].getSalary() != 0; i++) {
            if (arr[i].getSalary() <= minSalary) {
                minSalary = arr[i].getSalary();
                System.out.println(arr[i]);
            }
        }
        System.out.println("Минимальная зарплата " + minSalary);
        return minSalary;
    }

    public static void main(String[] args) {

        Employee[] storage = new Employee[10]; //поле типа Employee[10]

        Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 3, 90000);
        Employee employee2 = new Employee("Petrov", "Petr", "Petrovich", 2, 100000);
        Employee employee3 = new Employee("Sidorov", "Denis", "Sergeevich", 4, 95000);
        Employee employee4 = new Employee("Ivanova", "Anna", "Borisovna", 1, 93000);
        Employee employee5 = new Employee("Svetlaya", "Irina", "Pavlovna", 5, 90000);
        Employee employee6 = new Employee("Borisov", "Maksim", "Alekseevich", 3, 97000);
        Employee employee7 = new Employee("Alekseev", "Sergey", "Nikolaevich", 1, 92000);
        Employee employee8 = new Employee("Maksimova", "Alla", "Nikolaevna", 2, 93000);
        Employee employee9 = new Employee("Nikolaeva", "Olga", "Anatolyevna", 4, 90000);
        Employee employee10 = new Employee("Denisov", "Pavel", "Ivanovich", 5, 97000);

        System.out.println();
        employee1.setDepartment(5); //меняем отдел, через сеттер
        employee1.setSalary(95000); //меняем зарплату, через сеттер
        System.out.println(employee1 + " //Изменили отдел и зарплату");

        storage[0] = employee1; //передаём созданные объекты Employee в каждый элемент хранилища storage
        storage[1] = employee2;
        storage[2] = employee3;
        storage[3] = employee4;
        storage[4] = employee5;
        storage[5] = employee6;
        storage[6] = employee7;
        storage[7] = employee8;
        storage[8] = employee9;
        storage[9] = employee10;

        System.out.println(Arrays.toString(storage)); //список сотрудников со всеми имеющимися данными

        calcSalary(storage); // метод сумма затрат на зарплаты в месяц

        minSalary(storage); // сотрудник с мин. зарплатой

        System.out.println(employee1.getSalary());


    }
}