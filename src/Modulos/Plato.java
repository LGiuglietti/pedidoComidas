package Modulos;

public class Plato {
    private String nombre;
    private double precioPlato;

    public Plato(String nombre, double precioPlato) {
        this.nombre = nombre;
        this.precioPlato = precioPlato;
    }
    public String getNombre() {
        return nombre;
    }

    public double getPrecioPlato() {
        return precioPlato;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioPlato(double precioPlato) {
        this.precioPlato = precioPlato;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precioPlato=" + precioPlato +
                '}';
    }
}
