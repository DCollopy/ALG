# Algoritimo avançados 


Descreva os três algoritmos de pesquisa abaixo, além de analisar a complexidade temporal (melhor caso, caso médio e pior caso) de cada algoritmo.
* **Pesquisa sequencial;** 

Quando itens de dados são armazenados em uma coleção, como uma lista, dizemos que eles têm uma relação linear ou sequencial. Cada item de dados é armazenado em uma posição relativa aos outros.
A busca linear ou sequencial em um vetor Java pode ser descrito pelos seguintes passos:

1) Efetua a varredura dos elementos do vetor.
2) Compara o valor do elemento atual do vetor com o valor sendo pesquisado.
3) Se o valor for encontrado, efetue o procedimento desejado com o elemento do vetor.
4) Se a varredura alcançar o último elemento do vetor e o valor pesquisado não for encontrado, 
exiba uma mensagem de erro ou algum outro procedimento para alertar o usuário do programa.

`
public class Sequencial {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int valor = 5;
        int posicao = -1;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                posicao = i;
                break;
            }
        }
        if (posicao == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("Valor encontrado na posição " + posicao);
        }
    }
}
`

Análise de Complexidade

* [x] **Melhor caso - O(1)  elemento a ser buscado é encontrado logo na primeira tentativa da busca
  
* [x] Caso médio - o elemento é encontrado após (N+1)/2 comparações. O algoritmo de busca linear é um algoritmo O(n)
 
* [x] Pior caso - O(n) o elemento a ser buscado encontra-se na última posição e são feitas N comparações, sendo N o número total de elementos**


* **Pesquisa binária;**

A busca/pesquisa binária ou binary search é um algoritmo que implementa o paradigma Divisão e Conquista para encontrar um elemento 
em um vetor ordenado

Em algoritmos de pesquisa binária, o método "dividir e conquistar" funciona deste modo:

Divide a lista em duas partes: o lado esquerdo e o lado direito, separados pelo item do meio
Cria uma variável para armazenar o valor do item procurado
Seleciona o elemento do meio e o compara com o item procurado
Se os itens comparados forem iguais, retorna a posição do elemento do meio e o processo termina
Caso contrário, o elemento do meio será maior ou menor que o item que você está procurando. Se for maior, o algoritmo pega a lista da esquerda e recomeça a divisão do primeiro passo, até achar o elemento ou percorrer toda a lista. Se o elemento do meio for menor, ele pega a lista da direita e recomeça o processo.
Você pode implementar esse método usando recursão ou iteração no processo de pesquisa binária.

Existem dois métodos que podem implementar a técnica "dividir e conquistar" na pesquisa. Eles são a iteração e a recursão.

**O que é Iteração?**

Para obter elementos de uma tupla, lista ou um dicionário, você itera pelos itens com laços.

A iteração é a repetição de uma sequência de instruções durante a execução e possui um número contável de valores. Por exemplo, ao percorrer listas aleatórias, percorremos a variável real que contém as listas para obter esses valores.

**O que é recursão?**

Uma função é dita recursiva se faz referência a si mesma ou a termos anteriores para resolver uma tarefa.

Uma função recursiva é repetitiva e é executada em sequência. Ela começa a partir de um problema complexo e o divide em problemas mais simples.


**Análise de Complexidade**

Algoritmo Busca Binária. Ele é ótimo e eficiente. É aplicável como solução em problemas de busca onde os elemento estão ordenados. Estruturas como Arrays e Listas encadeadas podem utilizar esse algoritmo de busca de forma eficiente.
* [x] **Melhor caso - 0(1)
Sua complexidade de tempo de execução, O(log n) é melhor comparada à busca sequencial O(n). Através do paradigma Dividir para Conquistar esse algoritmo pode ser implementado de forma recursiva ou iterativa.

* [x] Caso médio - O(log n)
* [x] Pior caso -  O(log n)}Ocorre quando o elemento que buscamos não está no vetor. Tanto a versão iterativa, como a versão recursiva possuem complexidade de O(log n)**

* **Pesquisa sequencial multithread.**
  "Uma Thread é Um fluxo de controle sequencial isolado dentro de um programa"
  Como um programa sequencial qualquer, um thread tem um começo, um fim, e uma seqüência de comandos. Entretanto, um thread não é um programa, não roda sozinho, roda dentro de um programa.
  Threads permitem que um programa simples possa executar várias tarefas diferentes ao mesmo tempo, independentemente umas das outras. Programas multi-threaded são programas que contém vários threads, executando tarefas distintas, ao mesmo tempo.

* [x] **Melhor caso - O(nlogn)
* [x] Caso médio - O(n2)
* [x] Pior caso - O(n2)  **



2. Escolha um algoritmo de ordenação para análise. O algoritmo Bubble Sort não é uma opção válida. E responda:

