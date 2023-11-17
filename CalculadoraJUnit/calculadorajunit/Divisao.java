package calculadorajunit;

//Classe de Divisão.
public class Divisao { // A classe Divisao contém métodos relacionados à operação de divisão entre dois
                       // números.
    // @author Antonio
    // @version 1.2
    // @since Release 1.2 - 15/11/2023
    public static double calcular(double num1, double num2) { // Este método realiza a operação de divisão entre dois
                                                              // números.
        // param num1 (double): O primeiro número.
        // param num2 (double): O segundo número.

        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;
            // Verifica se num2 é igual a zero.
            // Se verdadeiro, exibe uma mensagem de erro ("Erro: Divisão por zero.") e
            // retorna Double.NaN (Not a Number).
            // Se falso, realiza a operação de divisão entre num1 e num2 e retorna o
            // resultado.
        }
        return num1 / num2; // Resultado
    }

    public int div(int i, int j) {
        return 0;
    }
}
