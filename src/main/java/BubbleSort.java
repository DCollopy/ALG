public class BubbleSort {
    public static void main(String args[]) {
        int[] v = {5, 2, 4, 3, 0, 9, 7, 8, 1, 6};
        BubbleSort bs = new BubbleSort();
        bs.ordenar(v);
        for(int num : v) {
            System.out.print(num + " ");
        }
    }

    /**
     * Método que ordena um vetor de inteiros utilizando o algoritmo
     * de Bubble Sort.
     *
     * @param v - Vetor que será ordenado.
     */
    public void ordenar(int[] v) {
        // for utilizado para controlar a quantidade de vezes que o vetor será ordenado.
        for(int i = 0; i < v.length - 1; i++) {
            // for utilizado para ordenar o vetor.
            for(int j = 0; j < v.length - 1 - i; j++) {
        /* Se o valor da posição atual do vetor for maior que o proximo valor,
          então troca os valores de lugar no vetor. */
                if(v[j] > v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}

/**
 * Classe que contém o método main para executar o programa.Na linha 19 temos a assinatura do método que ordena um vetor de inteiros.
 * Na linha 19 temos um for para controlar a quantidade de vezes que esse vetor será ordenado, no caso (v.length – 1) vezes.
 * Na linha 21 temos um for para ordenar os elementos do vetor, este for irá ordenar (v.length – 1 – i) vezes. Na quantidade de vezes que o vetor é ordenado subtraímos pela quantidade de iterações que será realizada no caso a variável i, porque sabemos que quando uma iteração termina o ultimo elemento já está ordenado.
 * Na linha 24 verificamos se o valor da posição atual do vetor é maior que o próximo valor do vetor, se for maior trocamos os valores de lugar.
 * Codigo - http://www.universidadejava.com.br/pesquisa_ordenacao/bubble-sort/#:~:text=O%20Bubble%2DSort%20%C3%A9%20um,se%20est%C3%A3o%20na%20ordem%20desejada.
 */