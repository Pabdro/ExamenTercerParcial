package ejr3;

public class Twitter implements IRedSocial {
    private ISistema sistema;

    public Twitter(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("datos twitter");
        sistema.mostrarDatos();
    }
}