import java.io.IOException;

/**
 * Esta clase llama a generar los numeros aleatorios, luego []
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @author Jose Jo 14141
 * @since 30/07/2016
 * @version 1.0
 */
public class main {
    public static void main(String[] args) throws IOException {
        RandomGenerator randomGenerator = new RandomGenerator("numeros.txt");
        randomGenerator.generar();  // Generar los numeros aleatorios

        int[] arreglo = randomGenerator.obtenerNumeros();  // Obtener los numeros aleatorios en un arreglo
    }
}
