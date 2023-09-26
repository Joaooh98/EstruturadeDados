Em java as filias tem o comportamento FIFO (first in first Out) 
    Significado: Primeiro a entrar, primeiro a sair.

    como de fato e esse comportamento que funciona da seguinte maneira, 
    Enfileir(queue ) o elemento na fila ele entra na ultima posicao, 
    desempilhado(dequeue) o elemento da fila ele retira o primeiro elemento da fila

    importante saber que nao e possivel instanciar a classe (Queue) pq ela nao existe no java, somente a
    interface.
    sendo assim so e possivel usar, se implentar a interface na classe criada, ou usar classes que implemente a interface Queue, exemplo e o LinkdList<>()