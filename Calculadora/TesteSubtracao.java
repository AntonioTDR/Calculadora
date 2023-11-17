import java.util.Scanner;

public class TesteSubtracao { // A classe TesteSubtracao é utilizada para testar a funcionalidade da classe
                              // Subtracao, que realiza a operação de subtração entre dois números.

    // @author Antonio
    // @version 1.2
    // @since Release 1.2 - 15/11/2023

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ele solicita ao usuário que digite dois números, lê esses números usando a
        // classe Scanner, chama o método calcular da classe Subtracao para obter o
        // resultado da subtração e exibe o resultado na saída padrão.

        System.out.println("Digite o primeiro número:"); // Digitar o primeiro numero.
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:"); // Digitar o segundo numero.
        double num2 = scanner.nextDouble();

        double resultado = Subtracao.calcular(num1, num2); // Retornar e mostrar o resultado na tela.
        System.out.println("Subtração: " + resultado);

        scanner.close();
    }
}
