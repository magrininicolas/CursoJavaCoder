SELECT e.nome Empresa, c.nome Cidade
FROM empresas e
INNER JOIN empresas_unidades eu
INNER JOIN cidades c
ON e.id = eu.empresa_id AND c.id = eu.cidade_id AND sede;
