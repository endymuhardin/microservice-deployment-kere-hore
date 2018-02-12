create table konfigurasi (
  id VARCHAR (36),
  nama VARCHAR (255) NOT NULL,
  nilai VARCHAR (255) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE (nama)
);