//Classe de Divisão.
public class Divisao {

    public static double calcular(double num1, double num2) { //Lógica usada para Divisão.
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
