# Aulas Meta

Repositório com os exercícios e projetos desenvolvidos nas aulas do curso técnico **Meta** (Desenvolvimento de Sistemas).

O conteúdo está separado por linguagem/tecnologia, comentado e com os bugs das primeiras versões corrigidos.

## Estrutura do repositório

| Pasta | Conteúdo |
| --- | --- |
| [`01-logica-js`](01-logica-js) | 8 exercícios de lógica de programação em JavaScript (Node.js) |
| [`02-java`](02-java) | Exercícios de Java, incluindo um mini-sistema de papelaria com POO |
| [`03-html-css`](03-html-css) | 4 projetos de HTML e CSS (formulário, notícia, catálogo de filmes e loja) |
| [`docs`](docs) | Modelo lógico do banco de dados (diagrama + script SQL) |

## Como executar

### JavaScript

Pré-requisito: [Node.js](https://nodejs.org/) instalado.

```bash
npm install          # instala a dependência prompt-sync
npm run tabuada      # executa um exercício
```

Scripts disponíveis no `package.json`:

| Script | Arquivo |
| --- | --- |
| `npm run conta-numeros` | `01-logica-js/01-conta-numeros.js` |
| `npm run impares` | `01-logica-js/02-impares.js` |
| `npm run inverte-lista` | `01-logica-js/03-inverte-lista.js` |
| `npm run media-turma` | `01-logica-js/04-media-turma.js` |
| `npm run menor-numero` | `01-logica-js/05-menor-numero.js` |
| `npm run contagem-regressiva` | `01-logica-js/06-contagem-regressiva.js` |
| `npm run soma-vetor` | `01-logica-js/07-soma-vetor.js` |
| `npm run tabuada` | `01-logica-js/08-tabuada.js` |

Também é possível executar direto com `node 01-logica-js/08-tabuada.js`.

### Java

Pré-requisito: JDK 17 ou superior.

```bash
cd 02-java
javac *.java     # compila todas as classes
java Main        # executa o sistema de papelaria
java Trabalho01  # executa um exercício específico
```

### HTML e CSS

Cada projeto de `03-html-css` é independente: basta abrir o `index.html` no navegador.
Para servir localmente com recarregamento automático, use o [Live Server](https://marketplace.visualstudio.com/items?itemName=ritwickdey.LiveServer) do VS Code.

## Projetos em destaque

- **CineMatrix** — catálogo de filmes responsivo com CSS Grid, Flexbox e variáveis CSS.
- **TechHight** — loja fictícia com tabela de produtos, vídeo, áudio e formulário de cadastro.
- **Papelaria (POO)** — sistema de estoque em Java com cadastro, venda e reposição.
- **Modelo lógico de banco** — diagrama e script SQL do projeto DEVFLIX.

## O que foi organizado

- Arquivos separados por assunto em pastas numeradas.
- Código comentado em português, explicando a lógica de cada exercício.
- Remoção de pastas duplicadas (`DS_01/DS_01/DS_01/...`), do `node_modules` versionado e de um submódulo quebrado.
- Correção de bugs: laço infinito em `04-media-turma.js`, função que não era chamada em `03-inverte-lista.js`, cálculo de desconto em `Loja.java`, resumo executado antes do laço em `Pastelaria.java`, entre outros.
- Nomes de classes Java padronizados (`Trabalho01`, `Trabalho02`, ...), respeitando a regra de que o arquivo deve ter o mesmo nome da classe pública.
- CSS inline da loja extraído para `style.css`.
- Imagens externas que podiam quebrar foram baixadas para dentro do repositório.

## Tecnologias

![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black)
![Node.js](https://img.shields.io/badge/Node.js-339933?style=flat&logo=node.js&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=flat&logo=openjdk&logoColor=white)
![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white)

## Autor

**Vinicio Daileson** — [github.com/Viniciodaileson](https://github.com/Viniciodaileson)

Projeto de estudo. Sinta-se à vontade para usar como referência.
