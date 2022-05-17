import java.util.ArrayList;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        fichero f = new fichero();
        ArrayList<Persona> listaPersonas = f.muestraContenido("C:\\Users\\jenaro.camara\\Desktop\\Ejercicios-FormacionBack\\ejercicio1maven\\personas.txt");
    }
}