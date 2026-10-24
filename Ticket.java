public class Ticket {
    private Producto producto1;
    private Producto producto2;
    private double total;
    private double pago;
    private double cambio;

    public Ticket(Producto producto1, Producto producto2, double pago) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.pago = pago;
        this.total = producto1.getPrecio() + producto2.getPrecio();
        this.cambio = pago - total;
    }

    public Producto getProducto1() {
        return producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }

    public double getTotal() {
        return total;
    }

    public double getPago() {
        return pago;
    }

    public double getCambio() {
        return cambio;
    }

    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
        this.total = this.producto1.getPrecio() + this.producto2.getPrecio();
        this.cambio = this.pago - this.total;
    }

    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
        this.total = this.producto1.getPrecio() + this.producto2.getPrecio();
        this.cambio = this.pago - this.total;
    }

    public void setDineroRecibido(double pago) {
        this.pago = pago;
        this.cambio = pago - total;
    }

    public String toString() {
        return "Datos del ticket: " + "\n"
                        + this.producto1.toString() + "\n"
                        + this.producto2.toString() + "\n"
                        + "Total: " + this.total + "\n"
                        + "Pago: " + this.pago + "\n"
                        + "Cambio: " + this.cambio;
    }
}

    

