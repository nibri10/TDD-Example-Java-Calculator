package Model;

public class CalculadoradeSalario {

    public double calcularSalario(Funcionario funcionario){
        if(funcionario.getSalario()>3000){
            return funcionario.getSalario() * 0.8;
        }
        return funcionario.getSalario() * 0.9;

    }
}
