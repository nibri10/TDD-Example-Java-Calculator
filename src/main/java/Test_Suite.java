import Model.Calculadora;
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
}
