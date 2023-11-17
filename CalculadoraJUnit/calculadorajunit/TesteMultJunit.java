package calculadorajunit;

import JUnitCalculadora.Multiplicacao;
import org.junit.Test;
import static org.junit.Assert.*;

// @author Antonio
// @version 1.2
// @since Release 1.2 - 15/11/2023

public class TesteMultJunit { // classe TesteJunit é responsável por testar a funcionalidade da classe
                              // Multiplicacao (que implementa a operação de multiplicar) utilizando o
                              // framework JUnit.

    // O projeto CalculadoraJUnit implementa testes JUnit para a operação de
    // Multiplicação em
    // uma calculadora.
    @Test
    public static void main(String[] args) { // O método main é o ponto de entrada da aplicação de teste. Ele cria um
        // objeto da classe Multiplicacao, chama o método multiplicacao para realizar
        // operações
        // de multiplicação e verifica os resultados utilizando as asserções JUnit.

        System.out.println("Calculadora Junit");

        Multiplicacao multiplicacao = new Multiplicacao();
        // chama o metódo de multiplicação criado na classe Multiplicacao
        int resultado = multiplicacao.multi(4, 4);

        // param num1 (int): O primeiro número.
        // param num2 (int): O segundo número.

        assertEquals(16, resultado);
        System.out.println(resultado);

        int resultado2 = multiplicacao.multi(1, 10);
        assertEquals(10, resultado2);
        System.out.println(resultado2);

        int resultado3 = multiplicacao.multi(9, 8);
        assertEquals(72, resultado3);
        System.out.println(resultado3);

        // Utiliza as asserções JUnit (assertEquals) para verificar se os resultados
        // esperados são iguais aos resultados obtidos.

    }
}