* Qual a complexidade temporal do algoritmo: melhor caso, caso médio e pior caso?
  Bubble Sort
* [x] **Melhor caso - a complexidade do Bubble Sort no melhor caso é O(n).
* [x] Caso médio - a complexidade no caso médio é O(n2)
* [x] Pior caso - no pior caso, o Bubble Sort tem complexidade O(n2).**

Counting Sort algoritimo
* [x] **Melhor caso - O(n+K)
* [x] Caso médio - O(n+K)
* [x] Pior caso - O(n+K).**


* Apresentar o algoritmo, de preferência em Java, C# ou Python, explicando o seu funcionamento.
  * [x] Classe Java apresentado caminho - src/br/com/ordenacao/BubbleSort.java

* Codigo em C++
````
#include <iostream>

void countSort(int upperBound, int lowerBound, std::vector<int> numbersToSort) //limites superior e inferior dos números no vetor
{
int range = upperBound - lowerBound;                  //cria um intervalo grande o suficiente para obter todos os números entre o mínimo e o máximo
std::vector<int> counts (range);                      //inicializa contagens do tamanho do intervalo
std::fill(counts.begin(), counts.end(), 0);           //preenche os vetores com zeros

for (int i = 0; i < numbersToSort.size(); i++)
{
int index = numbersToSort[i] - lowerBound; //Por exemplo, se 5 for o limite inferior e numberToSort[i] for 5. index será 0 e o       counts[index]+= 1;                         //contagem de 5 será armazenada em counts[0]
}

std::cout << counts << std::endl;
}

* https://www.freecodecamp.org/portuguese/news/algoritmos-de-ordenacao-explicados-com-exemplos-em-python-java-e-c/
````
Outro exempo em java
* [x] Classe Java apresentado caminho - src/br/com/ordenacao/CountingSort.java

Criando uma função para o Bubble Sort em Python
````
def bubble_sort(list1):  
# Loop para percorrer a lista 
for i in range(0,len(list1)-1):  
for j in range(len(list1)-1):  
if(list1[j]>list1[j+1]):  
temp = list1[j]  
list1[j] = list1[j+1]  
list1[j+1] = temp  
return list1

list1 = [5, 3, 8, 6, 7, 2]  
print("Sua lista não ordenado : ", list1)
# Chamando a função bubble_sort
print("A lista ordenada: ", bubble_sort(list1))

No código acima, definimos uma função bubble_sort() que recebe list1 como argumento.

Dentro da função, definimos dois loops for - o primeiro loop for itera a lista completa e o segundo loop for itera a lista e compara os dois elementos em todas as iterações do loop externo.
O loop for será encerrado quando atingir o final.
Definimos a condição no loop for interno; se um primeiro valor de índice for maior que o segundo valor de índice, troque suas posições entre si.
Chamamos a função e passamos uma lista; iterou e retornou a lista classificada.

