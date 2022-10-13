import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor do produto: ");
        double valor;
        valor = leitor.nextDouble();

        List<Double> valores= Arrays.asList(1.0,0.5,0.25,0.10,0.05,0.01);
        double total = 0;
        int num;

        for (int i=0; i<6; i++ ) {
            System.out.println("COLOQUE O NUMERO DE MOEDAS DE  ".replace("O","A") + valores.get(i)) ;
            num = leitor.nextInt();
            total = (valores.get(i) * num) + total;
        }

        double diferenca = valor - total;
        if (diferenca > 0) {
            System.out.println("FALTA TANTOS REAIS " + diferenca + " PARA REALIZAR A COMPRA:");
        } else if (diferenca == 0 || diferenca < 0) {
            System.out.println("É POSSÍVEL REALIZAR A COMPRA");
        }
        System.out.println("VOCE POSSUI UM TOTAL DE: " + total);


    }
}



