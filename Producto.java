public class Producto {
    private String nombre;
    private String departamento;
    private double precio;

    public Producto(String nombre, int departamento, double precio) {
        setNombre(nombre);
        this.departamento = determinarDepartamento(departamento);
        setPrecio(precio);
    }     
    
    public String validarNombre(String nombre) {
        if (nombre.equals("") || nombre == (" ")) {
            return "Producto desconocido";
        }
        return nombre;
    }

    public double validarPrecio(double precio) {
        if (precio <= 0) {
            return 100;
        }
        return precio;
    }

    public String determinarDepartamento(int departamento) {
        switch (departamento) {
            case 1:
                return "Ropa";
            case 2:
                return "Electronica y tecnologia";
            case 3:
                return "Higiene y cuidado personal";
            case 4:
                return "Alimentos";
            case 5:
                return "Departamento desconocido";
            default:
                return "Departamento desconocido";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = validarNombre(nombre);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(int departamento) {
        this.departamento = determinarDepartamento(departamento);
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = validarPrecio(precio);
    }
    
    @Override 
    public String toString() {
        String cadena = "Producto: " + "\n"
                        + "Nombre: " + this.nombre + "\n"
                        + "Departamento: " + this.departamento + "\n"
                        + "Precio: " + this.precio;
        return cadena;
    }
}
