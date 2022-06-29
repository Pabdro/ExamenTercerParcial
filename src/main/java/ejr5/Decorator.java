package ejr5;

public abstract class Decorator implements ICelular{
    private ICelular componente;
    public Decorator(ICelular componente) {
        this.componente=componente;
    }
    public Integer anadir(){
        return componente.anadir();
    }
}