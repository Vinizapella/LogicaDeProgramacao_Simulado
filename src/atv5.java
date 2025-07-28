import java.util.Scanner;
public class atv5 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade = 0;
        int pergunta = 0;
        float mediaIdade = 0;
        int pessoasOtimo = 0;
        int pessoasRegular = 0;
        int pessoasBom = 0;
        float porcentagemBom = 0;
        int contagem = 5;

        do {

            System.out.println("Digite a sua idade: ");
            idade = leia.nextInt();

            System.out.println("Qual a sua opiniao ao filme:");
            System.out.println("otimo - 3" );
            System.out.println("bom - 2");
            System.out.println("regular - 1");
            pergunta = leia.nextInt();

            switch(pergunta) {
                case 3:
                    pessoasOtimo ++;
                    mediaIdade = mediaIdade + idade;
                    break;
                case 1:
                    pessoasRegular++;
                    break;
                case 2:
                    pessoasBom ++;
                    porcentagemBom = pessoasBom;
                    break;
            }
            contagem --;

        }while(contagem>0);
        float mediaidade = mediaIdade/pessoasOtimo;
        float porcentagembom = ((porcentagemBom ) / 5) *100;

        System.out.println("A media das idades das pessoas que responderam otimo foi de "+mediaidade);
        System.out.println("A quantidade de pessoas que respondeu regular foi de "+pessoasRegular );
        System.out.println("A porcentagem de pessoas que respondeu bom entre todos os espectadores foi de "+porcentagembom);

    }
}