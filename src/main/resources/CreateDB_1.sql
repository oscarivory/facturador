
CREATE TABLE USERS (
    id integer not null primary key,
    name varchar(80) not null
);

DELETE FROM users;
insert into users (id, name) values(1, 'Test User1');
insert into users (id, name) values(2, 'Test User2');
insert into users (id, name) values(3, 'Test User3');



use catalogo_cursos;


DROP PROCEDURE IF EXISTS desactiva_curso 

--

CREATE PROCEDURE desactiva_curso (IN cur_id INT)
BEGIN
UPDATE curso SET activo=false WHERE ID = cur_id;
SELECT c.id,c.titulo,c.nivel,c.horas,p.nombre FROM curso c,profesor p 
WHERE activo=false and c.idProfesor=p.id;
END;


--call desactiva_curso(30);
