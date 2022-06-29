package ejr3;

public class WhatsApp implements IRedSocial {
    private ISistema sistema;

    public WhatsApp(ISistema sistema) {
        this.sistema = sistema;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("datos whatsapp");
        sistema.mostrarDatos();
    }
}