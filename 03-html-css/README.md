# 03 — Projetos de HTML e CSS

Cada pasta é um projeto independente. Basta abrir o `index.html` no navegador (ou usar o Live Server do VS Code).

## Projetos

| Pasta | Projeto | O que pratica |
| --- | --- | --- |
| [`01-aula-css`](01-aula-css) | Meta Escola — cadastro de alunos | formulário, `label`, `select`, CSS externo |
| [`02-noticia`](02-noticia) | Portal Notícias — notícia esportiva | estrutura semântica, listas, destaque |
| [`03-cine-matrix`](03-cine-matrix) | CineMatrix — catálogo de filmes | CSS Grid, Flexbox, variáveis CSS, responsividade |
| [`04-site-tech`](04-site-tech) | TechHight — loja de informática | tabelas, vídeo, áudio, formulário |

## Destaques técnicos

- **CineMatrix**: layout responsivo com três breakpoints (480px, 768px e 1040px), menu fixo com `position: fixed`, variáveis CSS para a paleta de cores e imagens de reserva (`sem-foto.svg`) quando não há foto.
- **TechHight**: o CSS que estava dentro de `<style>` foi movido para `style.css`, as imagens externas foram baixadas para `Img/` e os `label`s dos campos foram corrigidos.

## Estrutura de arquivos

```text
03-html-css/
├── 01-aula-css/
│   ├── index.html
│   └── style.css
├── 02-noticia/
│   ├── index.html
│   ├── style.css
│   └── foto.jpg
├── 03-cine-matrix/
│   ├── index.html
│   ├── style.css
│   ├── poster.jpg
│   ├── posterduna.jpg
│   ├── elenco1.jpg ... elenco4.jpg
│   └── sem-foto.svg
└── 04-site-tech/
    ├── index.html
    ├── style.css
    ├── testedesom.mp3
    ├── Img/
    └── video/
```
