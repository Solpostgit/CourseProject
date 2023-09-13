public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivanov", "Ivan", "Ivanovich", 3, 90000);
        Employee employee2 = new Employee("Petrov", "Petr", "Petrovich", 2, 100000);
        Employee employee3 = new Employee("Sidorov", "Denis", "Sergeevich", 4, 95000);
        Employee employee4 = new Employee("Ivanova", "Anna", "Borisovna", 1, 93000);
        Employee employee5 = new Employee("Svetlaya", "Irina", "Pavlovna", 5, 95000);
        Employee employee6 = new Employee("Borisov", "Maksim", "Alekseevich", 3, 97000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);

        System.out.println();
        employee1.setDepartment(5); //меняем отдел, через сеттер
        employee1.setSalary(95000); //меняем зарплату, через сеттер
        System.out.println(employee1 + " //Изменили отдел и зарплату");

        /*Employee[] storage = new Employee[10];
        for (int element:storage) {
            System.out.println(Arrays.toString(storage));
        }*/
    }
}