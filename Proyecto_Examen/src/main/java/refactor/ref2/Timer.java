package refactor.ref2;

/*
Tarea: Reemplazar el número mágico 86400 con una constante descriptiva.
 */
public class Timer {

    public static final int WAITING_TIME = 86400;

    void startTimer() throws InterruptedException {
        // Espera 86400 segundos (24 horas)
        Thread.sleep(WAITING_TIME);
    }
}