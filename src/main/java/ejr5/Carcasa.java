package ejr5;

public class Carcasa extends Decorator {

    public Carcasa(ICelular componente) {
        super(componente);
    }

    public Integer anadir() {
        System.out.println("Se aumenta una carcasa de $60");
        return super.anadir() + 60;
    }
}