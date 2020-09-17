    
   		INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('CASA', 'categoria/iconos','casa.jpg');
		INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('MASCOTAS', 'categoria/iconos','mascotas.jpg');
		INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('EVENTOS', 'categoria/iconos','eventos.jpg');
		INSERT INTO categoria (nombre, ruta_icono, nombre_icono) VALUES ('SALUD', 'categoria/iconos','salud.jpg');

		INSERT INTO actividad(id_categoria, nombre) VALUES 
		((SELECT id_categoria FROM categoria WHERE nombre = 'CASA'), 'ACTIVIDAD 1 CATEGORIA CASA');
		INSERT INTO actividad(id_categoria, nombre) VALUES 
		((SELECT id_categoria FROM categoria WHERE nombre = 'CASA'), 'ACTIVIDAD 2 CATEGORIA CASA');






