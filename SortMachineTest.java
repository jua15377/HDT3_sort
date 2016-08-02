import static org.junit.Assert.*;

/**
 * @author Jose Jo 14343
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @since 30/07/2016
 * @version 1.0
 * 
 */
public class SortMachineTest {
    private SortMachine sortMachine = new SortMachine();

    //org.junit.Test
    public void gnomeSort() throws Exception {
        Integer[] prueba = {9, 0, 1, 2, 8, 3, 7, 4, 6, 5};
        Integer[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] resultado = sortMachine.gnomeSort(prueba);
        assertArrayEquals(esperado, resultado);
    }

    //org.junit.Test
    public void mergeSort() throws Exception {
        Integer[] prueba = {9, 0, 1, 2, 8, 3, 7, 4, 6, 5};
        Integer[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] resultado = sortMachine.mergeSort(prueba);
        assertArrayEquals(esperado, resultado);
    }

    //org.junit.Test
    public void quickSort() throws Exception {
        Integer[] prueba = {9, 0, 1, 2, 8, 3, 7, 4, 6, 5};
        Integer[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] resultado = sortMachine.quickSort(prueba, 0, prueba.length-1);
        assertArrayEquals(esperado, resultado);
    }

    //org.junit.Test
    public void radixSort() throws Exception {
        Integer[] prueba = {9, 0, 1, 2, 8, 3, 7, 4, 6, 5};
        Integer[] esperado = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer[] resultado = sortMachine.radixSort(prueba);
        assertArrayEquals(esperado, resultado);
    }

}