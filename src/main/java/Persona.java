import java.util.ArrayList;
import java.util.Optional;

public class Persona {
    String nombre;
    String poblacion;
    Optional<Integer> edad;

    Persona() {
        this.nombre = "";
        this.poblacion = "";
        this.edad = null;
    }

    Persona(String _nombre, String _poblacion, Optional<Integer> _edad) {
        this.nombre = _nombre;
        if (_poblacion.equals(""))
            this.poblacion = "Desconocido";
        else
            this.poblacion = _poblacion;
        this.edad = _edad;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public Optional<Integer> getEdad() {
        if (edad.isEmpty())
            return Optional.empty();
        return edad;
    }

    public void setEdad(Optional<Integer> edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
