import Model.CarrinhodeCompras;
import Model.Item;

public class CarrinhodeComprasBuilder {
    CarrinhodeCompras carrinhodeCompras;

    public  CarrinhodeComprasBuilder(){
        this.carrinhodeCompras = new CarrinhodeCompras();
    }
   /* public CarrinhodeComprasBuilder comIntens(double valores){
        for (double valor : valores){
            carrinhodeCompras.Adiciona(new Item("Item",1,valores));

        }
        return this;

    }*/

    public CarrinhodeCompras cria(){
        return  carrinhodeCompras;
    }
}
