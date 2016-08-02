import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 * Esta clase llama a generar los numeros aleatorios, luego []
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @author Jose Jo 14343
 * @since 30/07/2016
 * @version 1.0
 */
public class main2 {
    public static void main(String[] args) throws IOException {
        String nombre1 = "archivoOrdenado_1.txt";
        String nombre2 = "archivoOrdenado_2.txt";
        int cantidadDeDatos;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenidod:\n");

        System.out.println("ingrese la cantidad de datos que desea ordenar:\n");
        cantidadDeDatos = entrada.nextInt();//
        RandomGenerator randomGenerator = new RandomGenerator(nombre1);
        Integer[] arreglo = randomGenerator.obtenerNumeros(nombre1, cantidadDeDatos);  // Obtener los numeros aleatorios en un arreglo de tamano "n"
        SortMachine sortMachine = new SortMachine();//cra objeto para ordenar los numeros
        Integer[]  arregloOrdenadoOrdenado;


        /**GNOME SORT**/
        //arregloOrdenadoOrdenado = sortMachine.gnomeSort(arreglo);  // Ordena arreglo ordenado
        //randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre2); // Guardar los numeros ordenados ordenados en un .txt

        /**MERGE SORT**/
        //arregloOrdenadoOrdenado = sortMachine.mergeSort(arreglo);  // Ordena arreglo ordenado
        //randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre2); // Guardar los numeros ordenados ordenados en un .txt

        /**QUICK SORT**/
        //arregloOrdenadoOrdenado = sortMachine.quickSort(arreglo, 0, arreglo.length-1);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre2);  // Guardar los numeros ordenados en un .txt


        /**RADIX SORT**/
        arregloOrdenadoOrdenado = sortMachine.radixSort(arreglo);  // Ordenar arreglo desordenado10

        randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre2); // Guardar los numeros ordenados ordenados en un .txt

    }
}