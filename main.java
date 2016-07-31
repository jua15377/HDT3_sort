import java.io.IOException;
import java.io.File;
import java.util.Scanner;

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
        String nombre1,nombre2,nombre3;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenidod. \nIngrese el nombre del archivo donde desea guadar los numeros aleatorios(agregue .txt al final del archivo) :");
        nombre1 = entrada.nextLine();//obteniendo el nombre del archivo para los numeros aleatorios
        File archivoInicio = new File(nombre1);
        archivoInicio.createNewFile();//creando archivo
        RandomGenerator randomGenerator = new RandomGenerator(nombre1);  // Se instancia clase para generar numeros aleatorios
        randomGenerator.generar();  // Generar los numeros aleatorios  // Se generan los 3000 numeros aleatorios

        Integer[] arreglo = randomGenerator.obtenerNumeros(nombre1, 3000);  // Obtener los numeros aleatorios en un arreglo de tamano "n"

        SortMachine sortMachine = new SortMachine();
        Integer[] arregloOrdenado, arregloOrdenadoOrdenado;

        nombre2 = "archivoOrdenado_1.txt";
        nombre3 = "archivoOrdenadp_2.txt";
        File archiOrd_Uno = new File(nombre2);
        archiOrd_Uno.createNewFile();//creando archivo
        File archiOrd_Dos = new File(nombre3);
        archiOrd_Uno.createNewFile();//creando archivo


        /**GNOME SORT**/
        arregloOrdenado = sortMachine.gnomeSort(arreglo);  // Ordenar arreglo desordenado
        randomGenerator.guardarNumeros(arregloOrdenado, nombre2);  // Guardar los numeros ordenados en un .txt
        arregloOrdenadoOrdenado = sortMachine.gnomeSort(arregloOrdenado);  // Ordena arreglo ordenado
        randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre3); // Guardar los numeros ordenados ordenados en un .txt

        /**MERGE SORT**/
        //arregloOrdenado = SortMachine.mergeSort(arreglo);  // Ordena arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.mergeSort(arregloOrdenado);  // Ordena arreglo ordenado
        //randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre3); // Guardar los numeros ordenados ordenados en un .txt

        /**QUICK SORT**/
        //arregloOrdenado = sortMachine.quickSort(arreglo, 0, arreglo.length-1);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.quickSort(arregloOrdenado,  0, arregloOrdenado.length-1);  // Ordena arreglo ordenado
        //randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre3); // Guardar los numeros ordenados ordenados en un .txt

        /**RADIX SORT**/
        //arregloOrdenado = sortMachine.radixSort(arreglo);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.radixSort(arregloOrdenado);  // Ordena arreglo ordenado
        //randomGenerator.guardarNumeros(arregloOrdenadoOrdenado, nombre3); // Guardar los numeros ordenados ordenados en un .txt

    }
}
