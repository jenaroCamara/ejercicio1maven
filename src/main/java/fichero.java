import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class fichero {
    public ArrayList<Persona> muestraContenido(String archivo) throws FileNotFoundException, IOException {
        ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
        String[] arrOfStr;
        String cadena;
        FileReader f = new FileReader(archivo);

        try {
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                arrOfStr = cadena.split(":");
                Optional <Integer> edad = arrOfStr.length<=2? Optional.empty():Optional.of(Integer.parseInt(arrOfStr[2]));
                Persona p = new Persona(arrOfStr[0], arrOfStr[1], edad);
                listaPersonas.add(p);
            }
            b.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
        muestraPersona(listaPersonas);
        return listaPersonas;
    }

    public void muestraPersona(ArrayList<Persona> lista) {
        System.out.println("---------Usuarios < 25---------");
        lista.stream().filter(p ->
                {
                    p.getEdad().orElse(0);
                    if(p.getEdad().isEmpty())
                        return false;
                    else return p.getEdad().get()<25;
                })
                .forEach(p ->System.out.println("Nombre: " + p.nombre + ", Poblacion: " + p.poblacion + ", Edad: " + p.edad.get()));
    }
}