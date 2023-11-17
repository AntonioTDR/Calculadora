package calculadorajunit;

import JUnitCalculadora.Subtracao;
import org.junit.Test;
import static org.junit.Assert.*;

// @author Antonio
// @version 1.2
// @since Release 1.2 - 15/11/2023

public class TesteSubtracaoJunit { // classe TesteSubJunit é responsável por testar a funcionalidade da classe
                                   // subtracao (que implementa a operação de subtrair) utilizando o framework
                                   // JUnit.

    // O projeto CalculadoraJUnit implementa testes JUnit para a operação de
    // subtração em
    // uma calculadora.
    @Test
    public static void main(String[] args) { // O método main é o ponto de entrada da aplicação de teste. Ele cria um
                                             // objeto da classe Subtracao, chama o método sub para realizar operações
                                             // de subtração e verifica os resultados utilizando as asserções JUnit.

        System.out.println("Calculadora Junit");

        Subtracao subtracao = new Subtracao();
        // chama o metódo de subtração criado na classe Subtracao
        int resultado = subtracao.sub(10, 2);

        // param num1 (int): O primeiro número.
        // param num2 (int): O segundo número.

        assertEquals(8, resultado);
        System.out.println(resultado);

        int resultado2 = subtracao.sub(20, 42);
        assertEquals(-22, resultado2);
        System.out.println(resultado2);

        int resultado3 = subtracao.sub(100, 20);
        assertEquals(70, resultado3);
        System.out.println(resultado3);

        // // Utiliza as asserções JUnit (assertEquals) para verificar se os resultados
        // esperados são iguais aos resultados obtidos.
    }
}