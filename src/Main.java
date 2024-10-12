import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("IDADE DE 10 PESSOAS");

        //
        Scanner leitorIdade = new Scanner(System.in);

        // VARIÁVEL PARA FAZER A CONTAGEM DO CONTADOR
        int contador = 0;

        // DECLARANDO A VARIÁVEL PARA COLETAR A MAIOR IDADE REGISTRADA
        int maiorIdade = 0;

        // DECLARANDO A VARIÁVEL PARA SOMARMOS AS PESSOAS ACIMA DE 18 ANOS
        int acimaDe18 = 0;

        // DECLARANDO A VARIÁVEL PARA PESSOAS COM MENOS DE 5 ANOS
        int menosDe5 = 0;

        // DECLARANDO A VARIÁVEL PARA SOMARMOS AS IDADES
        double somaIdade = 0;

        // ESTRUTURA DE REPETIÇÃO
        while (contador < 5){
            contador += 1;

            // COLETANDO OS DADOS DAS IDADES
            System.out.println("Informe a " + contador + "º idade: ");
            int idade = leitorIdade.nextInt();

            // CONDICIONAL PARA SABERMOS QUEM TEM A MAIOR IDADE
            if (idade > maiorIdade){
                maiorIdade = idade;
            }

            // CONDICIONAL PARA SABERMOS AS PESSOAS ACIMA DOS 18
            if (idade > 18){
                acimaDe18 += 1;
            }

            // CONDICIONAL PARA SABERMOS AS PESSOAS COM MENOS DE 5
            if (idade <= 5){
                menosDe5 += 1;
            }

            // SOMANDO TODAS AS IDADES
            somaIdade += idade;
        }

        //
        double calculoMediaIdade = (somaIdade)/5;

        // EXIBINDO NA TELA A MAIOR IDADE REGISTRADA
        System.out.println("A maior idade registrada foi: " + maiorIdade);

        // EXIBINDO NA TELA A QUANTIDADE DE PESSOAS ACIMA DOS 18
        System.out.println("A quantidade de pessoas acima dos 18 foi: " + acimaDe18);

        // EXIBINDO NA TELA A QUANTIDADE DE PESSOAS COM MENOS DE 5
        System.out.println("A quantidade de pessoas menos de 5 foi: " + menosDe5);

        // EXDIBINDO NA TELA A MÉDIA DAS IDADES
        System.out.printf("A média das 5 idade foi %.2f%n", somaIdade);

    }
}