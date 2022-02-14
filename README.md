# Rabbitmq-mensajes-para-lectura-de-archivos-en-java

Pasos necesarios para instalacion
1. Instalacion de docker
2. Ejecucion de instalacion de imagen de docker
Ejecute el siguiente comando   docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.8-management
4. Ir a la direccion por defecto de la instalacion   http://localhost:15672/#/queues
5. descargar los archivos .zip
6. extraerlos en una carpeta a su eleccion
7. ejecutar primero el archivo trabajador.java que es el q va actuar de receptor
8. ejecutar el archivo nuevatarea.java (Nota:  este puede ejecutarse varias veces) actua como productor de mensajes

Compilacion
1. Tener el entorno de ejecucion java 15.0
2. El programa se realizo en netbeans (opcional)
3. Tener corriendo la imagend e docker donde esta almacenado rabbit
4. Para ingresar a la plataforma rabbit se tiene el usuario y contraseña como: guest
5. Cambie la ruta donde se encontrara los archivos txt
6. Añada los jars que contiene en el .zip

¿Qué es RabbitMQ?
RabbitMQ es un software de encolado de mensajes llamado bróker de mensajería o gestor de colas. Dicho de forma simple, es un software donde se pueden definir colas, las aplicaciones se pueden conectar a dichas colas y transferir/leer mensajes en ellas.

¿Cómo funciona?
La arquitectura básica de una cola de mensajes es simple. Hay aplicaciones clientes, llamadas productores, que crean mensajes y los entregan al intermediario (la cola de mensajes). Otras aplicaciones, llamadas consumidores, se conectan a la cola y se suscriben a los mensajes que se procesarán. Un mensaje puede incluir cualquier tipo de información.

Flujo de mensajes estándar de RabbitMQ

El productor publica un mensaje al exchange
El exchange recibe el mensaje y pasa a ser el responsable del enrutamiento del mensaje
Se debe establecer un binding entre la cola y el exchange. En el ejemplo, tenemos enlaces a dos colas diferentes desde el exchange. El exchange enruta el mensaje a las colas
Los mensajes permanecen en la cola hasta que sean manejados por un consumidor
El consumidor procesa el mensaje
 

Exchanges Bindings Routing Keys
![image](https://user-images.githubusercontent.com/63478476/153789193-3413f0c6-fc1f-4db0-b8d7-cf0e1849ac8a.png)

En este contexto se uso uno o varios clase productores para el envio de parametros hacia el consumidor para q este procese una funcionalidad de lectura de varios archivos en una carpeta especifica y que cuenta en el contenido de estos archivos las palabras que mas se repiten.
Esto se realizo con un flujo de datos consecuentes en donde se hace por lado del consumidor esta funcionalidad.
