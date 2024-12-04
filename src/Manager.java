public class Manager extends Employee {
    protected int teamSize;

    // Konstruktor przyjmujący wszystkie pola
    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    // Przeciążony konstruktor
    public Manager(String name, double salary) {
        super(name, salary);
        this.teamSize = 0;
    }

    protected void displayInfo() {
        super.displayInfo();
        System.out.println("Liczba osób w zespole: " + this.teamSize);
    }
}
