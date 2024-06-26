package application;

import exception.Demon0Exception;
import services.*;

import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);
        CalculateService calc;
        int choice;


        do {
            System.out.println("Escolha uma opção para calcular: ");
            System.out.println("1 - Soma");
            System.out.println("2 - Substração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            choice = read.nextInt();

            System.out.println("Escolha o primeiro número: ");
            double number1 = read.nextDouble();
            System.out.println("Escolha o segundo número: ");
            double number2 = read.nextDouble();

            switch (choice){
                case 1:
                    calc = new CalculateService(new Sum());
                    calc.calculateValues(number1, number2);
                    break;
                case 2:
                    calc = new CalculateService(new Subtraction());
                    calc.calculateValues(number1, number2);
                    break;
                case 3:
                    calc = new CalculateService(new Multi());
                    calc.calculateValues(number1, number2);
                    break;
                case 4:
                    try{
                        calc = new CalculateService(new Division());
                        calc.calculateValues(number1, number2);
                    }catch (Demon0Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while (choice != 0);
    }
}