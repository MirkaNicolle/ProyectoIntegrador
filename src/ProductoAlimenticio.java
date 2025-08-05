public class ProductoAlimenticio extends Producto implements Vendible {
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria,
                               double precio, String urlFoto, String fechaCaducidad) {
        super(nombre, descripcion, categoria, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    // Implementación del método abstracto
    @Override
    public void mostrarDetalles() {
        System.out.println("=== Producto Alimenticio ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: Q" + precio);
        System.out.println("Foto: " + urlFoto);
        System.out.println("Caduca en: " + fechaCaducidad);
    }

    // Implementación de la interfaz Vendible
    @Override
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
        System.out.println("Nuevo precio con " + porcentaje + "% de descuento: Q" + precio);
    }
}
