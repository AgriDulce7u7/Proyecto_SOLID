package co.edu.uniquindio.SOLID.SOLID.S;

public class DetalleFactura {
    private int cantidad;
    Factura ownedByFactura;
    public Producto productoAsociado;

    /*Constructor*/
    public DetalleFactura() {
    }

    /*Getters abd setters*/
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Factura getOwnedByFactura() {
        return ownedByFactura;
    }

    public void setOwnedByFactura(Factura ownedByFactura) {
        this.ownedByFactura = ownedByFactura;
    }

    public Producto getProductoAsociado() {
        return productoAsociado;
    }

    public void setProductoAsociado(Producto productoAsociado) {
        this.productoAsociado = productoAsociado;
    }

    /* Método para calcular el valor de detalle de la factura */
    public double calularValorDetalle() {
        return 0.0;
    }
}
