package co.jottaDev;

public class Calculator {
     public static int calcNow(String Number1, String operation, String Number2){
         //convert
         int firstValue = Integer.parseInt(Number1);
         int secondValue = Integer.parseInt(Number2);
         int result = 0;
         switch(operation){
             case "+" -> result = firstValue + secondValue;
             case "-" -> result = firstValue - secondValue;
             case "*" -> result = firstValue * secondValue;
             case "/" -> result = firstValue / secondValue;
             default -> System.out.println("Você não inseriu uma operação válida");
         }
         return result;
     }

}
