import java.util.Scanner;

public class CalculaMed {
     static void main(){

         Scanner input = new Scanner(System.in);
         // System.in IMPRIME NA ENTRADA, nós digitamos (Tipo o input() do Python)
         // System.out IMPRIME NA SAÍDA, o sistema imprime no terminal (o print, basicamente)

         // Com isso a classe Scanner foi importada da biblioteca base do Java. Existem várias classes bases

        // Declaração de variáveis
        float n1, n2, n3, media;

        // Atribuição
         System.out.println("Seu nome: ");
        String nome;
        nome = input.next(); //next() simula a troca de linha de uma máquina de escrever
         // Esse cara serve para parar de pegar o texto quando encontrar um espaço (Ex: Em Felipe Augusto ele só pega Felipe)
        // n1 = (float)7.8; // Dizendo de forma explicita que essa variável é do tipo float de fomar clara
        // n2 = 8.9f; // o "f" no final é a mesma coisa que fizemos no comando acima
        // n3 = 4.8f;
         System.out.println("Nota 01: ");
         n1 = input.nextFloat();
         System.out.println("Nota 02: ");
         n2 = input.nextFloat();
         System.out.println("Nota 03: ");
         n3 = input.nextFloat();

        // Processamento
        media = (n1+n2+n3)/3;

        System.out.println("A média do aluno "+ nome + " é " + media);
    }


}
