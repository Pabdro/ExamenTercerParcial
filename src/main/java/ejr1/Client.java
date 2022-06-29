package ejr1;

public class Client {
    public static void main(String[] args) {

        LaPaz laPaz = new LaPaz(10, 2000, "Frio", 0);
        Cochabamba cochabamba = new Cochabamba(20, 12000, "Templado", 0);
        SantaCruz santaCruz = new SantaCruz(30, 2000, "Calido", 0);

        Turista turista = new Turista("Marcos", "1231244", 3000);

        turista.visitarCiudad(laPaz);
        turista.visitarCiudad(cochabamba);
        turista.visitarCiudad(santaCruz);

    }
}
