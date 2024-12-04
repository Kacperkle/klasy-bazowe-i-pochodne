public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    protected void displayInfo() {
        System.out.println("Pracownik: " + this.name);
        System.out.println("Wynagrodzenie: " + this.salary);
    }
}
