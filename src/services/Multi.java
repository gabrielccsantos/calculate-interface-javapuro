package services;

public class Multi implements CalculateInterface{
    @Override
    public void calculate(double a, double b){
        System.out.println(a * b);
    }
}
