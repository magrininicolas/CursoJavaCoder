INSERT INTO empresas
  (nome, cnpj)
VALUES
  ('Bradesco', 31041478000193),
  ('Vale', 31289987000130),
  ('Cielo', 74849604000143);

ALTER TABLE empresas MODIFY cnpj VARCHAR(15);

INSERT INTO empresas_unidades
  (empresa_id, cidade_id, sede)
VALUES
  (1, 1, 1),
  (1, 2, 0),
  (2, 1, 0),
  (2, 2, 1);
