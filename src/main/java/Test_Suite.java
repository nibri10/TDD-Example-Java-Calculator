import Model.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Suite {

    @Test
    public void shouldSumTwoNumber() throws Exception{
        int valor =10;
        int valor2 =10;
        Calculadora calculadora = new Calculadora(valor,valor2);
        assertEquals(20,calculadora.soma(valor,valor2));

    }

    @Test
    public  void shouldSubTwoNumbers() throws Exception{
        Calculadora calculadora = new Calculadora();
        int valor =10;
        int valor2 =10;
        assertEquals(0,calculadora.sub(valor,valor2));
    }

    @Test
    public  void shouldDiv()throws Exception{
        Calculadora calculadora = new Calculadora();
        int valor =10;
        int valor2 =10;
        assertEquals(1,calculadora.div(valor,valor2));
    }

    @Test
    public  void shouldMultiTwoNumbers() throws Exception{
        Calculadora calculadora = new Calculadora();
        int valor =10;
        int valor2 =10;
        assertEquals(100,calculadora.multi(valor,valor2));
    }



    @Test
    public void shouldSimbolI(){
        ConvertNumberRomain romain = new ConvertNumberRomain();
        int numero = romain.convert("I");
        assertEquals(1,numero);
    }

    @Test
    public void shouldSimbolV(){
        ConvertNumberRomain romain = new ConvertNumberRomain();
        int numero = romain.convert("V");
        assertEquals(5,numero);
    }

    @Test
    public void shouldSimboII(){
        ConvertNumberRomain romain = new ConvertNumberRomain();
        int numero = romain.convert("II");
        assertEquals(2,numero);
    }

    @Test
    public void shouldSimbolXX(){
        ConvertNumberRomain romain = new ConvertNumberRomain();
        int numero = romain.convert("XX");
        assertEquals(20,numero);
    }


    @Test
    public void shouldSimbolXXII(){
        ConvertNumberRomain romain = new ConvertNumberRomain();
        int numero = romain.convert("XXII");
        assertEquals(22,numero);
    }

    @Test
    public void shouldSimbolIX(){
        ConvertNumberRomain romain = new ConvertNumberRomain();
        int numero = romain.convert("IX");
        assertEquals(9,numero);
    }

    @Test
    public void ShouldSimbolXXIV() {
        ConvertNumberRomain romano = new ConvertNumberRomain();
        int numero = romano.convert("XXIV");
        assertEquals(24, numero);
    }

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

    @Test
    public void shouldRetunrZeroCart(){
        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();
        assertEquals(0.0,carrinhodeCompras.maiorValor(),0.00001);
    }

    @Test
    public void ShouldReturnOneOnCart(){
        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();
        carrinhodeCompras.Adiciona(new Item("Geladeira",1,900.00));

        assertEquals(900.00,carrinhodeCompras.maiorValor(),0.00001);
    }

    @Test
    public void ShouldReturnManyProducts(){
        CarrinhodeCompras carrinhodeCompras = new CarrinhodeCompras();
        carrinhodeCompras.Adiciona(new Item("Geladeira",1,900.00));
        carrinhodeCompras.Adiciona(new Item("Fogao",1,1500.0));
        carrinhodeCompras.Adiciona(new Item("Maquina de Lavar",1,750.0));
        assertEquals(1500.00,carrinhodeCompras.maiorValor(),0.00001);
    }

}
