package Model;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTADOR(new QuinzeOuVinteCincoPorCento());

    private RegradeCalculo regra;

   Cargo(RegradeCalculo regra){
        this.regra = regra;
    }

    public  RegradeCalculo getRegra(){
        return regra;
    }
}
