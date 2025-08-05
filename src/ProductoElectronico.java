public class ProductoElectronico extends Producto implements Vendible {
    private int garantiaMeses;

    public ProductoElectronico(String nombre, String descripcion, String categoria,
                               double precio, String urlFoto, int garantiaMeses) {
        super(nombre, descripcion, categoria, precio, urlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== Producto Electrónico ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: Q" + precio);
        System.out.println("Foto: " + urlFoto);
        System.out.println("Garantía: " + garantiaMeses + " meses");
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precio = precio - (precio * porcentaje / 100);
        System.out.println("Nuevo precio con " + porcentaje + "% de descuento: Q" + precio);
    }
}