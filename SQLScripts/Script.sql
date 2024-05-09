CREATE DATABASE OdontoAppDB

CREATE TABLE tAgenda (
	ID INT IDENTITY(1,1) NOT NULL,
	ProfissionalID INT NOT NULL,
	Data DATE NOT NULL,
	Agenda VARCHAR(MAX) NOT NULL,
	PRIMARY KEY (ID),
	FOREIGN KEY (ProfissionalID) REFERENCES tProfissional(ProfissionalID)
)

CREATE TABLE tProfissional (
	ProfissionalID INT IDENTITY(1,1) NOT NULL,
	Profissional VARCHAR(255) NOT NULL,
	Especialidade VARCHAR(255) NOT NULL,
	PRIMARY KEY (ProfissionalID)
)