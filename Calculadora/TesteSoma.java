import java.util.Scanner;

public class TesteSoma { //Classe para testar "Soma".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:"); //Digitar o primeiro numero.
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:"); //Digitar o segundo numero.
        double num2 = scanner.nextDouble();

        double resultado = Soma.calcular(num1, num2);
        System.out.println("Soma: " + resultado);
        
        scanner.close();
    }
}
