import java.util.Scanner;

public class atv7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double peso = 0.0;
        double soma_peso_time = 0.0;
        double peso_medio_time = 0.0;
        double soma_peso_total = 0.0;
        double peso_medio_total = 0.0;

        int idade = 0;
        int soma_idade_time =0;
        int idade_media_time = 0;
        int soma_idade_total = 0;
        int idade_media_total = 0;

        int total_jogadores_time = 0;
        int total_jogadores_total = 0;

        for(int i = 1; i <= 32; i++){
            for(int u = 1; u <= 26; u++){
                System.out.print("Insira o peso do jogador " + u + " (Time " + i +"): ");
                peso = sc.nextDouble();

                System.out.print("Insira a idade do jogador " + u + " (Time "+ i + "): ");
                idade = sc.nextInt();

                soma_peso_time+=peso;
                soma_idade_time+=idade;

                total_jogadores_time++;
            }
            peso_medio_time = soma_peso_time/total_jogadores_time;
            idade_media_time = soma_idade_time/total_jogadores_time;

            soma_idade_total = soma_idade_total + soma_idade_time;
            soma_peso_total = soma_peso_total + soma_peso_time;

            total_jogadores_total+=total_jogadores_time;

            System.out.println("\n== Peso médio dos jogadores do time " + i + ": " + peso_medio_time + "kg");
            System.out.println("== Idade média dos jogadores do time " + i + ": " + idade_media_time + " anos");
            System.out.println("\n==================================================\n");

        }
        idade_media_total = soma_idade_total/total_jogadores_total;
        peso_medio_total = soma_peso_total/total_jogadores_total;
        System.out.println("==================================================");
        System.out.printf(" - Peso médio de todos os participantes: %.2fkg%n",peso_medio_total);
        System.out.println(" - Idade média de todos os participantes: " + idade_media_total + " anos");
        sc.close();
    }

}


