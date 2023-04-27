package Modulos;

import java.sql.Array;
import java.util.ArrayList;

public class Usuario{
    private String nombreUsuario;
    private int metodoPago;//1=efectivo, 2=tarjeta
    private ArrayList<Plato> listaPedidos;
    private boolean delivery;

    public Usuario(String nombreUsuario, int metodoPago, boolean delivery) {
        this.nombreUsuario = nombreUsuario;
        this.metodoPago = metodoPago;
        this.listaPedidos = new ArrayList<>();
        this.delivery = delivery;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getMetodoPago() {
        return metodoPago;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    public void setMetodoPago(int metodoPago) {
        this.metodoPago = metodoPago;
    }

    public ArrayList<Plato> getListaPedidos() {
        return listaPedidos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", metodoPago=" + metodoPago +
                ", listaPedidos=" + listaPedidos +
                '}';
    }
    public void cargaListaPedidos(String nombre, ArrayList<Plato> menu)
    {
        for(int i=0;i<menu.size();i++)
        {
            if(menu.get(i).getNombre().equalsIgnoreCase(nombre))
            {
                listaPedidos.add(menu.get(i));
            }
        }
    }
}
