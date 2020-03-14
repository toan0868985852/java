package src.Bai_thi_java;

public class EmployeeFullTime extends SalarypPolicy{

    private float rate;

    public EmployeeFullTime(float rate, float baseSalary){
        super(baseSalary);
        this.rate = rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    @Override
    public float getSalary() {
        return rate * super.getBaseSalary();
    }

    @Override
    public String toString() {
        return "rate = "+ rate + "," + super.toString();
    }
}
