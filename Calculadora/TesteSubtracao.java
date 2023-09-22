import java.util.Scanner;

public class TesteSubtracao { //Classe para testar "Subtração".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:"); //Digitar o primeiro numero.
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:"); //Digitar o segundo numero.
        double num2 = scanner.nextDouble();

        double resultado = Subtracao.calcular(num1, num2);
        System.out.println("Subtração: " + resultado);
        
        scanner.close();
    }
}
