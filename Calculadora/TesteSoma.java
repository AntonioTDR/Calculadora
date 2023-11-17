import java.util.Scanner;

public class TesteSoma { // Classe para testar "Soma".
    // @author Antonio
    // @version 1.2
    // @since Release 1.2 - 15/11/2023
    public static void main(String[] args) {

        // Ele solicita ao usuário que digite dois números, chama o método calcular da
        // classe Divisao para obter o resultado da divisão e exibe o resultado na saída
        // padrão.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:"); // Digitar o primeiro numero.
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:"); // Digitar o segundo numero.
        double num2 = scanner.nextDouble();

        double resultado = Soma.calcular(num1, num2); // Retornar e mostrar o resultado na tela.
        System.out.println("Soma: " + resultado);

        scanner.close();
    }
}
