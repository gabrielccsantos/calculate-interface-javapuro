package services;

public class CalculateService {
    private CalculateInterface calculateInterface;

    public CalculateService(CalculateInterface calculateInterface) {
        this.calculateInterface = calculateInterface;
    }
    public void calculateValues(double a, double b){
        calculateInterface.calculate(a, b);
    }
}
