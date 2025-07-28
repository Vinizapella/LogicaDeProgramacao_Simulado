import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int sexoMasculino = 0;
        int sexoFeminino = 0;
        int contagem = 56;
        do{
            System.out.println("Digite o seu nome: ");
            String nome = leia.next();
            System.out.println("Digite o seu sexo: ");
            System.out.println("1 para o sexo masculino");
            System.out.println("2 para o sexo feminino");
            int sexo = leia.nextInt();
            if (sexo == 1){
                sexoMasculino ++;
            }else{
                sexoFeminino ++;
            } contagem--;
        }while(contagem>0);
        System.out.println("O total de homens são"+sexoMasculino);
        System.out.println("O total de mulheres são"+sexoFeminino);

    }
}
