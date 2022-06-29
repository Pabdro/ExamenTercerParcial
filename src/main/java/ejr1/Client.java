package ejr1;

public class Client {
    public static void main(String[] args) {
        Cochabamba cochabamba = new Cochabamba(20, 10000, "Templado", 0);
        SantaCruz santaCruz = new SantaCruz(30, 200000, "Calido", 0);
        LaPaz laPaz = new LaPaz(10, 100000, "Frio", 0);
        Turista turista = new Turista("Marcos", "1231244", 5000);

        turista.visitarCiudad(cochabamba);
        turista.visitarCiudad(santaCruz);
        turista.visitarCiudad(laPaz);
    }
}
