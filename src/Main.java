public class Main {
    public static void main(String[] args) {
        // Crear 5 productos reales usando los datos de la tabla
        Producto p1 = new Producto(
                "Leche Entera Alpina",
                "Bolsa x 1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3100,
                "https://www.eurosupermercados.com/eurosupermercado2020//content/images/thumbs/0001780_leche-alpina_510.jpeg"
        );

        Producto p2 = new Producto(
                "Leche Alpina Deslactosada",
                "Bolsa x 1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3400,
                "https://cdn.dematazo.com/wp-content/uploads/2019/08/Leche-Alpina-Deslactosada.jpeg"
        );

        Producto p3 = new Producto(
                "Leche Alpina Semi-Descremada",
                "Bolsa x 1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3500,
                "https://www.eurosupermercados.com/eurosupermercado2020//content/images/thumbs/0001785_leche-alpina-semi-descremada_510.jpeg"
        );

        Producto p4 = new Producto(
                "Leche Alpina Entera",
                "Paca x 6 und",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                16200,
                "https://metrocolombiafood.vteximg.com.br/arquivos/ids/266047-750-750/Leche-Alpina-Entera-x6-Unds.jpg?v=637762682166630000"
        );

        Producto p5 = new Producto(
                "Leche Colanta Entera",
                "Bolsa x 1.100 ml",
                "Lacteo/Huevos y refrigerados",
                "Leches",
                3000,
                "https://metrocolombiafood.vteximg.com.br/arquivos/ids/161293-1000-1000/Leche-Colanta-Entera-x-1.1-Lts-Bolsa.jpg"
        );

        // Mostrar detalles de los productos
        p1.mostrarDetalles();
        p2.mostrarDetalles();
        p3.mostrarDetalles();
        p4.mostrarDetalles();
        p5.mostrarDetalles();
    }
}