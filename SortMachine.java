/**
 * Esta clase contiene los distintos metodos de ordenamiento, los cuales fueron obtenidos de distintas paginas web.
 * @author Eric Mendoza 15002
 * @author Jonnathan Juarez 15377
 * @author Jose Jo 14141
 * @since 30/07/2016
 * @version 1.0
 */

public class SortMachine {

    public SortMachine(){}

    /**
     * Gnome Sort, su tiempo de ejecucion aproximado es de O(n^2).
     * Obtenido de: https://en.wikibooks.org/wiki/Algorithm_Implementation/Sorting/Gnome_sort#Java
     * @param theArray, El arreglo de numeros enteros que se quiere ordenar
     * @return Regresa el arreglo ordenado
     */
    public Integer[] gnomeSort(Integer[] theArray) {
        for (int index = 1; index < theArray.length; ) {
            if (theArray[index - 1] <= theArray[index]) {
                ++index;
            } else {
                int tempVal = theArray[index];
                theArray[index] = theArray[index - 1];
                theArray[index - 1] = tempVal;
                --index;
                if (index == 0) {
                    index = 1;
                }
            }
        }
        return theArray;
    }


    /**
     * Merge sort, su tiempo de ejecucion aproximado es de O(nlogn)
     * Obtenido de: https://www.cs.cmu.edu/Sorting%20Algorithms/MergeSort.java
     * @param a, es el arreglo que se quiere ordenar
     * @return Regresa el arreglo ordenado
     */
    public static Integer[] mergeSort(Comparable [ ] a)
    {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
        return (Integer[]) a;
    }


    private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
    {
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }


    /**
     * QuickSort, su tiempo de ejecucion promedio es de O(nlogn), en el peor de los casos O(2n)
     * Obtenido de: http://www.programcreek.com/2012/11/quicksort-array-in-java/
     * @param arr, el arreglo que se quiere ordenar
     * @param low, bajo
     * @param high, alto
     * @return Regresa el arreglo ordenado
     */
    public Integer[] quickSort(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return arr;

        if (low >= high)
            return arr;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);

        return arr;
    }

    /**
     * RadixSort, su tiempo de ejecucion promedio es de O(n)
     * Obtenido de: https://rosettacode.org/wiki/Sorting_algorithms/Radix_sort#Java
     * @param old, Es el arreglo que se quiere ordenar
     * @return Regresa el arreglo ordenado
     */
    public Integer[] radixSort(Integer[] old) {
        // Loop for every bit in the integers
        for (int shift = Integer.SIZE - 1; shift > -1; shift--) {
            // The array to put the partially sorted array into
            Integer[] tmp = new Integer[old.length];
            // The number of 0s
            int j = 0;

            // Move the 0s to the new array, and the 1s to the old one
            for (int i = 0; i < old.length; i++) {
                // If there is a 1 in the bit we are testing, the number will be negative
                boolean move = old[i] << shift >= 0;

                // If this is the last bit, negative numbers are actually lower
                if (shift == 0 ? !move : move) {
                    tmp[j] = old[i];
                    j++;
                } else {
                    // It's a 1, so stick it in the old array for now
                    old[i - j] = old[i];
                }
            }

            // Copy over the 1s from the old array
            for (int i = j; i < tmp.length; i++) {
                tmp[i] = old[i - j];
            }

            // And now the tmp array gets switched for another round of sorting
            old = tmp;
        }

        return old;
    }

}
