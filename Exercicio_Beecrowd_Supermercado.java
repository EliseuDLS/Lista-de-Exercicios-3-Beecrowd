//Exercício do beecrowd "Supermercado", comentado
import java.util.Scanner;
public class Exercicio_Beecrowd_Supermercado {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //Declaração das variáveis
        int n = 0; 
        double preco = 0d;
        int gramas = 0; 
        double precoPorQuilo = 0d; 

        //Variável menorPreço inicia com o valor mais alto possível, pois se iniciar em 0 sempre vai ser o menor valor
        double menorPreco = Double.MAX_VALUE; 

        //Chama o método que lê o número de supermercados próximos
        n = lerN(n); 

        //Loop for onde cada iteração lê o preço da carne e a quantidade de gramas em um supermercado, calcula o preço por quilo e verifica se é o menor preço encontrado
        for (int i = 0; i < n; i++) {

            //Chama o método que lê o preço da carne
            preco = lerPreco(preco); 

            //Chama o método que lê a quantidade de gramas da carne
            gramas = lerGramas(gramas); 

            //Chama o método que calcula o preço por quilo
            precoPorQuilo = calcularPrecoPorQuilo(preco, gramas); 

            //Chama o método que verifica se o preço por quilo é o menor preço encontrado até o momento
            menorPreco = verificarMenorPreco(precoPorQuilo, menorPreco); 
        }

        //Chama o método que imprime o menor preço encontrado
        imprimirMenorPreco(menorPreco);
    }

    //Método que lê o número de supermercados próximos
    public static int lerN(int n){

        //Valida se n está no intervalo válido (1 a 100)
        do {
            n = LER.nextInt(); 
        } while (n < 1 || n > 100); 

        return n; 
    }

    //Método que lê o preço da carne
    public static double lerPreco(double preco){

        //Valida se preco está no intervalo válido (0 a 1000)
        do {
            preco = LER.nextDouble();
        } while (preco < 0 || preco > 1000.00); 

        return preco; 
    }

    //Método que lê a quantidade de gramas da carne
    public static int lerGramas(int gramas){

        //Valida se preco está no intervalo válido (1 a 1000)
        do {
            gramas = LER.nextInt(); 
        } while (gramas < 1 || gramas > 1000); 

        return gramas;
    }

    //Método que calcula o preço por quilo
    public static double calcularPrecoPorQuilo(double preco, int gramas){
        double precoPorQuilo = (preco * 1000) / gramas;

        return precoPorQuilo; 
    }

    //Método que verifica se o preço por quilo é o menor preço encontrado até o momento
    public static double verificarMenorPreco(double precoPorQuilo, double menorPreco){

        if (precoPorQuilo < menorPreco){ 
            menorPreco = precoPorQuilo; 
        }

        return menorPreco; 
    }

    //Método que imprime o menor preço encontrado com 2 casas decimais
    public static void imprimirMenorPreco(double menorPreco){
        System.out.printf("%.2f%n", menorPreco);
    }
}