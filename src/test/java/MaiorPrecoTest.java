import Model.CarrinhodeCompras;
import Model.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaiorPrecoTest {
   private CarrinhodeCompras carrinhodeCompras;

    @Before
    public void initialize(){
     this.carrinhodeCompras = new CarrinhodeCompras();
    }

    @Test
    public void shouldRetunrZeroCart(){
        assertEquals(0.0,carrinhodeCompras.maiorValor(),0.00001);
    }
    @Test
    public void ShouldReturnOneOnCart(){
        carrinhodeCompras.Adiciona(new Item("Geladeira",1,900.00));
        assertEquals(900.00,carrinhodeCompras.maiorValor(),0.00001);
    }

    @Test
    public void Should_Adding_Itens(){
        assertEquals(0,carrinhodeCompras.getItens().size());
        Item item = new Item("Geladeira",10,5020);
        carrinhodeCompras.Adiciona(item);
        assertEquals(1, carrinhodeCompras.getItens().size());// Verifica se o item foi adiconado a lista
        assertEquals(item, carrinhodeCompras.getItens().get(0)); // Verifica se foi alocado no primeiro index da lista.
    }

    @Test
    public void ShouldReturnManyProducts(){
        // Garante que o carrinho está vazio
        assertEquals(0,carrinhodeCompras.getItens().size());
        carrinhodeCompras.Adiciona(new Item("Geladeira",1,900.00));
        carrinhodeCompras.Adiciona(new Item("Fogao",1,1500.0));
        carrinhodeCompras.Adiciona(new Item("Maquina de Lavar",1,750.0));
        //Testa Tamanho do carrinho
        assertEquals(3,carrinhodeCompras.getItens().size());
        assertEquals(1500.00,carrinhodeCompras.maiorValor(),0.00001);
    }


}
