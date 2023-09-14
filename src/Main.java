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
                indexSalDep = arr[i].getSalary() * indexSal; //индексация зарплаты в отделе
                arr[i].setSalary(indexSalDep);
                System.out.println("Индексация зарплаты в отделе " + arr[i]);

            }
        }
        System.out.println("Сотрудник с минимальной зарплатой в " + department + " отделе " + arr[minIndex]);
        System.out.println("Сотрудник с максимальной зарплатой в " + department + " отделе " + arr[maxIndex]);
        System.out.println("Сумма затрат на зарплату по " + department + " отделу " + sumSalaryDep);
        System.out.println("Средняя зарплата по отделу " + midleSalaryDep);


    }

    public static void main(String[] args) {

        Employee[] storage = new Employee[10]; //поле типа Employee[10]

        Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 3, 91000);
        Employee employee2 = new Employee("Petrov", "Petr", "Petrovich", 2, 100000);
        Employee employee3 = new Employee("Sidorov", "Denis", "Sergeevich", 4, 95000);
        Employee employee4 = new Employee("Ivanova", "Anna", "Borisovna", 1, 93000);
        Employee employee5 = new Employee("Svetlaya", "Irina", "Pavlovna", 5, 90000);
        Employee employee6 = new Employee("Borisov", "Maksim", "Alekseevich", 3, 97000);
        Employee employee7 = new Employee("Alekseev", "Sergey", "Nikolaevich", 1, 92000);
        Employee employee8 = new Employee("Maksimova", "Alla", "Nikolaevna", 2, 94000);
        Employee employee9 = new Employee("Nikolaeva", "Olga", "Anatolyevna", 4, 91000);
        Employee employee10 = new Employee("Denisov", "Pavel", "Ivanovich", 3, 98000);

        System.out.println();
        employee1.setDepartment(5); //меняем отдел, через сеттер
        employee1.setSalary(95000); //меняем зарплату, через сеттер
        System.out.println(employee1 + " //Изменили отдел и зарплату");
        System.out.println();

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
        System.out.println();
        calcSalary(storage); // сумма затрат на зарплаты в месяц
        System.out.println();
        minSalary(storage); // сотрудник с мин. зарплатой
        System.out.println();
        maxSalary(storage); // сотрудник с макс. зарплатой
        System.out.println();
        midleSalary(storage); // среднее значение зарплат
        System.out.println();
        listNames(storage); // Ф.И.О всех сотрудников
        System.out.println();
        System.out.println("*** Повышенная сложность ***");
        System.out.println();
        indexSalary(storage, 1.1); //индексация зарплаты на 10%
        System.out.println();
        changeDepartment(storage, 3, 1.05); //выбираем отдел 3
        System.out.println();


        System.out.println(employee1.getSalary());


    }
}