-- ==========================================================================
-- Modelo lógico do banco de dados — DEVFLIX
-- Sistema simples de filmes/streaming.
--
-- Diagrama: docs/modelo-logico.png
-- Banco de exemplo: MySQL / MariaDB (adapte os tipos para outro SGBD).
-- ==========================================================================

-- Tabela de usuários do sistema.
CREATE TABLE usuario (
    id_usuario     INT          NOT NULL AUTO_INCREMENT,
    nome           VARCHAR(100) NOT NULL,
    plano_contrato INT          NOT NULL,
    PRIMARY KEY (id_usuario)
);

-- Tabela de filmes disponíveis.
CREATE TABLE filme (
    id_filme        INT          NOT NULL AUTO_INCREMENT,
    titulo          VARCHAR(150) NOT NULL,
    genero          VARCHAR(50)  NOT NULL,
    ano_lancamento  DATE         NOT NULL,
    PRIMARY KEY (id_filme)
);

-- Tabela associativa: registra que um usuário assistiu a um filme.
-- A chave primária é composta para impedir registros duplicados.
CREATE TABLE assistiu (
    id_usuario INT  NOT NULL,
    id_filme   INT  NOT NULL,
    data       DATE NOT NULL,
    PRIMARY KEY (id_usuario, id_filme),
    CONSTRAINT fk_assistiu_usuario
        FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario),
    CONSTRAINT fk_assistiu_filme
        FOREIGN KEY (id_filme) REFERENCES filme (id_filme)
);

-- --------------------------------------------------------------------------
-- Exemplos de consulta
-- --------------------------------------------------------------------------

-- Filmes assistidos por um usuário específico.
-- SELECT f.titulo, a.data
-- FROM assistiu a
-- JOIN filme f ON f.id_filme = a.id_filme
-- WHERE a.id_usuario = 1
-- ORDER BY a.data DESC;

-- Quantidade de vezes que cada filme foi assistido.
-- SELECT f.titulo, COUNT(*) AS vezes_assistido
-- FROM assistiu a
-- JOIN filme f ON f.id_filme = a.id_filme
-- GROUP BY f.id_filme, f.titulo
-- ORDER BY vezes_assistido DESC;
