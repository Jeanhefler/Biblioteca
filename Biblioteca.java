import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Biblioteca {
    ArrayList<Livro> acervo = new ArrayList<Livro>(Arrays.asList());
    Scanner input = new Scanner(System.in);
    
    public void adicionarLivro(){
        Livro novoLivro = new Livro();
        System.out.print("Digite o título do livro: ");
        novoLivro.setTitulo(input.nextLine());
        System.out.print("\033[H\033[2J");
        if (acervo.contains(novoLivro)) {
            System.out.println("Já existe um livro com este mesmo título!");
        }
        //gambiarra provisória
        else if (novoLivro.getTitulo() == "") {
            System.out.println("O título não pode ficar em branco!");
        }
        else{
        System.out.print("Digite o autor do livro: ");
        novoLivro.setAutor(input.nextLine());
        System.out.print("\033[H\033[2J");
        try {
            System.out.print("Digite o número de páginas do livro: ");
            novoLivro.setPaginas(input.nextInt());
            input.nextLine();
            System.out.print("\033[H\033[2J");
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.println("O número de páginas deve ser um número inteiro!");
            System.out.println("");
            return;
        }
        try {
            System.out.print("Digite o ano de lançamento do livro: ");
        novoLivro.setAnoDeLancamento(input.nextInt());
        System.out.print("\033[H\033[2J");
        input.nextLine();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.println("O ano de lançamento deve ser um número inteiro!");
            System.out.println("");
            return;
        }
        acervo.add(novoLivro);
        }
    }
    public void listarLivros(){
        System.out.println(acervo);
        System.out.println("");
    }
    public void buscarLivro(){
        Livro busca = new Livro();
        System.out.println("Digite o titulo do livro desejado");
        busca.setTitulo(input.nextLine());
        System.out.print("\033[H\033[2J");
        for(int i = 0; i < acervo.size(); i ++){
            if(acervo.get(i).getTitulo().equals(busca.getTitulo())){
                System.out.println(acervo.get(i));
                System.out.println("");  
            }
        }
    }
    public void removerLivro(){
        Livro remover = new Livro();
        System.out.println("Digite o titulo do livro a ser removido!");
        remover.setTitulo(input.nextLine());
        System.out.print("\033[H\033[2J");
        for(int i = 0; i < acervo.size(); i ++){
            if(acervo.get(i).getTitulo().equals(remover.getTitulo())){
                acervo.remove(i);    
            }
        }
    }
}
