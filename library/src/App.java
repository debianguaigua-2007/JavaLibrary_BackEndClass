public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        LIvro livro = new LIvro("Dom Casmurro", "Machado de Assis", 1899, true);
        Aluno aluno = new Aluno("Maria", 17, 1123);
        System.out.println(livro.toString());
        System.out.println(aluno.toString());
    }
}
