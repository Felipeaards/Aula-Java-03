public class CalculaMed {
     static void main(){
        // Declaração de variáveis
        float n1, n2, n3, media;

        // Atribuição
        String nome = "Felipe";
        n1 = (float)7.8; // Dizendo de forma explicita que essa variável é do tipo float de fomar clara
        n2 = 8.9f; // o "f" no final é a mesma coisa que fizemos no comando acima
        n3 = 4.8f;

        // Processamento
        media = (n1+n2+n3)/3;

        System.out.println("A média do aluno "+ nome + " é " + media);
    }


}
