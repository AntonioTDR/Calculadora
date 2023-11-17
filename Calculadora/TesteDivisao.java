import java.util.Scanner;

public class TesteDivisao { // A classe TesteDivisao é responsável por testar a funcionalidade da classe
                            // Divisao, que realiza a operação de divisão entre dois números.

    // @author Antonio
    // @version 1.2
    // @since Release 1.2 - 15/11/2023

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ele solicita ao usuário que digite dois números, lê esses números usando a
        // classe Scanner, chama o método calcular da classe Divisao para obter o
        // resultado da divisão e exibe o resultado na saída padrão.

        System.out.println("Digite o primeiro número:"); // Digitar o primeiro numero.
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:"); // Digitar o segundo numero.
        double num2 = scanner.nextDouble();

        double resultado = Divisao.calcular(num1, num2); // Resultado da Divisão.
        System.out.println("Divisão: " + resultado);

        scanner.close();
    }
}