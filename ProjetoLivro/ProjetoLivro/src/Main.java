public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Carlos", 23, "M");
        p[1] = new Pessoa("Carla", 24, "F");

        l[0] = new Livro("Mil Palavras", "Benjamin Constant", 520, p[0]);
        l[1] = new Livro("Caminho da Vida", "Joseff Clovis", 340, p[1]);
        l[2] = new Livro("Harry Potter - Cálice de Fogo", "J.K. Rowling", 480, p[0]);

        l[0].abrir();
        l[0].folhear(200);

        System.out.println(l[0].detalhes());
    }
}
