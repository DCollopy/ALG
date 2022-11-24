// Java program for the above approach
import java.io.*;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class QuickSortMutliThreading
        extends RecursiveTask<Integer> {

    int start, end;
    int[] arr;

    /**
     * Encontre o elemento aleatório e particione
     * array on a pivot.
     * array de inteiros
     * Entao sao muitos elementes diferentes
     * particione o algoritimo.
     * @param start
     * @param end
     * @param arr
     * @return
     */
    private int partition(int start, int end,
                          int[] arr)
    {

        int i = start, j = end;

        // Decidir o elemento aleatorio
        int elemento = new Random()
                .nextInt(j - i)
                + i;

        // O elemento aleatorio e trocado com o ultimo elemento
        // elementp do array;
        int t = arr[j];
        arr[j] = arr[elemento];
        arr[elemento] = t;
        j--;

        // Inicio da particao
        while (i <= j) {

            if (arr[i] <= arr[end]) {
                i++;
                continue;
            }

            if (arr[j] >= arr[end]) {
                j--;
                continue;
            }

            t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
            j--;
            i++;
        }

        // Elemtento aleatorio e trocado com o elemento
        //posicao corrente
        t = arr[j + 1];
        arr[j + 1] = arr[end];
        arr[end] = t;
        return j + 1;
    }

    //Implementando a funcao
    // Metodo quicksort
    public QuickSortMutliThreading(int start,
                                   int end,
                                   int[] arr)
    {
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute()
    {
        // Base de caso
        if (start >= end)
            return null;

        // encontre o elemento
        int p = partition(start, end, arr);

        // Divide o array
        QuickSortMutliThreading left
                = new QuickSortMutliThreading(start,
                p - 1,
                arr);

        QuickSortMutliThreading right
                = new QuickSortMutliThreading(p + 1,
                end,
                arr);

        // Invoque o elemento a esquerda
        left.fork();
        right.compute();

        // Espera a execucao do elemento a esquerda
        left.join();

        // Nos nao precisamos retornar nada
        return null;
    }

    // Driver Code
    public static void main(String args[])
    {
        int n = 7;
        int[] arr = { 54, 64, 95, 82, 12, 32, 63 };


        // Mantem o numero de threads
        // Cria um pool de threads
        ForkJoinPool pool
                = ForkJoinPool.commonPool();


        // Inica o primeiro thread em fork
        // Junta o resultado
        pool.invoke(
                new QuickSortMutliThreading(
                        0, n - 1, arr));

        // Imprime os elementos ordenados
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    //https://www.geeksforgeeks.org/quick-sort-using-multi-threading/
}
