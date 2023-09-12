public class Main {
    public static void main(String[] args) {

        FullName fullName1 = new FullName("Ivanov", "Ivan", "Ivanovich");
        FullName fullName2 = new FullName("Petrov", "Petr", "Petrovich");
        FullName fullName3 = new FullName("Sidorov", "Denis", "Sergeevich");
        FullName fullName4 = new FullName("Ivanova", "Anna", "Borisovna");
        FullName fullName5 = new FullName("Svetlaya", "Irina", "Pavlovna");

        Employee employee1 = new Employee(fullName1, 3, 90000);
        Employee employee2 = new Employee(fullName2, 2, 100000);
        Employee employee3 = new Employee(fullName3, 4, 95000);
        Employee employee4 = new Employee(fullName4, 1, 93000);
        Employee employee5 = new Employee(fullName5, 5, 95000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);

        employee1.setDepartment(5); //меняем отдел, через сеттер
        employee1.setSalary(95000); //меняем зарплату, через сеттер

        System.out.println(employee1);

        Employee[] storage = new Employee[10];
        for (int element:storage) {
            System.out.println(Arrays.toString(storage));
        }
    }
}