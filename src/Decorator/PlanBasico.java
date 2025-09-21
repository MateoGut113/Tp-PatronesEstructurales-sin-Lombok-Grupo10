package Decorator;

public class PlanBasico implements Plan {

    @Override
    public String nombrePlan() {
        return "Plan Basico";
    }

    @Override
    public double precio() {
        return 1000.0;
    }
}