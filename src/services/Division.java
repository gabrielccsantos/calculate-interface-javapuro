package services;

import exception.Demon0Exception;

public class Division implements CalculateInterface{

    @Override
    public void calculate(double a, double b){
        if(b <= 0){
            throw new Demon0Exception("Nao pode dividir por zero");
        }
        System.out.println(a / b);
    }
}
