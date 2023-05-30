-- Consultando a tabela estados
SELECT nome nome_estado, sigla sigla_estado FROM estados
WHERE regiao = 'Sudeste';

SELECT nome nome_estado, sigla sigla_estado, populacao populacao_estado FROM estados
WHERE populacao >= 10
ORDER BY populacao DESC;

