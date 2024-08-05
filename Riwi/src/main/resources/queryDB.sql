CREATE DATABASE riwi;

USE riwi; 

CREATE TABLE empresa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    ubicacion VARCHAR(255) NOT NULL
);

CREATE TABLE coder (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellidos VARCHAR(255) NOT NULL,
    documento VARCHAR(20) UNIQUE NOT NULL,
    tecnologia VARCHAR(255),
    clan VARCHAR(255)
);

CREATE TABLE vacante (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descripcion TEXT,
    tecnologia VARCHAR(255),
    estado ENUM('ACTIVO', 'INACTIVO') NOT NULL DEFAULT 'ACTIVO',
    fk_empresa_id INT,
    FOREIGN KEY (fk_empresa_id) REFERENCES Empresa(id) ON DELETE CASCADE
);

CREATE TABLE contratacion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fecha_aplicacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    estado ENUM('PENDIENTE', 'ACTIVA', 'INACTIVA') NOT NULL DEFAULT 'PENDIENTE',
    fk_coder_id INT,
    fk_vacante_id INT,
    salario INT NOT NULL,
    FOREIGN KEY (fk_coder_id) REFERENCES Coder(id) ON DELETE CASCADE,
    FOREIGN KEY (fk_vacante_id) REFERENCES Vacante(id) ON DELETE CASCADE
);


SELECT * FROM empresa;
SELECT * FROM coder;
SELECT * FROM vacante;
SELECT * FROM contratacion;


