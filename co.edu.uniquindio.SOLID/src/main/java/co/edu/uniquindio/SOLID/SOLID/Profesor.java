package co.edu.uniquindio.SOLID.SOLID;


import co.edu.uniquindio.SOLID.SOLID.Enum.TipoProfesor;
import co.edu.uniquindio.SOLID.SOLID.S.Cliente;

public class Profesor extends Cliente {
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
