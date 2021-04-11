public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Quang", 2000);



        Manager manager1 = new Manager("Thien", 1000, 500);
        manager1.display();
        System.out.println();

        employee1.display();
        System.out.println();

        System.out.println(manager1);
    }
}