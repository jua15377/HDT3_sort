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
        int cantidadDeDatos;
        Integer[] arregloOrdenado;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Bienvenido: \n");
        nombre1 = "archivoFuente.txt";
        System.out.println("ingrese la cantidad de datos que  generara y ordenara\n");
        cantidadDeDatos = entrada.nextInt();//
        File archivoInicio = new File(nombre1);
        archivoInicio.createNewFile();//creando archivo


        RandomGenerator randomGenerator = new RandomGenerator(nombre1);  // Se instancia clase para generar numeros aleatorios
        randomGenerator.generar(cantidadDeDatos);  // Generar los numeros aleatorios  // Se generan los 3000 numeros aleatorios

        Integer[] arreglo = randomGenerator.obtenerNumeros(nombre1, cantidadDeDatos);  // Obtener los numeros aleatorios en un arreglo de tamano "n"

        SortMachine sortMachine = new SortMachine();

        //CREANDO ARCHIVOS PARA GUARDAR DATOS ORDENADOS
        nombre2 = "archivoOrdenado_1.txt";
        nombre3 = "archivoOrdenado_2.txt";
        File archiOrd_Uno = new File(nombre2);
        archiOrd_Uno.createNewFile();//creando archivo
        File archiOrd_Dos = new File(nombre3);
        archiOrd_Dos.createNewFile();//creando archivo




        /**GNOME SORT**/
        //arregloOrdenado = sortMachine.gnomeSort(arreglo);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, nombre2);  // Guardar los numeros ordenados en un .txt

        /**MERGE SORT**/
        //arregloOrdenado = SortMachine.mergeSort(arreglo);  // Ordena arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, nombre2);  // Guardar los numeros ordenados en un .txt


        /**QUICK SORT**/
        //arregloOrdenado = sortMachine.quickSort(arreglo, 0, arreglo.length-1);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, nombre2);  // Guardar los numeros ordenados en un .txt


        /**RADIX SORT**/
        arregloOrdenado = sortMachine.radixSort(arreglo);  // Ordenar arreglo desordenado
        randomGenerator.guardarNumeros(arregloOrdenado, nombre2);  // Guardar los numeros ordenados en un .txt


    }
}
