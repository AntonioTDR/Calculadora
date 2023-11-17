package calculadorajunit;

import JUnitCalculadora.Adicao;
import org.junit.Test;
import static org.junit.Assert.*;

// @author Antonio
// @version 1.2
// @since Release 1.2 - 15/11/2023

public class TesteSomaJunit { // classe TesteSomaJunit é responsável por testar a funcionalidade da classe
                              // Adicao (que implementa a operação de soma) utilizando o framework JUnit.

    // O projeto CalculadoraJUnit implementa testes JUnit para a operação de soma em
    // uma calculadora.
    @Test
    public static void main(String[] args) { // O método main é o ponto de entrada da aplicação de teste. Ele cria um
                                             // objeto da classe Adicao, chama o método soma para realizar operações de
                                             // soma e verifica os resultados utilizando as asserções JUnit.
        System.out.println("Calculadora Junit");

        Soma adicao = new Soma();
        // chama o metódo para fazer a adição criado na classe Soma
        int resultado = adicao.soma(9, 4);

        // param num1 (int): O primeiro número.
        // param num2 (int): O segundo número.

        assertEquals(10, resultado);
        System.out.println(resultado);

        int resultado2 = adicao.soma(5, 1);
        assertEquals(4, resultado2);
        System.out.println(resultado2);

        int resultado3 = adicao.soma(10, 17);
        assertEquals(27, resultado3);
        System.out.println(resultado3);

        // Utiliza as asserções JUnit (assertEquals) para verificar se os resultados
        // esperados são iguais aos resultados obtidos.
    }
}