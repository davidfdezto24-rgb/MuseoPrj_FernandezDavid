/**
 * Representa una persona que puede tener asignado un boleto de museo.
 * 
 * @author David Fernández Torres
 * @version 1.0
 */
public class Persona {
    /** Nombre de la persona */
    private String nombre;
    /** Identificación única de la persona */
    private String identificacion;
    /** Boleto asignado a la persona */
    private BoletoMuseo miBoleto;

    /**
     * Constructor que inicializa una persona con nombre e identificación.
     * 
     * @param nombre Nombre de la persona
     * @param ident Identificación de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }

    /**
     * Constructor que inicializa una persona solo con su nombre.
     * 
     * @param nombre Nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece la identificación de la persona.
     * 
     * @param pIdentificacion Número de identificación
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }

    /**
     * Asigna un boleto de museo a la persona.
     * 
     * @param pMiBoleto Boleto a asignar
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }

    /**
     * Consulta el número del boleto asignado a la persona.
     * 
     * @return Número del boleto
     */
    public int consultarMiNumeroDeBoleto() {
        if (miBoleto != null) {
            return miBoleto.getNumeroBoleto();
        } else {
            return -1; 
        }
    }

    /**
     * Representación en texto de la persona y su boleto.
     * 
     * @return Cadena con los detalles de la persona
     */
    public String toString() {
        String msg = "Persona\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificacion: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}
