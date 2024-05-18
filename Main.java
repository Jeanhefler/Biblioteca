import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner input = new Scanner(System.in);
       while (true) {
        System.out.println("1 - Adicionar um livro novo ao acervo");
        System.out.println("2 - Listar todos os livros do acervo");
        System.out.println("3 - Pesquisar um livro no acervo pelo título");
        System.out.println("4 - Remover um Livro do acervo");
        System.out.println("0 - Sair");
        int opcao = input.nextInt();
        System.out.print("\033[H\033[2J");
        input.nextLine();
        if (opcao == 0) {
            break;
        }
        else if (opcao == 1) {
            biblioteca.adicionarLivro();
        }
        else if (opcao == 2) {
            biblioteca.listarLivros();
        }
        else if (opcao == 3) {
            biblioteca.buscarLivro();
        }
        else if (opcao == 4) {
            biblioteca.removerLivro();
        }
       }
       input.close();
    }
    
}