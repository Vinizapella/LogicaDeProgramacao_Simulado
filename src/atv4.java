import java.util.Scanner;
public class atv4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int decisao = 0;
        float valorCompra = 0;
        int contagem = 1;
        float valorTotalAvista = 0;
        float valorTotalAprazo = 0;
        float prestacao = 0;
        float valorTotal = 0;

        do {
            System.out.println("Digite o valor da sua compra: ");
            valorCompra = leia.nextFloat();

            System.out.println("A loja utiliza um sistema de compras a vista e compras a prazo");
            System.out.println("1 se voce deseja rezalizar a transacao a vista");
            System.out.println("2 se voce desejar realizar a transacao a prazo");
            decisao = leia.nextInt();

            switch (decisao) {
                case 1:
                    valorTotalAvista = (valorCompra+valorCompra);
                    break;
                case 2:
                    valorTotalAprazo = (valorCompra+valorCompra);
                    prestacao = valorCompra / 3;
                    System.out.println("O valor da prestacao vai ficar "+prestacao);
                    break;

            }

            valorTotal = valorTotalAvista + valorTotalAprazo;

            contagem --;
        }while(contagem>0);
        System.out.println("O valor total das compras a vista sao "+valorTotalAvista);
        System.out.println("O valor total das compras a prazo sao "+valorTotalAprazo);
        System.out.println("O valor total de todas as compras foi de "+valorTotal);
    }

}
