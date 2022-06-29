package ejr1;

public class SantaCruz implements ICiudad {

    private String nombre;
    private int nroProvincias;
    private int nroHabitantes;
    private String clima;
    private double dineroPorTurismo;

    public SantaCruz(int nroProvincias, int nroHabitantes, String clima, double dineroPorTurismo) {
        nombre = "Santa Cruz";
        this.nroProvincias = nroProvincias;
        this.nroHabitantes = nroHabitantes;
        this.clima = clima;
        this.dineroPorTurismo = dineroPorTurismo;
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

    public double getDineroPorTurismo() {
        return dineroPorTurismo;
    }

    public void setDineroPorTurismo(double dineroPorTurismo) {
        this.dineroPorTurismo = dineroPorTurismo;
    }


    @Override
    public void turistaVisita(ITurista turista) {

        turista.visitarCiudad(this);



    }
}