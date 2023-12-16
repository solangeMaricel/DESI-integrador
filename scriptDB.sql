use pasajes;

-- Paises --
INSERT INTO paises (id_pais, nombre) VALUES
(1, 'Argentina'),
(2, 'Brasil'),
(3, 'México'),
(4, 'Colombia'),
(5, 'Chile');

-- Ciudades --
INSERT INTO ciudades (id_ciudad, nombre, id_pais) VALUES
(1, 'Buenos Aires', 1),
(2, 'Río de Janeiro', 2),
(3, 'Ciudad de México', 3),
(4, 'Bogotá', 4),
(5, 'Santiago', 5),
(6, 'Córdoba', 1),
(7, 'Sao Paulo', 2),
(8, 'Guadalajara', 3),
(9, 'Medellín', 4),
(10, 'Valparaíso', 5);

-- Asientos --
INSERT INTO asientos (numero_asiento, disponible) VALUES
(1, True),
(2, True),
(3, True),
(4, True),
(5, True),
(6, True),
(7, True),
(8, True),
(9, True),
(10, True),
(11, True),
(12, True),
(13, True),
(14, True),
(15, True),
(16, True),
(17, True),
(18, True),
(19, True),
(20, True);

-- aviones --
INSERT INTO aviones (id_Avion, cantidad_filas, asiento_por_filas)
VALUES (1, 2, 10), (2, 4, 5), (3, 1, 10);

-- clientes --
INSERT INTO cliente (dni, nombre, apellido, domicilio, email, fecha_nacimiento, numero_pasaporte, vencimiento_pasaporte)
VALUES (12345678, 'Ada', 'Lovelace', 'Dirección Ada', 'ada@email.com', '1815-12-10', 1234, '2024-12-10');

INSERT INTO cliente (dni, nombre, apellido, domicilio, email, fecha_nacimiento, numero_pasaporte, vencimiento_pasaporte)
VALUES (23456789, 'Grace', 'Hopper', 'Dirección Grace', 'grace@email.com', '1906-12-09', NULL, NULL);

INSERT INTO cliente (dni, nombre, apellido, domicilio, email, fecha_nacimiento, numero_pasaporte, vencimiento_pasaporte)
VALUES (34567890, 'Margaret', 'Hamilton', 'Dirección Margaret', 'margaret@email.com', '1936-08-17', 5678, '2024-12-10');

INSERT INTO cliente (dni, nombre, apellido, domicilio, email, fecha_nacimiento, numero_pasaporte, vencimiento_pasaporte)
VALUES (45678901, 'Carol', 'Shaw', 'Dirección Carol', 'carol@email.com', '1955-07-26', NULL, NULL);

INSERT INTO cliente (dni, nombre, apellido, domicilio, email, fecha_nacimiento, numero_pasaporte, vencimiento_pasaporte)
VALUES (56789012, 'Shafi', 'Goldwasser', 'Dirección Shafi', 'shafi@email.com', '1958-05-26', NULL, NULL);