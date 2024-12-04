public class Director extends Manager {
    protected String department;

    public Director(String name, double salary, int teamSize, String department) {
        super(name, salary, teamSize);
        this.department = department;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Nazwa działu: " + this.department);
    }
}