# 01 — Lógica de programação em JavaScript

Exercícios introdutórios de lógica, resolvidos em Node.js com a biblioteca `prompt-sync` para leitura do teclado.

## Exercícios

| Arquivo | O que faz | Conceitos |
| --- | --- | --- |
| [`01-conta-numeros.js`](01-conta-numeros.js) | Lê 10 números e conta positivos, negativos e neutros | array, `for...of`, condicionais |
| [`02-impares.js`](02-impares.js) | Mostra os números ímpares de 1 até um limite | `for`, operador `%` |
| [`03-inverte-lista.js`](03-inverte-lista.js) | Lê uma lista e mostra a versão invertida | array, `for` decrescente |
| [`04-media-turma.js`](04-media-turma.js) | Calcula a média de 8 notas e conta aprovados/reprovados | `reduce`, `filter` |
| [`05-menor-numero.js`](05-menor-numero.js) | Encontra o menor de 10 números | comparação, função |
| [`06-contagem-regressiva.js`](06-contagem-regressiva.js) | Contagem regressiva até zero | `while`, decremento |
| [`07-soma-vetor.js`](07-soma-vetor.js) | Soma os 7 números de um array | `reduce` |
| [`08-tabuada.js`](08-tabuada.js) | Imprime a tabuada de 1 a 10 | `for`, template strings |

## Como executar

Na raiz do repositório:

```bash
npm install
node 01-logica-js/04-media-turma.js
```

Ou usando os scripts prontos:

```bash
npm run media-turma
```

## Observação

Os arquivos foram comentados linha a linha nos pontos importantes. As correções feitas em relação à primeira versão estão descritas no cabeçalho de cada arquivo.
