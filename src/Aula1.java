 //Feito por Eduarda e Ellen
 
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) throws Exception {

          Scanner scanner = new Scanner(System.in);

        // Exercício 1
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }


        // Exercício 2
        System.out.println("Digite o 1° valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o 2° valor:");
        int valor2 = scanner.nextInt();

        if (valor1 == valor2) {
            System.out.println("Os valores são iguais! ");
        } else if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }


        // Exercício 3
        System.out.println("Calcular área do quadrado");
        System.out.println("calcular área do círculo");
        System.out.println("Escolha uma opção");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Digite o lado do quadrado");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Área do quadrado:" + areaQuadrado);
                break;
            case 2:
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.println("Área do círculo:" + areaCirculo);
                break;
            default:
                System.out.println("Opção inválida");
        }


        // Exercício 4
        System.out.println("Digite um número:");
        int nr = scanner.nextInt();
        for (int tabuada = 0; tabuada <= 103; tabuada++) {
            System.out.println(nr + " x " + tabuada + " = " + (nr * tabuada));
        }

        // Exercício 5
        System.out.println("Digite um número:");
        int vl = scanner.nextInt();
        if(vl % 2 == 0) {
            System.out.println("O número " + vl + " é par.");
        } else {
            System.out.println("O número " + vl + " é ímpar.");
        }
        
        // Exercício 6
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int fatorial = 1;
        for (int x = 1; x <= num; x++) {
            fatorial *= x;
            System.out.println("" + num + "! = " + fatorial);
        }


        // Exercício 7
        System.out.println("Digite idade");
        int idade = scanner.nextInt();
        if (idade < 18) {
            System.out.println("Menor de idade");
        } else if (idade < 60) {
            System.out.println("Adulta");
        } else {
            System.out.println("Idosa");
        }


        // Exercício 8
        System.out.println("Digite um número: ");
        int n_qtd = scanner.nextInt();
        int soma = 0;
        int numeroAtual = 1;
        int contador = 0;
        String nr_impar = "";
        while (contador < n_qtd) {
            soma += numeroAtual;
            nr_impar += numeroAtual;
            if (contador < n_qtd - 1) {
                nr_impar += " + ";
            }
            numeroAtual += 2;
            contador++;
        }
        System.out.println(n_qtd + " : " + nr_impar + " = " + soma);


        // Exercício 9
        scanner.nextLine();
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }
        System.out.print("Digite outro nome para verificar: ");
        String nomeVerificar = scanner.nextLine();
        boolean encontrado = false;
        for (String nome : nomes) {
            if (nome.equalsIgnoreCase(nomeVerificar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome está presente na lista.");
        } else {
            System.out.println("O nome NÃO está presente na lista.");
        }

        // Exercício 10
        String senhaSecreta = "Java123";
        boolean tentativa = true;
        while (tentativa) {
            System.out.println("Digite a senha: ");
            String senhaDigitada = scanner.nextLine();
            if (senhaDigitada.equals(senhaSecreta)) {
                System.out.println("Senha correta! Acesso permitido.");
                tentativa = false;
            } else {
                System.out.println("Senha incorreta! Por favor, tente novamente. ");
            }
        }

        scanner.close();
        }

    }

