public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jan Kowalski", 4000);
        employee.displayInfo();
        System.out.println();

        Manager manager = new Manager("Anna Nowak", 7000, 10);
        manager.displayInfo();
        System.out.println();

        Manager managerWithDefaultTeamSize = new Manager("Tomasz Nowak", 5000);
        managerWithDefaultTeamSize.displayInfo();
        System.out.println();

        Director director = new Director("Marek Wiśniewski", 12000, 20, "IT");
        director.displayInfo();
    }
}