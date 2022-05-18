import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Optional;

@Data
//@Setter
//@Getter
//@AllArgsConstructor
//@NoArgsConstructor
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
}
