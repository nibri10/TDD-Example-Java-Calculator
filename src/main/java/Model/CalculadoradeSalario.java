package Model;

public class CalculadoradeSalario {

    public double calcularSalario(Funcionario funcionario){

        if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
          return dez_Ou_Vinte_Por_Cento_De_Desconto(funcionario);
        }
       else if(funcionario.getCargo().equals(Cargo.DBA) || funcionario.getCargo().equals(Cargo.TESTADOR)) {
         return Quinze_Ou_VinteeCinco_Porcento_de_Desconto(funcionario);

        }
        throw  new RuntimeException("Funcionario invalido");

    }

    private double Quinze_Ou_VinteeCinco_Porcento_de_Desconto(Funcionario funcionario){
        if(funcionario.getSalario() < 2500){
            return  funcionario.getSalario() * 0.85;
        }
        return funcionario.getSalario() * 0.75;
    }

    private double dez_Ou_Vinte_Por_Cento_De_Desconto(Funcionario funcionario){
        if(funcionario.getSalario() > 3000) {
            return funcionario.getSalario() * 0.8;
        }
        return funcionario.getSalario() * 0.9;
    }


}