Referencia - https://www.javatpoint.com/bubble-sort-in-python
````
Criando bubble sort em C#
```
public static int[] bubbleSort(int[] vetor)
{
int tamanho = vetor.Length;
int comparacoes = 0;
int trocas = 0;

	for (int i = tamanho - 1; i >= 1; i--)
	{
		for (int j = 0; j < i; j++)
		{
			comparacoes++;
			if (vetor[j] > vetor[j + 1])
			{
				int aux = vetor[j];
				vetor[j] = vetor[j + 1];
				vetor[j + 1] = aux;
				trocas++;
			}
		}
	}

	return vetor;
}

 linha 134 - comprimento do vetor
 linha 138 ele faz um for usando o tamanho do vetor
 linha 143 Se o valor da posição atual do vetor for maior que o proximo valor, então troca os valores de lugar no vetor.
 ````

* É possível a implementação de threads para melhorar o desempenho do algoritmo? Se sim, como seria esta implementação?
  QuickSort é uma técnica de classificação popular baseada no algoritmo de divisão e conquista. Nesta técnica, um elemento é escolhido como pivô e o array é particionado em torno dele. O objetivo da partição é, dado um array e um elemento x do array como pivô, colocar x em sua posição correta em um array ordenado e colocar todos os elementos menores (menores que x) antes de x, e colocar todos os elementos maiores (maior que x) depois de x.
  Multi-threading permite a execução simultânea de duas ou mais partes de um programa para utilização máxima da CPU. Cada parte desse programa é chamada de thread. Portanto, threads são processos leves dentro de um processo
  A thread principal chama o método quicksort.
  O método particiona o array e verifica o número de threads atuais.
  Novos threads são chamados para a próxima etapa usando o mesmo método paralelo.
  Use o método quicksort normal único.
* [x] Classe Java apresentado caminho - src/br/com/ordenacao/QuickSortMultiThreading.java

Para implementar este algoritmo, siga as etapas mencionadas abaixo-

Importamos o módulo de encadeamento para criar encadeamentos. Além disso, também importamos o módulo itertools, que usamos para mesclar todas as sublistas em uma única lista ao final de nosso programa. Os outros dois módulos, time e random, são usados para acompanhar o tempo de execução do programa e gerar uma lista com números aleatórios no final para testar nosso programa.
Em seguida, criamos um bloqueio de thread. Isso nos ajuda a sincronizar nosso uso de threads. Como estamos classificando, isso garante que a ordem dos threads seja mantida. Ele também garante que nossos itens de lista não se misturem após a ativação do encadeamento e durante o cálculo em cada encadeamento.
Em seguida, criamos uma função geral de classificação de bolhas, onde primeiro adquirimos o bloqueio. Isso ajuda o thread a adquirir o bloqueio e garante que o acesso a esse bloqueio seja bloqueado até que o bloqueio seja liberado. O resto da função para classificação de bolhas é a mesma de sempre. Primeiro obtemos o comprimento da lista. Em seguida, percorremos a lista trocando todos os elementos em ordem até que toda a lista esteja classificada. Depois disso, liberamos o bloqueio, para que outras threads possam usar o bloqueio.
Por fim, criamos uma função Parallel_bubble_sort separada. Primeiro, obtemos o maior elemento da lista e, em seguida, definimos o número de threads a serem usados para classificar paralelamente. Em seguida, criamos sublistas separadas de acordo com o número de tópicos. Usando o maior elemento da lista e o número de threads, calculamos um número que nos ajuda a decidir a distribuição dos itens da lista em diferentes sublistas. Isso é chamado de split_factor no programa.
Dentro da mesma função, usando um loop for, adicionamos itens de lista a cada sublista. Cada sublista subsequente contém elementos que são maiores que os elementos da sublista anterior. Depois de adicionar itens de lista em sublistas, removemos esses itens da lista principal, para evitar repetição. Por fim, se houver mais itens na lista, os adicionamos à última sublista.
Mais tarde, lidamos com a parte de encadeamento de nosso Parallel_bubble_sort. Para ativar o thread, usamos o método thread. Usando um loop for, passamos como parâmetros, a função bubblesort e cada sublista um por um. Em seguida, iniciamos o thread usando o método start. Também criamos uma lista de tópicos ativos para acompanhá-los. Depois de ativar o thread, nós o anexamos à lista active_threads, para que mais tarde possamos interrompê-los. Depois de ativar todos os threads, nós os fechamos usando outro loop for usando o método join.
Mesclamos todas as sublistas usando o módulo itertools e o método chain. Como o método chain retorna um objeto, não podemos imprimi-lo diretamente. Então, nós o convertemos em uma lista no final
````
# Alternate Threading Version
import time
import random
import threading
import itertools

# start time counter to calculate runtime
start_time = time.time()

# create a threading lock
lock = threading.Lock()

# normal bubble sort function
def bubblesort(lst):

        # acquire a lock for thread
        lock.acquire()
        
        # get length of list
        n = len(lst)
        
        # perform bubble sort
        for i in range(n):
                swap = False
                for j in range(0, n-i-1):
                    if lst[j]>lst[j+1]:
                        lst[j], lst[j+1] = lst[j+1], lst[j]
                        swap = True
                if swap == False:
                        break
        
        # release the lock after calculation
        lock.release()

# create parallel bubble sort function
# this function uses normal bubble sort function

def Parallel_bubble_sort(lst):

        # get biggest element in the list
        biggest_item = max(lst)
        
        # set number of threads 
        # as per the number of cores
        # each core can run 2 threads ideally
        no_threads = 4
        
        # create sublists as per number of threads
        lists = [[] for _ in range(no_threads)]
        
        # we use a number to divide the list 
        # into class intervals for each sublist
        
        split_factor = biggest_item//no_threads

        # split list into sublists
        # as per no of threads
        for j in range(1,len(lists)):
            for i in lst:
                if i <= (split_factor*j):
                        lists[j-1].append(i)
                        
                        #remove the element from list
                        # after adding to sublist
                        # to prevent duplication
                        lst = [x for x in lst if x != i]
            # include the remaining elements in list
            # in the last sublist
            lists[-1] = lst

        # start all threads for each sublist
        active_threads = []
        for list_item in lists:
            t = threading.Thread(target=bubblesort, args=(list_item,))
            t.start()
            active_threads.append(t)
            
        # stop all active threads
        for thread in active_threads:
            thread.join()

        # merge all lists
        # into final list
        final_lst = itertools.chain(*lists)
        final_lst = list(final_lst)

# an example list with 10k elements to test
lst = [(random.randint(0,10000)) for i in range(10000)]
Parallel_bubble_sort(lst)
end_time = time.time() - start_time
print("--- Sorted in %s seconds ---" % (end_time))
````