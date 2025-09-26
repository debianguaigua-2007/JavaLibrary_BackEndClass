public class Aluno {
    protected String nome = "D";
    protected int age = 18;
    protected int matricula = 2864;
    public Aluno(String nome, int age, int matricula) {
        this.nome = nome;
        this.age = age;
        this.matricula = matricula;
    }
    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", age=" + age + ", matricula=" + matricula + "]";
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
