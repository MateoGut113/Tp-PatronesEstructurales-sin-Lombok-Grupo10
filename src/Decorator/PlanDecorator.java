package Decorator;

abstract class PlanDecorator implements Plan {
    protected Plan plan;

    public PlanDecorator(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String nombrePlan() {
        return plan.nombrePlan();
    }

    @Override
    public double precio() {
        return plan.precio();
    }

}
