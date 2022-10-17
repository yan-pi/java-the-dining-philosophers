# Jantar dos filosofos
O Jantar dos filósofos foi proposto por Dijkstra em 1965 como um problema de sincronização. A partir de então todos os algoritmos propostos como soluções de sincronização acabaram sendo relacionados ou testados contra o problema do Jantar dos filósofos.

# Definição do problema do jantar dos filosofos  

Lembre-se que é apenas uma analogia. Nesse sentido, cada filósofo alterna entre duas tarefas: comer ou pensar. Quando um filósofo fica com fome, ele tenta pegar os garfos à sua esquerda e à sua direita; um de cada vez, independente da ordem. Caso ele consiga pegar dois garfos, ele come durante um determinado tempo e depois recoloca os garfos na mesa. Em seguida ele volta a pensar.

Por definição, o problema em questão é:

Você é capaz de propor um algoritmo que implemente cada filósofo de modo que ele execute as tarefas de comer e pensar sem nunca ficar travado?
