import Modulos.Sistema;
import Modulos.Usuario;

public class Main {
    public static void main(String[] args) {

        Sistema miSistema=new Sistema();
        miSistema.cargarLocal("lo de pepe");
        boolean res=miSistema.cargarItemMenu("papas fritas", 500,miSistema.getArregloDeLocales().get(0));
        res=miSistema.cargarItemMenu("hamburguesa", 678,miSistema.getArregloDeLocales().get(0));
        res=miSistema.cargarItemMenu("coca cola", 123,miSistema.getArregloDeLocales().get(0));

        Usuario miCliente=new Usuario("nombre",0,false); //pago efectivo sin delivery
        //el metodo de pago y el bolean delivery los traeria de un menu
        miSistema.agregarPedidoUsuario(miCliente,"hamburguesa",0); //compro hamburguesa en local 1
        // (lo elegiria mediante el switch al local)
        miSistema.agregarPedidoUsuario(miCliente,"coca cola",0);
        double precioFinal=miSistema.precioFinal(miCliente);
        System.out.println("precio final: "+precioFinal);
        System.out.println(miSistema.toString());
        System.out.println(miCliente.toString());
        //cambio forma de pedido y forma de pago tambien se haria menu
        miCliente.setDelivery(true);
        miCliente.setMetodoPago(2);
        precioFinal= miSistema.precioFinal(miCliente);
        System.out.println("precio final: "+precioFinal);
    }
}