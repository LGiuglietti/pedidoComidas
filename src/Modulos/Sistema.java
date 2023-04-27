package Modulos;

import java.util.ArrayList;

public class Sistema {
   private ArrayList<Local> arregloDeLocales;

    public Sistema(ArrayList<Local> arregloDeLocales) {
        this.arregloDeLocales = arregloDeLocales;
    }
    public Sistema()
    {
        this.arregloDeLocales=new ArrayList<>();
    }

    public void cargarLocal(String nombreLocal)
    {
        Local aux=new Local(nombreLocal);
        arregloDeLocales.add(aux);
    }

    public ArrayList<Local> getArregloDeLocales() {
        return arregloDeLocales;
    }


    public void agregarPedidoUsuario(Usuario cliente, String nombrePedido, int localAComprar)
    {
        cliente.cargaListaPedidos(nombrePedido,arregloDeLocales.get(localAComprar).getArregloPlatos());
    }

    public double precioFinal(Usuario cliente)
    {
        double precioFinal=0;
            for (int i=0;i<cliente.getListaPedidos().size();i++)
            {
                precioFinal+=cliente.getListaPedidos().get(i).getPrecioPlato();
            }
            if(cliente.getMetodoPago()==2)
            {
                precioFinal*=1.15;
            }
            if (cliente.isDelivery())
            {
                precioFinal*=1.1;
            }

        return precioFinal;
    }
    public boolean cargarItemMenu(String nombre, double precio, Local local)
    {
        boolean res=arregloDeLocales.contains(local);
        if (res)
        {
            for (int i=0;i<arregloDeLocales.size();i++)
            {
                if(arregloDeLocales.get(i).equals(local)){
                    arregloDeLocales.get(i).cargaDePlato(nombre,precio);
                }
            }
        }
        return res;
    }
    @Override
    public String toString() {
        return "Sistema{" +
                "arregloDeLocales=" + arregloDeLocales +
                '}';
    }
}
