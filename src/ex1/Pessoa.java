package ex1;

public class Pessoa {
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void logar() {
        System.out.println("Usuário Logado");
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | " +
                "Email: " + email + "\n";
    }
}