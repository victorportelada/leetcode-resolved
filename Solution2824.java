// Você tem uma lista de números inteiros nums e um inteiro target. O objetivo é retornar o número de pares (i, j) onde 0 <= i < j < n e a soma de nums[i] + nums[j] é menor que target.

// Exemplos:
// Exemplo 1:
// Entrada: nums = [-1, 1, 2, 3, 1], target = 2
// Saída: 3
// Explicação: Existem 3 pares de índices que satisfazem a condição:
// (0, 1) porque nums[0] + nums[1] = -1 + 1 = 0 < 2
// (0, 2) porque nums[0] + nums[2] = -1 + 2 = 1 < 2
// (0, 4) porque nums[0] + nums[4] = -1 + 1 = 0 < 2
// Observe que (0, 3) não é contado porque nums[0] + nums[3] = -1 + 3 = 2, que não é estritamente menor que o target.
// Exemplo 2:
// Entrada: nums = [-6, 2, 5, -2, -7, -1, 3], target = -2
// Saída: 10
// Explicação: Existem 10 pares de índices que satisfazem a condição:
// (0, 1), (0, 3), (0, 4), (0, 5), (0, 6)
// (1, 4), (3, 4), (3, 5), (4, 5), (4, 6)

import java.util.List;

class Solution {
    // Método que conta os pares cuja soma é menor que o alvo
    public int countPairs(List<Integer> nums, int target) {
        int count = 0; // Inicializa a contagem de pares que atendem à condição

        // Laço externo: percorre cada elemento na lista 'nums'
        for (int i = 0; i < nums.size(); i++) {
            // Laço interno: percorre cada elemento subsequente na lista 'nums'
            for (int j = i + 1; j < nums.size(); j++) {
                // Verifica se a soma dos elementos 'nums[i]' e 'nums[j]' é menor que 'target'
                if (nums.get(i) + nums.get(j) < target) {
                    count++; // Incrementa a contagem se a condição for verdadeira
                }
            }
        }

        return count; // Retorna o número total de pares que atendem à condição
    }
}

// Inicialização:

// int count = 0; inicializa a contagem de pares que satisfazem a condição.
// Laço Externo (i):

// for (int i = 0; i < nums.size(); i++) { percorre cada elemento nums[i] na
// lista. Este laço vai do índice 0 até o penúltimo índice.
// Laço Interno (j):

// for (int j = i + 1; j < nums.size(); j++) { para cada nums[i], percorre os
// elementos subsequentes nums[j] na lista. Este laço vai de i + 1 até o último
// índice.
// Verificação da Condição:

// if (nums.get(i) + nums.get(j) < target) verifica se a soma dos elementos
// nums[i] e nums[j] é menor que target.
// Incremento da Contagem:

// count++; se a condição for verdadeira, incrementa a contagem.
// Retorno do Resultado:

// return count; retorna o número total de pares que satisfazem a condição.
// Desempenho:
// Complexidade de Tempo: O(n^2) onde n é o tamanho da lista nums. Isso ocorre
// porque para cada elemento i, o algoritmo verifica todos os elementos
// subsequentes j, resultando em uma dupla iteração aninhada.
// Complexidade de Espaço: O(1) se desconsiderarmos o espaço necessário para
// armazenar a lista de entrada, pois o algoritmo utiliza uma quantidade fixa de
// espaço adicional