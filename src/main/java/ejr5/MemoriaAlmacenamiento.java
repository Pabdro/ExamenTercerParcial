package ejr5;

public class MemoriaAlmacenamiento extends Decorator {

    public MemoriaAlmacenamiento(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se aumenta una memoria de almacenamiento de 70$");
        return super.anadir()+70;
    }

}