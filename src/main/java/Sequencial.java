public class Sequencial {
    public static void main(String[] args) {
        Sequencial seq = new Sequencial();

        int[] numeros = {5, 4, 0, 8, 7, 9};

        seq.pesquisarNumero(0, numeros);
        seq.pesquisarNumero(3, numeros);
    }

    /**
     * Método utilizado para procurar se um elemento está dentro do vetor.
     * Este método utiliza o algoritmo de Pesquisa Sequencial para encontrar
     * o elemento.
     *
     * @param x    - Número que será procurado.
     * @param numeros - Vetor de números.
     */
    public void pesquisarNumero(int x, int[] numeros) {
        int cont = 0;

        for(cont = 0; cont < numeros.length; cont++) {
            //Verifica se o elemento que está sendo procurado está no vetor.
            if (numeros[cont] == x) {
                //Se encontrou o elemento, imprime ele na tela e para a pesquisa.
                System.out.println("Encontrou o número " + x);
                break;
            }
        }

        //Verifica se não encontrou o elemento no vetor.
        if(cont >= numeros.length)
            System.out.println("Não encontrou o número " + x);
    }
}
