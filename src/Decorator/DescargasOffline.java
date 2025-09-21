package Decorator;

public class DescargasOffline extends PlanDecorator{
    public DescargasOffline(Plan plan) {
        super(plan);
    }

    @Override
    public String nombrePlan() {
        return super.nombrePlan() + " + descargas Offline";
    }

    @Override
    public double precio() {
        return super.precio() + 700.0;
    }
}
