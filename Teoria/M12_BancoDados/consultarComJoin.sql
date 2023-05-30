SELECT est.nome Estado, cid.nome as Cidade, regiao as Região FROM 
estados est
INNER JOIN cidades cid 
ON est.id = cid.estado_id;
