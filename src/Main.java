import co.jottaDev.Calculator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //instance scanner
        Scanner input = new Scanner(System.in);
        //instance the calculator
        Calculator calcular = new Calculator();

        System.out.println("Olá, bem vindo a sua calculadora Java, insira os dados." +
                "\n Pressione Enter.");
        input.nextLine();

        System.out.println("Digite um número: ");
        String firstNumber = input.nextLine();

        System.out.println("Digite outro número: ");
        String secondNumber = input.nextLine();

        System.out.println("Operação(+,-,*,/) : ");
        String operation = input.nextLine();

        System.out.println("Resultado : \n" +
                calcular.calcNow(firstNumber,operation,secondNumber));
    }
}