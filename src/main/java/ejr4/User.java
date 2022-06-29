package ejr4;

public class User {
    private String nombre;
    private int numero;

    public User(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void showInfo(){
        System.out.println("informacion");
        System.out.println("nombre: " + nombre);
        System.out.println("numero de usuario: " + numero);
        System.out.println();
    }
}