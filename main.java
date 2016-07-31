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
        RandomGenerator randomGenerator = new RandomGenerator("numeros.txt");  // Se instancia clase para generar numeros aleatorios
        randomGenerator.generar();  // Generar los numeros aleatorios  // Se generan los 3000 numeros aleatorios

        Integer[] arreglo = randomGenerator.obtenerNumeros("numeros.txt", 3000);  // Obtener los numeros aleatorios en un arreglo de tamano "n"

        SortMachine sortMachine = new SortMachine();
        Integer[] arregloOrdenado, arregloOrdenadoOrdenado;

        /**GNOME SORT**/
        //arregloOrdenado = sortMachine.gnomeSort(arreglo);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.gnomeSort(arregloOrdenado);  // Ordena arreglo ordenado

        /**MERGE SORT**/
        //arregloOrdenado = SortMachine.mergeSort(arreglo);  // Ordena arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.mergeSort(arregloOrdenado);  // Ordena arreglo ordenado

        /**QUICK SORT**/
        //arregloOrdenado = sortMachine.quickSort(arreglo, 0, arreglo.length-1);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.quickSort(arregloOrdenado,  0, arregloOrdenado.length-1);  // Ordena arreglo ordenado

        /**RADIX SORT**/
        //arregloOrdenado = sortMachine.radixSort(arreglo);  // Ordenar arreglo desordenado
        //randomGenerator.guardarNumeros(arregloOrdenado, "numerosOrdenados.txt");  // Guardar los numeros ordenados en un .txt
        //arregloOrdenadoOrdenado = sortMachine.radixSort(arregloOrdenado);  // Ordena arreglo ordenado


    }
}
