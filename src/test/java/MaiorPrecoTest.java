import Model.CarrinhodeCompras;
import Model.Item;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaiorPrecoTest {
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
