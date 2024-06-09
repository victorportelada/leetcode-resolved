public class Solution3110 { // Define uma classe pública chamada Solution3310.

    public int scoreOfString(String s) { // Define um método público que retorna um valor inteiro (int). O método recebe
                                         // uma string s como argumento.

        int res = 0; // Declara uma variável inteira res e a inicializa com 0. Esta variável irá
                     // armazenar a soma das diferenças absolutas entre os valores ASCII dos
                     // caracteres adjacentes.

        for (int i = 1; i < s.length(); i++) { // Inicia um laço for com a variável i começando em 1. O laço continua
                                               // enquanto i for menor que o comprimento da string s (s.length()).
                                               // i++ incrementa i em 1 a cada iteração do laço.

            res += Math.abs(s.charAt(i) - s.charAt(i - 1));
            // s.charAt(i): Obtém o caractere na posição i da string s.
            // s.charAt(i - 1): Obtém o caractere na posição i-1 da
            // string s.
            // s.charAt(i) - s.charAt(i - 1): Calcula a diferença entre
            // os valores ASCII dos caracteres na posição i e i-1.
            // Math.abs(...): Calcula o valor absoluto da diferença
            // obtida.
            // res += ...: Adiciona o valor absoluto da diferença à
            // variável res.
        }
        return res; // Retorna o valor acumulado em res, que é a soma das diferenças absolutas entre
                    // os valores ASCII dos caracteres adjacentes na string s.
    }
}

// Exemplo de Execução
// Vamos ver como o método funciona com o exemplo "hello":

// Passo 1: Inicializa res com 0.
// Passo 2: i = 1, calcula |e - h| = |101 - 104| = 3, então res = 3.
// Passo 3: i = 2, calcula |l - e| = |108 - 101| = 7, então res = 3 + 7 = 10.
// Passo 4: i = 3, calcula |l - l| = |108 - 108| = 0, então res = 10 + 0 = 10.
// Passo 5: i = 4, calcula |o - l| = |111 - 108| = 3, então res = 10 + 3 = 13.
// O método retorna 13, que é a pontuação da string "hello".

// Conclusão
// O código é eficiente e direto, utilizando um único laço for para iterar pelos
// caracteres da string e calcular a soma das diferenças absolutas entre os
// valores ASCII de caracteres adjacentes.
// A utilização do método Math.abs garante que estamos somando valores absolutos
// das diferenças, conforme requerido pelo problema.