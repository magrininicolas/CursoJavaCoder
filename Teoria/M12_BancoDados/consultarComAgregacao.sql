-- Consultando com agregação

SELECT regiao Região, sum(populacao) Total
FROM estados
GROUP BY regiao
ORDER BY Total DESC;
