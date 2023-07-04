//Exercício do beecrowd "Saldo do Vovô", comentado
import java.util.Scanner;
public class Exercicio_Beecrowd_SaldoDoVovo{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //Declaração das variáveis
        int i = 0;
        int n = 0;
        int saldoInicial = 0;
        int menorSaldo = 0; 
        int saldoAtual = 0;
        int movimentacao = 0;


        //Chama o método para ler o número de dias
        n = lerNumDias(n); 

        //Chama o método para ler o saldo inicial
        saldoInicial = lerSaldoInicial(saldoInicial);

        //Inicializa a variável menorSaldo com o valor do saldo inicial
        menorSaldo = saldoInicial; 

        //Inicializa a variável saldoAtual com o valor do saldo inicial
        saldoAtual = saldoInicial; 

        //Loop for que será executado N vezes, onde N é o número de dias do período de interesse
        for (i = 0; i < n; i++){

            //Chama o método para ler a movimentação do dia (depósito ou saque)
            movimentacao = lerMovimentacao(movimentacao); 

            //Atualiza o saldo atual somando a movimentação do dia
            saldoAtual += movimentacao; 

            //Atualiza o menor saldo se o saldo atual for menor
            if (saldoAtual < menorSaldo) {
                menorSaldo = saldoAtual; 
            }
        }

        //Chama o método que imprime o menor saldo registrado na conta
        imprimirMenorSaldo(menorSaldo);
    }

    //Método que lê o número de dias
    public static int lerNumDias(int n){

        // Valida se o número de dias está no intervalo válido (1 a 30)
        do {
            n = LER.nextInt(); 
        } while (n < 1 || n > 30); 

        return n; 
    }

    //Método que lê o saldo inicial
    public static int lerSaldoInicial(int saldoInicial){
        saldoInicial = LER.nextInt(); 

        return saldoInicial; 
    }

    //Método que lê a movimentação do dia (depósito ou saque)
    public static int lerMovimentacao(int movimentacao){
        movimentacao = LER.nextInt(); 

        return movimentacao; 
    }

    //Método que imprime o menor saldo registrado na conta
    public static void imprimirMenorSaldo(int menorSaldo){
        System.out.println(menorSaldo);
    }
}
