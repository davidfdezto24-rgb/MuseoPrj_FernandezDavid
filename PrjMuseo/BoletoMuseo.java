import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un boleto de museo con número único, precio y fecha de emisión.
 * Cada boleto creado aumenta el contador global de boletos.
 * 
 * @author David Fernández Torres
 * @version 1.0
 */
public class BoletoMuseo {
    /** Precio del boleto */
    private double precio;
    /** Número único asignado al boleto */
    private int numeroBoleto;
    /** Fecha de emisión del boleto en formato yyyy-MM-dd */
    private String fechaEmision;
    /** Contador global de boletos emitidos */
    private static int contador = 0;

    /**
     * Constructor que inicializa un boleto con su precio.
     * Se asigna automáticamente un número de boleto y la fecha de emisión.
     * 
     * @param precio Precio del boleto
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }

    /**
     * Establece la fecha de emisión del boleto con la fecha actual.
     * 
     * @return Fecha de emisión en formato yyyy-MM-dd
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }

    /**
     * Obtiene el número total de boletos creados en el sistema.
     * 
     * @return Contador de boletos emitidos
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Obtiene el número único de este boleto.
     * 
     * @return Número del boleto
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }

    /**
     * Obtiene el precio del boleto.
     * 
     * @return Precio del boleto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Representación en texto del boleto con sus datos principales.
     * 
     * @return Cadena con los detalles del boleto
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += "  Numero: " + numeroBoleto + "\n";
        msg += "  Precio: " + precio + "\n";
        msg += "  Fecha Emision: " + fechaEmision;
        return msg;
    }
}
