# backendGlobal

_Proyecto realizado en Spring Boot con maven, utiliando un ORM mediante Hibernate_

_Realizado en java 8_

# Compilacion

_Se puede compilar como proyecto maven desde Eclipse o Spring Tool Suite, _

_Instrucciones_

_1: Modificar archivo application.properties con los datos de conexion a base de datos y credenciales_

```
spring.datasource.url=jdbc:mysql://{IP}:3306/{DB_NAME}
spring.datasource.username={USERNAME}
spring.datasource.password={PASSWORD}
```

_2:se ejecuta la aplicacion RestFull, inicia en el puerto 8034_

# URL

_Urls de los servicios que se exponen_

_GET: localhost:8034/api/usuario -> Lista de usuarios_
_GET: localhost:8034/api/usuario/{id} -> Usuario por id_

_POST: localhost:8034/api/usuario -> Crear y actualizar_
_Recibe un json con los siguientes datos_

```
{
    "id": 50,
    "nombre": "Prueba3",
    "apellido": "Prueba Edi",
    "email": "pruebaa@gmail.com",
    "profesion": "Aspirante"
}
```
