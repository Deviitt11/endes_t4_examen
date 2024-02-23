package javadoc;

/**
 * Clase Empleado que representa a un Empleado
 * @author David Collados Blanco
 * @since 2024-02-23
 * @version 1.0
 */
public class Empleado {

    // Atributos de la clase

    /**
     * Atributo privado nombre de tipo String
     */
    private String nombre;

    /**
     * Atributo privado id de tipo String
     */
    private String id;

    /**
     * Atributo privado sueldo de tipo double
     */
    private double sueldo;


    /**
     * Constructor de la clase Empleado, recibe como parámetros el nombre, id y sueldo
     * @param nombre
     * @param id
     * @param sueldo
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }

    /**
     * Método getNombre, devuelve el nombre del empleado
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setNombre, recibe como parámetro el nombre del empleado
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getId, devuelve el id del empleado
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * Método getSueldo, devuelve el sueldo del empleado
     * @return sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Método setSueldo, recibe como parámetro el sueldo del empleado
     * @param sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método incrementarSueldo, recibe como parámetro el incremento
     * @param incremento
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     * Método toString de la clase Empleado, devuelve un toString con los atributos del empleado concatenados
     * @return toString
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}