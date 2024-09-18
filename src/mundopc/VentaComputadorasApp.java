package mundopc;

import mundopc.modelo.Computadora;
import mundopc.modelo.Monitor;
import mundopc.modelo.Raton;
import mundopc.modelo.Teclado;
import mundopc.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {

        Raton ratonLenovo = new Raton("bluetooth","Lenovo");
        System.out.println(ratonLenovo);
        Teclado tecladoLenovo = new Teclado("bluetooth", "lenovo");
        System.out.println(tecladoLenovo);
        Monitor monitorLenovo = new Monitor("Lenovo", 27);
        System.out.println(monitorLenovo);

        Computadora computadoraLenovo = new Computadora("Computadora leNovo", monitorLenovo,tecladoLenovo,ratonLenovo);
        System.out.println(computadoraLenovo);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.mostrarOrden();
    }
}