package Model;

public class CalculadoradeSalario {

    public double calculaSalario(Funcionario funcionario) {
        return funcionario.getCargo().getRegra().calcula(funcionario);
    }

}
