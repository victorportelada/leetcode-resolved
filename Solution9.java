class Solution9 {
    public boolean isPalindrome(int x) {
        // Verifica se o número é negativo ou se termina com 0 (mas não é 0)
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int reversed = 0;
        int original = x;

        // Reverte a metade do número
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // Verifica se o número original é igual ao número revertido
        // ou se é igual ao número revertido sem o último dígito (para casos ímpares)
        return (x == reversed) || (x == reversed / 10);
    }
}

// Definição da Classe e do Método:

// A classe Solution contém um método isPalindrome que recebe um inteiro x e retorna um valor booleano (true ou false).
// Verificação Inicial:

// if (x < 0 || (x != 0 && x % 10 == 0)): Verifica se x é um número negativo ou se termina com zero (mas não é zero). Números negativos e números que terminam em zero (exceto o próprio zero) não podem ser palíndromos.
// Negativo (x < 0): Números negativos não podem ser palíndromos porque o sinal de menos não é simétrico.
// Termina com zero (x % 10 == 0 e x != 0): Números que terminam em zero (exceto o próprio zero) não podem ser palíndromos porque, ao inverter, o zero estaria na frente, o que não é permitido para um número palíndromo.
// Inicialização das Variáveis:

// int reversed = 0: Inicializa reversed para construir o número invertido.
// int original = x: Armazena o valor original de x para comparações posteriores.
// Reversão da Metade do Número:

// while (x > reversed): Continua o loop enquanto x for maior que reversed.
// reversed = reversed * 10 + x % 10: Adiciona o último dígito de x a reversed multiplicando reversed por 10 e somando o resto da divisão de x por 10 (x % 10).
// x /= 10: Remove o último dígito de x dividindo x por 10 (divisão inteira).
// Verificação de Palíndromo:

// return (x == reversed) || (x == reversed / 10): Verifica se x é igual a reversed ou se x é igual a reversed dividido por 10 (para tratar casos de números com um número ímpar de dígitos).
// Igualdade Exata (x == reversed): Verifica se x é exatamente igual a reversed.
// Desconsiderar o Dígito do Meio (x == reversed / 10): Verifica se x é igual a reversed dividido por 10, o que remove o dígito do meio no caso de números com um número ímpar de dígitos.
// Exemplo
// Input: x = 121

// Processo: reversed é construído como 121 enquanto x é reduzido para 0.
// Verificação: 121 == 121, retorna true.
// Input: x = -121

// Processo: Número negativo, retorna false imediatamente.
// Input: x = 10

// Processo: Termina em zero e não é zero, retorna false imediatamente.
