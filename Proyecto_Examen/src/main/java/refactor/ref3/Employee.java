package refactor.ref3;

/*
Tarea: Renombrar "s" e "y" a nombres más descriptivos.
 */

public class Employee {

    int diasTrabajados;
    int horasTrabajadas;

    int calculateSalary() {
        return diasTrabajados * horasTrabajadas;
    }
}