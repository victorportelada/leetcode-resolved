// SOLUCAO 1 - BRUTE FORCE

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) { // Loop externo, itera sobre cada elemento do array

            for (int j = i + 1; j < n; j++) { // Loop interno, itera sobre cada elemento após o elemento atual do loop
                                              // externo

                if (nums[i] + nums[j] == target) { // Verifica se a soma dos dois elementos é igual ao target

                    return new int[] { i, j }; // Retorna os índices dos dois elementos
                }
            }
        }
        return new int[] {}; // Retorna um array vazio se não encontrar a solução (embora isso não deva
                             // acontecer dado o problema)
    }
}

// Descrição:

// int n = nums.length; - Obtém o tamanho do array nums.
// O primeiro for loop itera sobre cada elemento do array até o penúltimo
// elemento.
// O segundo for loop começa do elemento seguinte ao atual no primeiro loop e
// vai até o último elemento.
// Dentro do segundo for, a condição if(nums[i] + nums[j] == target) verifica se
// a soma dos elementos nums[i] e nums[j] é igual ao target.
// Se a condição for verdadeira, retorna um array contendo os índices [i, j].
// Complexidade de Tempo: O código fornecido tem complexidade O(n²) devido aos
// dois loops aninhados.

// ------------------------------------------------------------------------------------------------------------------

// Solução Alternativa com Melhor Complexidade de Tempo

// Podemos usar uma abordagem com um mapa (hashmap) para reduzir a complexidade
// para O(n):

import java.util.HashMap;
import java.util.Map;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // Cria um hashmap para armazenar o valor e o índice

        for (int i = 0; i < nums.length; i++) { // Itera sobre cada elemento do array

            int complement = target - nums[i]; // Calcula o complemento que somado ao elemento atual resulta no target

            if (map.containsKey(complement)) { // Verifica se o complemento já está no hashmap

                return new int[] { map.get(complement), i }; // Se estiver, retorna os índices do complemento e do
                                                             // elemento atual
            }
            map.put(nums[i], i); // Adiciona o elemento atual e seu índice no hashmap
        }

        throw new IllegalArgumentException("No two sum solution"); // Lança uma exceção se não encontrar solução
    }
}

// Descrição:

// Cria um HashMap para armazenar os valores do array como chaves e seus
// respectivos índices como valores.
// Itera sobre o array nums.
// Para cada elemento nums[i], calcula o complemento (target - nums[i]).
// Verifica se o complemento já existe no mapa:
// Se existir, retorna os índices do complemento e do elemento atual.
// Se não existir, adiciona o valor atual e seu índice ao mapa.
// Se terminar o loop sem encontrar a solução, lança uma exceção.
// Complexidade de Tempo: O(n), pois cada inserção e busca no HashMap são O(1)
// em média.