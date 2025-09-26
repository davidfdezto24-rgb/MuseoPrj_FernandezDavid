import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa las ventas de boletos en un día específico en el museo.
 * Almacena una lista de boletos vendidos y permite calcular el total.
 * 
 * @author David Fernández Torres
 * @version 1.0
 */
public class VentaDelDia {
    /** Fecha de la venta */
    private String fechaDeLaVenta;
    /** Lista de boletos vendidos en el día */
    private List<BoletoMuseo> boletosVendidos;

    /**
     * Constructor que inicializa la venta del día con la fecha actual
     * y una lista vacía de boletos vendidos.
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }

    /**
     * Registra un boleto vendido en la lista de ventas.
     * 
     * @param boleto Boleto vendido
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }

    /**
     * Calcula el monto total de todos los boletos vendidos en el día.
     * 
     * @return Total de las ventas
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }

    /**
     * Establece la fecha de la venta con la fecha actual.
     * 
     * @return Fecha actual en formato yyyy-MM-dd
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Representación en texto de la venta del día.
     * Incluye fecha, cantidad de boletos, detalle de cada boleto y el total.
     * 
     * @return Cadena con el detalle de la venta
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += "  Fecha: " + fechaDeLaVenta + "\n";
        msg += "  Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += "  Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += "    - Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += "  Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}