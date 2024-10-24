package q1;

public class Supervisor  extends Worker{
    private String division;

    public Supervisor(String name, double wage, String division) {
        super(name, wage);
        this.division = division;
    }

    @Override
    public String toString() {
        return "Name: " + super.toString() + ", Division: " + division;
    }
}
