package Decorator;

public class PlanUltraHD extends PlanDecorator{
    public PlanUltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public String nombrePlan() {
        return super.nombrePlan() + " + Ultra HD ";
    }

    @Override
    public double precio() {
        return super.precio()+1000.0;
    }
}
