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
    public void generar(int tamano) throws IOException {
        Random random = new Random(System.currentTimeMillis());
        FileWriter writer = new FileWriter(direccion);
        PrintWriter escribir = new PrintWriter(writer);

        for (int i = 0; i < tamano; i++) {
            escribir.println(random.nextInt(3001));
        }

        escribir.close();
    }

    /**
     * Este metodo sirve para alacenar un listado de enteros en un archivo en un arreglo de enteros
     * @param archivo, Es el archivo fuente
     * @return Regresa un arreglo con los numeros del archivo indicado
     * @throws IOException
     */
    public Integer[] obtenerNumeros(String archivo, int tamano) throws IOException{
        Integer[] arreglo = new Integer[tamano];
        BufferedReader reader = new BufferedReader(new FileReader(archivo));  // Abre documento para su lectura

        for (int i = 0; i < arreglo.length; i++) {
            int numero = Integer.parseInt(reader.readLine());  // Lee linea por linea
            arreglo[i] = numero;  // Agregar al arreglo
        }
        reader.close();  // Se finaliza el lector
        return arreglo;
    }


    /**
     * Este método guarda los numeros de un arreglo, en un documento dado
     * @param arreglo, Es el arreglo fuente con los numeros a guardar
     * @param direccionOrdenada, es el archivo de destino para los numeros
     * @throws IOException
     */
    public void guardarNumeros(Integer[] arreglo, String direccionOrdenada) throws IOException{
        FileWriter writer = new FileWriter(direccionOrdenada);
        PrintWriter escribir = new PrintWriter(writer);

        for (int i = 0; i < arreglo.length; i++) {
            escribir.println(arreglo[i]);
        }
        escribir.close();
    }
}
