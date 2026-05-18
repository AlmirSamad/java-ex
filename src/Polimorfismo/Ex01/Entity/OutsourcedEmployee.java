package Polimorfismo.Ex01.Entity;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharger;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharger) {
        super(name, hour, valuePerHour);
        this.additionalCharger = additionalCharger;
    }

    public Double getAdditionalCharger() {
        return additionalCharger;
    }

    public void setAdditionalCharger(Double additionalCharger) {
        this.additionalCharger = additionalCharger;
    }

    @Override
    public Double payment(){
        return super.payment() + additionalCharger *1.1;
    }
}
