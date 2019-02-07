package Controller;

public class Calculadora {
    int numero;
    int numero2;

    public Calculadora(){}
    public Calculadora(int numero,int numero2) {
        this.numero = numero;
        this.numero2 = numero2;
    }
    public int soma(int numero, int numero2){
        return numero + numero2;
    }

    public int sub(int numero,int numero2){
        return numero - numero2;
    }

    public int div(int numero,int numero2){
        return numero / numero2;
    }

    public int multi(int numero,int numero2){
        return numero * numero2;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
