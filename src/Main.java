public class Main {
    public static void main(String[] args) {

        FullName fullName1 = new FullName("Ivanov", "Ivan", "Ivanovich");
        FullName fullName2 = new FullName("Petrov", "Petr", "Petrovich");
        FullName fullName3 = new FullName("Sidorov", "Denis", "Sergeevich");
        FullName fullName4 = new FullName("Ivanova", "Anna", "Borisovna");
        FullName fullName5 = new FullName("Svetlaya", "Irina", "Pavlovna");

        Employee employee1 = new Employee(fullName1, 1, 90000);
        Employee employee2 = new Employee(fullName2, 2, 100000);
        Employee employee3 = new Employee(fullName3, 3, 95000);
        Employee employee4 = new Employee(fullName4, 4, 93000);
        Employee employee5 = new Employee(fullName5, 5, 95000);

        System.out.println(employee1);
    }
}