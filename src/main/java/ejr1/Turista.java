package ejr1;

import java.util.Random;

public class Turista implements ITurista {

    private String nombre;
    private String ci;
    private double montoDinero;

    public Turista(String nombre, String ci, double montoDinero) {
        this.nombre = nombre;
        this.ci = ci;
        this.montoDinero = montoDinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }


    @Override
    public void visitarCiudad(LaPaz laPaz) {
        System.out.println("La Paz");
        int random = new Random().nextInt(100);
        System.out.println("cantidad gastada " + random + " Bs" );
        if(random <= montoDinero) {
            montoDinero -=random;
            laPaz.setDineroPorTurismo(random + laPaz.getDineroPorTurismo());
            System.out.println("quedan " +montoDinero+ " Bs");
        } else {
            System.out.println("no hay dinero suficiente");
            System.out.println("quedan " + montoDinero + " Bs.");
        }

    }

    @Override
    public void visitarCiudad(Cochabamba cochabamba) {
        System.out.println("Cochabamba");
        int costo = (cochabamba.getNroHabitantes()*10)/100;
        System.out.println("cantidad gastada " + costo + " Bs");
        if (costo <= montoDinero) {
            montoDinero -=costo;
            cochabamba.setPagoPorTurista(costo + cochabamba.getPagoPorTurista());
            System.out.println("quedan " + montoDinero + " Bs");
        } else {
            System.out.println("no hay suficiente dinero");
            System.out.println("quedan " + montoDinero + " Bs");
        }


    }

    @Override
    public void visitarCiudad(SantaCruz santaCruz) {
        System.out.println("Santa Cruz");
        int costo = (santaCruz.getNroProvincias()*50)/100;
        System.out.println("cantidad gastada " + costo + " Bs");
        if(costo <= montoDinero) {
            montoDinero -=costo;
            santaCruz.setDineroPorTurismo(costo + santaCruz.getDineroPorTurismo());
            System.out.println("quedan " + montoDinero + " Bs");
        } else {
            System.out.println("no hay suficiente dinero");
            System.out.println("quedan " + montoDinero + " Bs");
        }

    }
}