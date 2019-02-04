import Model.ConvertNumberRomain;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterNumberRomanTest {
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


}
