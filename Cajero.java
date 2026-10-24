public class Cajero {
    public static void main(String[] args) {

        System.out.println("Prueba Nombre Valido");
        Producto pNombre1 = new Producto("", 4, 50);
        System.out.println("Nombre vacio: " + pNombre1.getNombre());

        Producto pNombre2 = new Producto(" ", 4, 50);
        System.out.println("Nombre con espacio: " + pNombre2.getNombre());

        Producto pNombre3 = new Producto("Leche", 4, 50);
        System.out.println("Nombre normal: " + pNombre3.getNombre());
  

        System.out.println("Prueba Precio Valido");
        Producto pPrecio1 = new Producto("Pan", 4, 0);
        System.out.println("Precio con 0: " + pPrecio1.getPrecio());

        Producto pPrecio2 = new Producto("Pan", 4, -10);
        System.out.println("Precio negativo: " + pPrecio2.getPrecio());

        Producto pPrecio3 = new Producto("Pan", 4, 35);
        System.out.println("Precio normal: " + pPrecio3.getPrecio());


        System.out.println("Prueba Departamento");
        Producto p1 = new Producto("Playera", 1, 200);
        System.out.println(p1.toString());

        Producto p2 = new Producto("Laptop", 2, 5000);
        System.out.println(p2.toString());

        Producto p3 = new Producto("Pasta de dientes", 3, 120);
        System.out.println(p3.toString());

        Producto p4 = new Producto("Galletas", 4, 25);
        System.out.println(p4.toString());

        Producto p5 = new Producto("Producto raro", 5, 99);
        System.out.println(p5.toString());
    }
}

