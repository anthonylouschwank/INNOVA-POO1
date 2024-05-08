public class main {
    public static void main(String[] args) {
        libro Libro1 = new libro();
        libro Libro2 = new libro("El dia que Juan papio", "No Juan", 120, 5);

        Libro2.Detalles();
        Libro2.AumentoPrecio();
        Libro2.Detalles();
    }
}