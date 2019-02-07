package Model;

public class QuinzeOuVinteCincoPorCento extends RegradeCalculo {

    @Override
    protected double porcentagemBase() {
        return 0.85;
    }

    @Override
    protected double porcentagemAcimaDoLimite() {
        return 0.75;
    }

    public  double calcula(Funcionario funcionario){
        if(funcionario.getSalario() <2500){
            return  funcionario.getSalario() * 0.85;
        }
        return  funcionario.getSalario() * 0.75;
    }

    @Override
    protected int limite() {
        return 0;
    }
}
