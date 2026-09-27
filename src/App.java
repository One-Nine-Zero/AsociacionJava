public class App {
    
    public static void main(String[] args) throws Exception {
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry");

        Lector lector1 = new Lector("Ana Torres", "1001234567");
        Lector lector2 = new Lector("CCarlos Ruiz", "1009876543");

        lector1.tomarPrestado(libro1);
        lector2.tomarPrestado(libro2);

        lector1.mostrarEstado();
        lector2.mostrarEstado();

        System.out.println();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.regresarLibro();
        lector1.tomarPrestado(libro2);

        System.out.println();
        lector1.mostrarEstado();
        lector2.mostrarEstado();
    }
}
