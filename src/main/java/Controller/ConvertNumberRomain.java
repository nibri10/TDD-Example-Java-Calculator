package Controller;

import java.util.HashMap;
import java.util.Map;

public class ConvertNumberRomain {

   public static Map<Character,Integer> table = new HashMap<Character, Integer>(){{
       put('I', 1);
       put('V',5);
       put('X',10);
       put('L',50);
       put('C',100);
       put('D',500);
       put('M',1000);
   }};

   public int convert(String romainNumber){
       int acumulator = 0;
       int lasteright = 0;
       for(int i = romainNumber.length() - 1; i>=0 ;i--){
           // pega o inteiro referente ao simbolo atual
           int atual = table.get(romainNumber.charAt(i));
           //se o da direita for menor multiplicamos por -1 para torna-lo negativo
           int multi = 1;

           if(atual <lasteright) multi = -1;

           acumulator += table.get(romainNumber.charAt(i)) * multi;

           //atualiza o vizinho da direita
           lasteright = atual;
       }
       return acumulator;
   }
}
