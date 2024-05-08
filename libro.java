public class libro {
    private String nombre;
    private String autor;
    private int paginas;
    private int precio;

    public libro() {
        //vacio
    }

    public libro(String nombre, String autor, int paginas, int precio){
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
        this.precio = precio;
    }

    public void Detalles(){
        System.out.println("El nombre del Autor es: " + autor);
        System.out.println("El nombre del Libro es: " + nombre);
        System.out.println("La cantidad de paginas del Libro es: " + paginas);
        System.out.println("EL precio del Libro es: " + precio);
    }

    public void AumentoPrecio(){
        precio = (precio*2);
    }

    
}
