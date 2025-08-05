public class Main {
    public static void main(String[] args) {
        // Crear un producto alimenticio
        ProductoAlimenticio pan = new ProductoAlimenticio(
                "Pan Integral",
                "Pan saludable con semillas",
                "Alimentos",
                12.50,
                "pan.jpg",
                "10/09/2025"
        );

        // Crear un producto electrónico
        ProductoElectronico audifonos = new ProductoElectronico(
                "Audífonos Bluetooth",
                "Audífonos con cancelación de ruido",
                "Electrónica",
                250.00,
                "audifonos.jpg",
                12
        );

        // Mostrar los detalles y aplicar descuentos
        pan.mostrarDetalles();
        pan.aplicarDescuento(10); // 10% de descuento

        System.out.println();

        audifonos.mostrarDetalles();
        audifonos.aplicarDescuento(15); // 15% de descuento
    }
}