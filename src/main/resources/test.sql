    
INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('CASA', 'categoria/iconos','casa.jpg');
INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('MASCOTAS', 'categoria/iconos','mascotas.jpg');
INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('EVENTOS', 'categoria/iconos','eventos.jpg');
INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('SALUD', 'categoria/iconos','salud.jpg');



INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'CASA'), 'LIMPIEZA');

INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'CASA'), 'PLOMERIA');

INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'CASA'), 'ELECTRICISTA');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'LIMPIEZA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'LAVANDERIA');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'LIMPIEZA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'ASEO DE HABITACIONES');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'LIMPIEZA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'ASEO DE BAÑOS');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'PLOMERIA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'REPARACION DE LAVADERO');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'PLOMERIA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'INSTALACION DE TUBERIAS');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'PLOMERIA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'REPARACION DE TUBERIAS');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ELECTRICISTA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'INSTALACION DE CABLEADO');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ELECTRICISTA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'INSTALACION DE INTERRUPTORES');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ELECTRICISTA' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'CASA')), 'REPARACION DE ARTEFACTOS');







INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS'), 'CUIDADO');

INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS'), 'ENTRETENIMIENTO');

INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS'), 'VETERINARIO');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'CUIDADO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'BAÑO CORPORAL');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'CUIDADO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'PEINADO Y ACCESORIOS');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ENTRETENIMIENTO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'PASEO INDIVIDUAL');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ENTRETENIMIENTO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'PASEO GRUPAL');


INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'VETERINARIO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'DESPARACITACION');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'VETERINARIO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'ESTERILIZACION');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'VETERINARIO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'CONSULTA MEDICA');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'VETERINARIO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'CIRUJIA');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'VETERINARIO' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'MASCOTAS')), 'ETOLOGIA');






INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS'), 'FIESTA INFANTIL');

INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS'), 'BODAS');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'FIESTA INFANTIL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS')), 'HORA LOCA INFANTIL');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'FIESTA INFANTIL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS')), 'SHOW PAYASO');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'FIESTA INFANTIL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS')), 'SHOW BAILARINAS');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'BODAS' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS')), 'GRABACION Y FOTOS');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'BODAS' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS')), 'PRESENTADOR');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'BODAS' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'EVENTOS')), 'HORA LOCA ADULTOS');



INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'SALUD'), 'CUIDADO PERSONAL');

INSERT INTO actividad(id_categoria, nombre) VALUES 
((SELECT id_categoria FROM categoria WHERE nombre = 'SALUD'), 'ENTRENADOR PERSONAL');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'CUIDADO PERSONAL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'SALUD')), 'TRATAMIENTO CAPILAR');

	INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'CUIDADO PERSONAL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'SALUD')), 'CIRUJIA');

	INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'CUIDADO PERSONAL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'SALUD')), 'CONSULTA MEDICA');



INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ENTRENADOR PERSONAL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'SALUD')), 'RUTINA EJERCICIOS');

INSERT INTO tarea(id_actividad, nombre) VALUES 
((SELECT id_actividad FROM actividad WHERE nombre = 'ENTRENADOR PERSONAL' and id_categoria =
	(SELECT id_categoria FROM categoria WHERE nombre = 'SALUD')), 'ALQUILER DE PESAS');








