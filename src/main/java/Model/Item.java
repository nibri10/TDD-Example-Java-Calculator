package Model;

public class Item {
    private String Descricao;
    private int quant;
    private double valorUnitario;

    public Item(String descricao, int quant, double valorUnitario) {
        Descricao = descricao;
        this.quant = quant;
        this.valorUnitario = valorUnitario;
    }


    public double getValorTotal() {
        return this.valorUnitario * this.quant;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
