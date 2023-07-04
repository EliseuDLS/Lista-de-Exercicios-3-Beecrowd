//Exercício do beecrowd "Og", comentado
import java.util.Scanner;
public class Exercicio_Beecrowd_Og {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //Declaração das variáveis
        int l = 0;
        int r = 0; 
        int totalFilhosEFilhas = 0;

        //Loop principal do programa
        while (true){
            //Chama o método lerL que lê o valor de l 
            l = lerL(l);
            
            //Chama o método lerR que lê o valor de r
            r = lerR(r);

            //Se l e r forem iguais a 0 o programa encerra
            if (l == 0 && r == 0){
                break;
            }

            //Chama o método contarFilhos que calcula o total de filhos e filhas
            totalFilhosEFilhas = contarFilhos(l, r);
            
            //Chama o método imprimirFilhos que imprime o total de filhos e filhas
            imprimirFilhos(totalFilhosEFilhas);
        }
    }

    //Método para ler o valor de l
    public static int lerL(int l){
        l = LER.nextInt();

        return l;
    }

    //Método para ler o valor de r
    public static int lerR(int r){
        r = LER.nextInt();

        return r;
    }

    //Método para calcular o total de filhos e filhas
    public static int contarFilhos(int l, int r){
        int totalFilhosEFilhas = 0;
        
        totalFilhosEFilhas = l + r;

        return totalFilhosEFilhas;
    }

    //Método para imprimir o total de filhos e filhas
    public static void imprimirFilhos(int totalFilhosEFilhas){

        System.out.println(totalFilhosEFilhas);
    }
}