package ejr5;

public class VidrioTemplado extends Decorator {

    public VidrioTemplado(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se aumenta un vidrio templado de 50$");
        return super.anadir()+50;
    }

}