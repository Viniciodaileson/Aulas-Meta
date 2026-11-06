# 02 — Exercícios em Java

Todos os arquivos estão no pacote padrão (sem `package`), por isso ficam na mesma pasta e são compilados juntos.

## Arquivos

| Arquivo | Descrição | Conceitos |
| --- | --- | --- |
| [`Trabalho01.java`](Trabalho01.java) | Converte um valor em dólares para reais | `Scanner`, `double`, `printf` |
| [`Trabalho02.java`](Trabalho02.java) | Lê 4 números, mostra o quadrado de cada um e a soma | array, `for` |
| [`Trabalho03.java`](Trabalho03.java) | Calcula o total de vendas e a comissão de 5% de um vendedor | `String`, `double`, percentual |
| [`Pastelaria.java`](Pastelaria.java) | Caixa de pastelaria com pedidos e resumo da compra | `while`, `equalsIgnoreCase`, `continue` |
| [`Loja.java`](Loja.java) | Resumo de compra com subtotal, desconto e troco | cálculos, formatação |
| [`Produto.java`](Produto.java) | Classe que representa um produto (nome, preço e estoque) | classe, construtor, métodos |
| [`Main.java`](Main.java) | Menu do sistema de papelaria usando a classe `Produto` | `switch`, `do...while`, POO |
| [`Incremento.java`](Incremento.java) | Demonstra `x++` (pós) e `++x` (pré-incremento) | operadores |

## Como compilar e executar

```bash
cd 02-java
javac *.java
java Main          # sistema de papelaria
java Trabalho01    # exercício do dólar
java Pastelaria    # caixa da pastelaria
```

> A classe `Main` depende de `Produto.java`. Compile os dois juntos (`javac Produto.java Main.java`) ou use `javac *.java`.

## Correções aplicadas

- `Pastelaria.java`: o resumo era impresso antes do laço de pedidos, sempre com valores zerados. Agora é calculado ao final.
- `Loja.java`: o desconto era usado como quantidade e como valor ao mesmo tempo; o subtotal usava o valor pago. O cálculo foi refeito com percentual.
- Nomes de classes e arquivos foram padronizados (`Trabalho01`, `Trabalho02`, ...) para seguir a regra do Java de que o arquivo deve ter o mesmo nome da classe pública.
