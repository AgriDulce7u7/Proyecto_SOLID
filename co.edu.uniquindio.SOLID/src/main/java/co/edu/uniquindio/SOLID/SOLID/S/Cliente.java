package co.edu.uniquindio.SOLID.SOLID.S;

public class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    Cafeteria ownedByCafeteria;

    /*Constructor*/
    public Cliente() {
    }

    /*Getters and Setters*/
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Cafeteria getOwnedByCafeteria() {
        return ownedByCafeteria;
    }

    public void setOwnedByCafeteria(Cafeteria ownedByCafeteria) {
        this.ownedByCafeteria = ownedByCafeteria;
    }

    /* Método para  calcular  descuento */
    public double calcularDescuento() {
        return 0.0;
    }
}
