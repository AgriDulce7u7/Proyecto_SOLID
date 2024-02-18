package co.edu.uniquindio.SOLID.Model;


import co.edu.uniquindio.SOLID.Model.Enum.TipoProfesor;

public class Profesor extends Cliente{
    private TipoProfesor tipoProfesor;

    /*constructor*/
    public Profesor() {
    }

    /*Getters and setters*/
    public TipoProfesor getTipoProfesor() {
        return tipoProfesor;
    }

    public void setTipoProfesor(TipoProfesor tipoProfesor) {
        this.tipoProfesor = tipoProfesor;
    }
}
