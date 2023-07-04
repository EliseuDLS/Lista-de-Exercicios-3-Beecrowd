//Exercício do beecrowd "Tacógrafo", comentado
import java.util.Scanner;
public class Exercicio_Beecrowd_Tacografo {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //Declaração das variáveis
        int i = 0;
        int n = 0;
        int tempo = 0;
        int velocidadeMedia = 0;
        int distanciaPercorrida = 0;
        int distanciaTotal = 0;

        //Chama o método que lê a quantidade de intervalos de tempo
        n = lerN(n);

        //Loop for que lê os intervalos de tempo e calcula a distância percorrida em cada um
        for (i = 0; i < n; i++){
            tempo = lerTempo(tempo);
            velocidadeMedia = lerVelocidadeMedia(velocidadeMedia);

            //Chama o método que calcula a distância percorrida no intervalo de tempo atual
            distanciaPercorrida = calcularDistanciaPercorrida(tempo, velocidadeMedia);

            //Chama o método que adiciona a distância percorrida ao total
            distanciaTotal = calcularDistanciaTotal(distanciaTotal, distanciaPercorrida);
        }

        //Chama o método que imprime a distância total percorrida
        imprimirDistanciaTotalPercorrida(distanciaTotal);
    }

    //Método que lê a quantidade de intervalos de tempo registrados no tacógrafo
    public static int lerN(int n){

        //Valida se n está no intervalo válido (1 a 1000)
        do {
            n = LER.nextInt();
        } while (n < 1 || n > 1000);

        return n;
    }

    //Método que lê o tempo decorrido em um intervalo de tempo
    public static int lerTempo(int tempo){

        //Valida se tempo está no intervalo válido (1 a 100)
        do {
            tempo = LER.nextInt();
        } while (tempo < 1 || tempo > 100);

        return tempo;
    }

    //Método que lê a velocidade média em um intervalo de tempo
    public static int lerVelocidadeMedia(int velocidadeMedia){

        //Valida se velocidadeMedia está no intervalo válido (1 a 120)
        do {
            velocidadeMedia = LER.nextInt();
        } while (velocidadeMedia < 0 || velocidadeMedia > 120);

        return velocidadeMedia;
    }

    //Método que calcula a distância percorrida em um intervalo de tempo
    public static int calcularDistanciaPercorrida(int tempo, int velocidadeMedia){
        int distanciaPercorrida = tempo * velocidadeMedia;

        return distanciaPercorrida;
    }

    //Método que calcula a distância total percorrida somando a distância de um intervalo de tempo ao total
    public static int calcularDistanciaTotal(int distanciaTotal, int distanciaPercorrida){
        distanciaTotal += distanciaPercorrida;

        return distanciaTotal;
    }

    //Método que imprime a distância total percorrida
    public static void imprimirDistanciaTotalPercorrida(int distanciaTotal){

        System.out.println(distanciaTotal);
    }
}
