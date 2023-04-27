package Modulos;

import java.util.ArrayList;

public class Local {
    private String nombre;
     private ArrayList<Plato> arregloPlatos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Local(String nombre) {
        this.nombre = nombre;
        this.arregloPlatos = new ArrayList<>();
    }

    public ArrayList<Plato> getArregloPlatos() {
        return arregloPlatos;
    }

    public void setArregloPlatos(ArrayList<Plato> arregloPlatos) {
        this.arregloPlatos = arregloPlatos;
    }

    @Override
    public String toString() {
        return "Local{" +
                "nombre='" + nombre + '\'' +
                ", arregloPlatos=" + arregloPlatos +
                '}';
    }
    public void cargaDePlato(String nombre, double precio)
    {
        Plato aux=new Plato(nombre,precio);
        arregloPlatos.add(aux);
    }
}
