package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarrinhodeCompras {
    private List<Item> Itens;

    public CarrinhodeCompras(){
        this.Itens = new ArrayList<Item>();
    }

    public void Adiciona(Item item){
        this.Itens.add(item);
    }

    public List<Item> getItens(){
        return Collections.unmodifiableList(Itens);
    }

    public double maiorValor(){
        if(Itens.size()==0) return 0;
        double maior = Itens.get(0).getValorTotal();
        for(Item itens :Itens){
            if(maior < itens.getValorTotal())
                maior = itens.getValorTotal();
        }
        return maior;
    }
}
