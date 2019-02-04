import Model.CalculadoradeSalario;
import Model.Cargo;
import Model.Funcionario;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoradeSalarioTest {
    @Test
    public void shouldCalculateSalary() {
        CalculadoradeSalario calculadoradeSalario = new CalculadoradeSalario();
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 1500.0, Cargo.DESENVOLVEDOR);
        double salario = calculadoradeSalario.calcularSalario(Desenvolvedor);
        assertEquals(1500.0 * 0.9, salario, 0.00001);

    }
    @Test
    public void shouldCalculateHighLimit() {
        CalculadoradeSalario calculadoradeSalario = new CalculadoradeSalario();
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 4000.0, Cargo.DESENVOLVEDOR);
        double salario = calculadoradeSalario.calcularSalario(Desenvolvedor);
        assertEquals(4000.0 * 0.8, salario, 0.00001);
    }

    @Test
    public void shouldCalculateLowerLimit() {
        CalculadoradeSalario calculadoradeSalario = new CalculadoradeSalario();
        Funcionario Desenvolvedor = new Funcionario("Mauricio", 500.0, Cargo.DBA);
        double salario = calculadoradeSalario.calcularSalario(Desenvolvedor);
        assertEquals(500.0 * 0.85, salario, 0.00001);
    }
}
