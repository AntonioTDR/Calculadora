package calculadorajunit;

import JUnitCalculadora.Divisao;
import org.junit.Test;
import static org.junit.Assert.*;

// @author Antonio
// @version 1.2
// @since Release 1.2 - 15/11/2023

public class TesteDivJunit { // A classe TesteJUnitDiv é responsável por testar a funcionalidade da
                             // classe Divisao (que implementa a operação de divisão) utilizando o framework
                             // JUnit.

    // O projeto CalculadoraJUnit implementa testes JUnit para a operação de divisão
    // em uma calculadora virtual.
    @Test
    public static void main(String[] args) { // O método main é o ponto de entrada da aplicação de teste. Ele cria um
                                             // objeto da classe Divisao, chama o método divisao para realizar operações de
                                             // divisão e verifica os resultados utilizando as asserções JUnit.

        System.out.println("Calculadora Junit");

        Divisao divisao = new Divisao(); // Chama o método divisao para realizar a operação de divisão e armazena o
                                         // resultado em variáveis resultado, resultado2 e resultado3.

        int resultado = divisao.div(6, 2);
        // param num1 (int): O primeiro número.
        // param num2 (int): O segundo número.

        assertEquals(3, resultado);
        System.out.println(resultado);

        int resultado2 = divisao.div(15, 3);
        assertEquals(8, resultado2);
        System.out.println(resultado2);

        int resultado3 = divisao.div(50, 5);
        assertEquals(10, resultado3);
        System.out.println(resultado3);

        // Utiliza as asserções JUnit (assertEquals) para verificar se os resultados
        // esperados são iguais aos resultados obtidos.
    }
}