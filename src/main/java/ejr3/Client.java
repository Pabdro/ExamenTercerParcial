package ejr3;

public class Client {
    public static void main(String[] args){
        SistemaColegio colegio = new SistemaColegio("Domingo savio", 30, "ci");
        colegio.addEstudiante(new Estudiante("Pablo Badani", 17));
        colegio.addEstudiante(new Estudiante("Miguel Molina", 17));

        SistemaEscuela escuela = new SistemaEscuela("San Calixto", 50, "ci");
        escuela.addEstudiante(new Estudiante("Gabriel Neme", 15));

        SistemaUniversidad universidad = new SistemaUniversidad("UPB", 200, "codigo");
        universidad.addEstudiante(new Estudiante("Joseph Meneses", 21));

        Facebook facebook = new Facebook(colegio);
        facebook.mostrarDatos();
        WhatsApp whatsapp = new WhatsApp(escuela);
        whatsapp.mostrarDatos();
        Twitter twitter = new Twitter(universidad);
        twitter.mostrarDatos();
    }
}