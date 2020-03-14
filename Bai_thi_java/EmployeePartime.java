package src.Bai_thi_java;

public class EmployeePartime extends SalarypPolicy{
    private float rate;

    public EmployeePartime(float rate, float baseSalary){
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
