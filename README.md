# ejercicio-ss

Inventarios de IPhones

Un IPhone tendrá un modelo, un color y una cantidad de almacenamiento.
El WS permite agregar IPhones al inventario, eliminarlos según el ID que les fue asignado al agrearlos, u obtener la cantidad de iphones en el inventario según su modelo.


Para usarlo solo se debe correr el comando docker-compose up

También puede ser usado corriendo un contenedor mediante la imagen alethetwin/ejercicio-ss, para esto se requiere exponer el puerto 8080 local del contenedor, con un comando como el siguiente:

```docker run -it -p <Puerto local a exponer>:8080 alethetwin/ejercicio-ss```