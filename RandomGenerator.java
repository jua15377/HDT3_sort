import java.io.*;
import java.util.Random;

/**
 * Esta clase genera los 3000 numeros en numeros.txt
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @author Jose Jo 14141
 * @since 30/07/2016
 * @version 1.0
 */
public class RandomGenerator{
    private String direccion;

    /**
     * Constructor de clase, toma como parametro el nombre del documento donde se crearan los numeros aleatorios
     * @param direccion, nombre del archivo a editar
     */
    public RandomGenerator(String direccion){
        this.direccion = direccion;
    }

    /**
     * Este metodo genera los 3000 numeros dentro del archivo indicado
     * @throws IOException, Para el manejo de errores del documento
     */
    public void generar() throws IOException {
        Random random = new Random(System.currentTimeMillis());
        FileWriter writer = new FileWriter(direccion);
        PrintWriter escribir = new PrintWriter(writer);

        for (int i = 0; i < 3000; i++) {
            escribir.println(random.nextInt(3001));
        }

        escribir.close();
    }

    public int[] obtenerNumeros() throws IOException{
        int[] arreglo = new int[3000];
        BufferedReader reader = new BufferedReader(new FileReader(direccion));  // Abre documento para su lectura

        for (int i = 0; i < 3000; i++) {
            int numero = Integer.parseInt(reader.readLine());  // Lee linea por linea
            arreglo[i] = numero;  // Agregar al arreglo
        }
        reader.close();  // Se finaliza el lector
        return arreglo;
    }
}
