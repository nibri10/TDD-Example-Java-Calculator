package Model;

public class Funcionario {
    private String nome;
    private double Salario;
    private Cargo cargo;

    public Funcionario(String nome, double salario, Cargo cargo) {
        this.nome = nome;
        Salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
}
