package co.edu.uniquindio.SOLID.SOLID.L;

public abstract class Cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correoElectronico;

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

    /* Método para  calcular  descuento */
    public  abstract double valorDescuento();
}
