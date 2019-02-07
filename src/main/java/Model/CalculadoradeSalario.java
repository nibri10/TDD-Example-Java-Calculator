package Model;

public class CalculadoradeSalario {

    public double calcularSalario(Funcionario funcionario){

        if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR)){
            if(funcionario.getSalario() > 3000) {
                return funcionario.getSalario() * 0.8;
            }
            return funcionario.getSalario() * 0.9;
        }
       else if(funcionario.getCargo().equals(Cargo.DBA) || funcionario.getCargo().equals(Cargo.TESTADOR)) {
           if(funcionario.getSalario() < 2500){
               return  funcionario.getSalario() * 0.85;
           }
           return funcionario.getSalario() * 0.75;

        }
        throw  new RuntimeException("Funcionario invalido");

    }


}
