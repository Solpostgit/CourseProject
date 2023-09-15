import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        EmployeeBook[] storage = new EmployeeBook[10]; //поле типа Employee[10]

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
        changeDepartment(storage, 3, 1.05); //выбираем отдел (3), индексируем зарплату на 5% (1,05)
        System.out.println();
        choiceNumber(storage, 104000); //повышенная сложность 3. зарплата меньше/больше indexSalary
        System.out.println();
    }
}