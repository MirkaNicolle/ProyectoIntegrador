public class Producto {
    // Atributos privados
    private String nombre;
    private String descripcion;
    private String categoria;
    private String etiquetas;
    private double precio;
    private String urlFoto;

    // Constructor con todos los parametros
    public Producto(String nombre, String descripcion, String categoria,
                    String etiquetas, double precio, String urlFoto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.etiquetas = etiquetas;
        this.precio = precio;
        this.urlFoto = urlFoto;
    }

    // Getters (para obtener valores)
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public String getCategoria() { return categoria; }
    public String getEtiquetas() { return etiquetas; }
    public double getPrecio() { return precio; }
    public String getUrlFoto() { return urlFoto; }

    // Setters (para modificar valores)
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setEtiquetas(String etiquetas) { this.etiquetas = etiquetas; }
    public void setPrecio(double precio) { this.precio = precio; }
    public void setUrlFoto(String urlFoto) { this.urlFoto = urlFoto; }

    // Metodo opcional para mostrar detalles del producto
    public void mostrarDetalles() {
        System.out.println("=== Producto ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Categoria: " + categoria);
        System.out.println("Etiquetas: " + etiquetas);
        System.out.println("Precio: Q" + precio);
        System.out.println("URL Foto: " + urlFoto);
        System.out.println("---------------------");
    }
}