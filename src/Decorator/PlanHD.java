package Decorator;

public class PlanHD extends PlanDecorator{
    public PlanHD(Plan plan) {
        super(plan);
    }

    @Override
    public String nombrePlan() {
        return super.nombrePlan()+" + HD ";
    }

    @Override
    public double precio() {
        return super.precio()+500.0;
    }
}

