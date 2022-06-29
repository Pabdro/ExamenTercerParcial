package ejr5;

public class MemoriaExterna extends Decorator {

    public MemoriaExterna(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se aumenta una memoria externa de 140$");
        return super.anadir()+140;
    }

}