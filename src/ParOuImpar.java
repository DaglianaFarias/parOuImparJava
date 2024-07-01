// Importa a classe Scanner para ler a entrada do usuário
import java.util.Scanner;

// Define a classe ParOuImpar.
public class ParOuImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário que digite um número.
    System.out.print("Digite um número: ");

    // Lê o número digitado pelo usuário e armazena na variável 'numero'
    int numero = scanner.nextInt();

    // Verifica se o número é par ou ímpar e imprime a mensagem correspondente.
    if (numero % 2 == 0) {
        System.out.println("O número " + numero + " é par.");
    } else {
        System.out.println("O número " + numero + " é ímpar.");
    }

    // Fecha o objeto Scanner.
    scanner.close();
  }
}
