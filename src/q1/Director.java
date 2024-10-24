package q1;

public class Director extends Supervisor{
    private double budget;

    public Director(String name, double wage, String division, double budget) {
        super(name, wage, division);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Name: " + super.toString() + ", Budget: " + budget;
    }
}
