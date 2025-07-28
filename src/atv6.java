import java.util.Scanner;
public class atv6 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int sexo = 0;
        float masculino = 0;
        float feminino = 0;

        int corOlho = 0;
        int olhoAzul = 0;
        int olhoVerde = 0;
        int olhoCastanho = 0;

        int corCabelo = 0;
        int cabeloLoiro = 0;
        int cabeloCastanho = 0;
        int cabeloPreto = 0;

        int idade = 0;
        float mediaIdade = 0;

        float altura = 0;
        float mediaAltura = 0;

        float peso = 0;
        float mediaPeso = 0;

        int perguntaFinal = 0;
        int contagemPessoas = 0;


        do {

            System.out.println("Qual o seu sexo?");
            System.out.println("1 - Masculino");
            System.out.println("2 - Feminino");
            sexo = leia.nextInt();

            switch(sexo) {
                case 1:
                    masculino ++;
                    break;
                case 2:
                    feminino ++;
                    break;
            }

            System.out.println("Digite a cor dos seus olhos: ");
            System.out.println("1 - Azuis");
            System.out.println("2 - Verdes");
            System.out.println("3 - Castanhos");
            corOlho = leia.nextInt();

            switch(corOlho) {
                case 1:
                    olhoAzul ++;
                    break;
                case 2:
                    olhoVerde ++;
                    break;
                case 3:
                    olhoCastanho ++;
                    break;
            }

            System.out.println("Digite a cor dos seus cabelos: ");
            System.out.println("1 - Loiros");
            System.out.println("2 - Castanhos");
            System.out.println("3 - Pretos");
            corCabelo = leia.nextInt();

            switch(corCabelo) {
                case 1:
                    cabeloLoiro ++;
                    break;
                case 2:
                    cabeloCastanho ++;
                    break;
                case 3:
                    cabeloPreto ++;
                    break;
            }

            System.out.println("Qual a sua idade?");
            idade = leia.nextInt();
            mediaIdade = mediaIdade + idade;

            System.out.println("Qual a sua altura?");
            altura = leia.nextFloat();
            mediaAltura = mediaAltura + altura;

            System.out.println("Qual o seu peso?");
            peso = leia.nextFloat();
            mediaPeso = mediaPeso +peso;

            System.out.println("Deseja refazer o programa?");
            System.out.println("1 - sim");
            System.out.println("2 - nao");
            perguntaFinal = leia.nextInt();

            contagemPessoas ++;
        }while(perguntaFinal==1);

        float mediaidade = mediaIdade/contagemPessoas;
        float mediaaltura = mediaAltura/contagemPessoas;
        float mediapeso = mediaPeso/contagemPessoas;
        float porcentagemFeminino = (feminino/contagemPessoas)*100;
        float porcentagemMasculino = -1 *(-1 * (100 - porcentagemFeminino));

        System.out.println("Media de idade dos participantes e de "+ mediaidade);
        System.out.println("Media do peso dos participantes sao "+mediapeso);
        System.out.println("A media de altura dos participantes e de "+mediaaltura);
        System.out.println("A porcentagem de pessoas do sexo feminino e de "+ porcentagemFeminino);
        System.out.println("A porcentagem de pessoas do sexo masculino e de "+porcentagemMasculino);
        System.out.println("A quantidade de pessoas quem tem olhos verdes são "+olhoVerde);
        System.out.println("A quantidade de pessoas quem tem cabelos louros são de "+cabeloLoiro);


    }

}