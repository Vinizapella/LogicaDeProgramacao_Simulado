import java.util.Scanner;
public class atv3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        float numero = 0;
        int decisao =0;
        do{
            System.out.println("Digite um numero: ");
            numero = leia.nextFloat();
            if(numero <= 25){
                System.out.println("Seu numero é menor ou igual a 25");
            }else if(numero ==40){
                System.out.println("Seu numero é igual a 40");
            }else if(numero >=80){
                System.out.println("Seu numero é maior ou igual a 80 ");
            }else{
                System.out.println("Número errado");
            }
            System.out.println("Gostaria de tentar outro numero?");
            System.out.println("1 sim. 2 nao");
            decisao = leia.nextInt();
        }while(decisao == 1);
        System.out.println("Programa finalizado");
    }
}