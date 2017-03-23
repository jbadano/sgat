
**SGAT IMPORTANTE:**

**Ahora en jpaPropertyMap del applicationContext se modifica para que genere la base de datos de forma automática.**

>Para probar en STS:

-Botón derecho sobre el proyecto.  
-Run As --> Maven clean.  
-Run As --> Maven install.  

-Botón derecho sobre tomcat server en sección servers.  
-Publish.  
-Start.  


**DATA INICIAL A UTILIZAR - SCRIPT CARGA AGREGADO**

-INSERT INTO PROCESO (ID,NOMBREPROCESO,DESCRIPCION) VALUES (1,'Ciclo QA','Flujo para el proceso de certificación QA');

-INSERT INTO ESTADOTIPO (ID, NOMBRE) VALUES (1,'Inicio');
-INSERT INTO ESTADOTIPO (ID, NOMBRE) VALUES (2,'En Progreso');
-INSERT INTO ESTADOTIPO (ID, NOMBRE) VALUES (3,'Completado');
-INSERT INTO ESTADOTIPO (ID, NOMBRE) VALUES (4,'Cancelado');

-INSERT INTO ESTADO (ID, NOMBRE, DESCRIPCION, ESTADOTIPO, PROCESO) VALUES (1,'InicioQA','Requerimiento Ingresa a ciclo QA',1,1);
-INSERT INTO ESTADO (ID, NOMBRE, DESCRIPCION, ESTADOTIPO, PROCESO) VALUES (2,'AsigResponsable','Pendiente de Asignación responsable',2,1);
-INSERT INTO ESTADO (ID, NOMBRE, DESCRIPCION, ESTADOTIPO, PROCESO) VALUES (3,'IniCertificación','Inicio de proceso de certificación',2,1);
-INSERT INTO ESTADO (ID, NOMBRE, DESCRIPCION, ESTADOTIPO, PROCESO) VALUES (4,'EjecPruebas','Ejecución Pruebas Certificación',2,1);
-INSERT INTO ESTADO (ID, NOMBRE, DESCRIPCION, ESTADOTIPO, PROCESO) VALUES (5,'FinCertificacion','Término de certificación Requerimiento',3,1);
-INSERT INTO ESTADO (ID, NOMBRE, DESCRIPCION, ESTADOTIPO, PROCESO) VALUES (6,'CertCancelada','Certificación Cancelada',4,1);

-INSERT INTO ACCIONTIPO (ID, NOMBRE) VALUES (1,'Aprobado');
-INSERT INTO ACCIONTIPO (ID, NOMBRE) VALUES (2,'Realizado');
-INSERT INTO ACCIONTIPO (ID, NOMBRE) VALUES (3,'Rechazado');
-INSERT INTO ACCIONTIPO (ID, NOMBRE) VALUES (4,'Cancelado');

-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (1,'AprInicioQA','Aprueba inicio ciclo QA',1,1);
-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (2,'AprCertificación','Aprueba certificación',1,1);
-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (3,'AsigResponsable','Asignación responsable realizado',2,1);
-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (4,'IniCetificación','Inicio certificación realizado',2,1);
-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (5,'EjecPruebas','Ejecución de pruebas realizado',2,1);
-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (6,'RecCertificación','Certificación Rechazada',3,1);
-INSERT INTO ACCION (ID, NOMBRE, DESCRIPCION, ACCIONTIPO, PROCESO) VALUES (7,'CancCertificación','Certificación Cancelada',4,1);

-INSERT INTO ACTIVIDADTIPO (ID, NOMBRE) VALUES (1, 'EnvioEmail');
-INSERT INTO ACTIVIDADTIPO (ID, NOMBRE) VALUES (2, 'MsgUsuario');

-INSERT INTO ACTIVIDAD (ID, NOMBRE, DESCRIPCION, ACTIVIDADTIPO, PROCESO) VALUES (1,'NotifGrupoMan','Notifica Grupo Jefatura',1,1);
-INSERT INTO ACTIVIDAD (ID, NOMBRE, DESCRIPCION, ACTIVIDADTIPO, PROCESO) VALUES (2,'NotifGrupoObser','Notifica grupo Observadores',1,1);
-INSERT INTO ACTIVIDAD (ID, NOMBRE, DESCRIPCION, ACTIVIDADTIPO, PROCESO) VALUES (3,'NotifUsuarioAsigMail','Notifica Usuario Asignado',1,1);
-INSERT INTO ACTIVIDAD (ID, NOMBRE, DESCRIPCION, ACTIVIDADTIPO, PROCESO) VALUES (4,'NotifUsuarioAsigMsg','Notifica Usuario Asignado',2,1);




