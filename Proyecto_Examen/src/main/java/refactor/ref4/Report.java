package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printTitle(){
        System.out.println("Título del Reporte");
    }

    void reportContent(){
        // contenido del reporte
        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");
        // más contenido...
    }
    void printConclusion(){
        System.out.println("Conclusión del Reporte");
    }

    void printReport() {
        printTitle();

        // Este realmente no hacía falta pero lo extraje a un método para dejar el código más limpio
        reportContent();

        printConclusion();
    }
}