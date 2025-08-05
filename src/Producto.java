// Clase abstracta base para todos los productos
public abstract class Producto {
    protected String nombre;
    protected String descripcion;
    protected String categoria;
    protected double precio;
    protected String urlFoto;

    // Constructor que inicializa los atributos comunes
    public Producto(String nombre, String descripcion, String categoria, double precio, String urlFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.urlFoto = urlFoto;
    }

    // Método abstracto que será implementado por cada subclase
    public abstract void mostrarDetalles();

    // Getters y setters comunes
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Puedes agregar más getters y setters si los necesitas
}