import java.util.Scanner;
public class atv1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float numero = 0;
        int numeroContagem = 0;
        int numeroRodar = 80;
        do {
            System.out.println("Digite um numero: ");
            numero = leia.nextFloat();
            if(numero >= 10 && numero < 151 ) {
                numeroContagem++;
            }numeroRodar --;
        }while(numeroRodar>0);
        System.out.println("Os numeros que estao mo intervalo de 10 a 150 sao "+numeroContagem);
    }

}