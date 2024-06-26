package services;

public class Subtraction implements CalculateInterface{

    @Override
    public void calculate(double a, double b) {
        System.out.println(a - b);
    }
}
