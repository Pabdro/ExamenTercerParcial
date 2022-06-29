package ejr1;

public class Cochabamba implements ICiudad {

    private String nombre;
    private int nroProvincias;
    private int nroHabitantes;
    private String clima;
    private double pagoPorTurista;

    public Cochabamba(int nroProvincias, int nroHabitantes, String clima, double pagoPorTurista) {
        nombre = "Cochabamba";
        this.nroProvincias = nroProvincias;
        this.nroHabitantes = nroHabitantes;
        this.clima = clima;
        this.pagoPorTurista = pagoPorTurista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroProvincias() {
        return nroProvincias;
    }

    public void setNroProvincias(int nroProvincias) {
        this.nroProvincias = nroProvincias;
    }

    public int getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(int nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public double getPagoPorTurista() {
        return pagoPorTurista;
    }

    public void setPagoPorTurista(double pagoPorTurista) {
        this.pagoPorTurista = pagoPorTurista;
    }


    @Override
    public void turistaVisita(ITurista turista) {
        turista.visitarCiudad(this);
    }
}