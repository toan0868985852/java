package src.Bai_thi_java;

abstract public class SalarypPolicy {
    private float baseSalary;

    public SalarypPolicy(float baseSalary){
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "SalarypPolicy{" +
                "baseSalary=" + baseSalary +
                '}';
    }

    abstract public float getSalary();

}
