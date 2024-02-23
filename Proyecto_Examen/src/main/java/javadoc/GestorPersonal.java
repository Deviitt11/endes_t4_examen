package javadoc;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase GestorPersonal que representa a un gestor personal
 * @author David Collados Blanco
 * @since 2024-02-23
 * @version 1.0
 */
public class GestorPersonal {

    /**
     * ArrayList privado de empleados (objetos de tipo Empleado)
     */
    private List<Empleado> empleados;

    /**
     * Constructor de la clase GestorPersonal, crea el ArrayList
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     * Método contratar, recibe como parámetro un empleado de tipo Empleado
     * @param empleado
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     * Método despedir
     * @param id
     * @return elimina un empleado del arrayList introduciendo su id, si este coincide con alguno de los empleados presentes en el array, se elimina
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }


    /**
     * Método cambiarSueldo de tipo boolean, recibe como parámetros el id y un nuevoSueldo
     * @param id
     * @param nuevoSueldo
     * @return true || false
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     * Método getEmpleados, devuelve el arrayList con todos los empleados que contiene
     * @return ArrayList de tipo empleados
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}