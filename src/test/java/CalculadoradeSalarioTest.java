import Model.CalculadoradeSalario;
import Model.Cargo;
import Model.Funcionario;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoradeSalarioTest {
    private  CalculadoradeSalario calculadoradeSalario;

    @Before
    public void initialize(){
        this.calculadoradeSalario = new CalculadoradeSalario();
    }

    @Test
    public void Deveria_Calcular_A_baixo_do_Limite_Para_DBA() {
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DBA);
        double salario = calculadoradeSalario.calculaSalario(Desenvolvedor);
        assertEquals(1500.0 * 0.85, salario, 0.00001);
    }

    @Test
    public void Deveria_Calcular_Acima_do_Limite_Para_DBA() {
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 4500.0, Cargo.DBA);
         double salario=calculadoradeSalario.calculaSalario(Desenvolvedor);
        assertEquals(4500.0 * 0.75, salario, 0.00001);
    }

    @Test
    public void Deveria_Calcular_A_baixo_do_Limite() {
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.TESTADOR);
        double salario = calculadoradeSalario.calculaSalario(Desenvolvedor);
        assertEquals(1500.0 * 0.85, salario, 0.00001);
    }

    @Test
    public void Deveria_Calcular_Acima_do_Limite() {
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
        double salario = calculadoradeSalario.calculaSalario(Desenvolvedor);
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }


}
