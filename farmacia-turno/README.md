# Prueba Técnica Consorcio

Spring Boot Server 

Swagger


## Detalle de instalación y compilación

Esta aplicación fue desarrollada para la Prueba Técnica de Consorcio 

Pasos para instalación y compilación


**Levantar servicio Local API REST Prueba Técnica farmacia-turno **

1. Para compilar el nuevo servicio desarrollado para esta Prueba se deberá ingresar a la carpeta "farmacia-turno" y 
ejecutar el siguiente comando

    `mvn package`

2. Luego ingresar a la carpeta "target" y ejecutar el comando:

    `java -jar .\farmacia-turno-1.0.0.jar`
    
    Nota: La API está configurada para el puerto 8080 (si desea cambiar el puerto ir a src/main/resources y en el 
     archivo application.properties cambiar valor del puerto desde el parámetro "server.port")

3. Ejecutar API desde Postman u otra aplicación similar agregando los siguiente parámetros:

    Headers: 'Accept: application/json'
    Method: 'GET'
    URL: http://localhost:8080/farmacia-turno/farmacias?comunaId=<id de la comuna>&nombreLocal=<nombre de la comuna>
    
    o desde `curl -X GET --header 'Accept: application/json' 'http://localhost:8080/farmacia-turno/farmacias?comunaId=<id de la comuna>&nombreLocal=<nombre de la comuna>'`
    
##Visualizar Documentación con Swagger

Ingresar a la siguiente url: http://localhost:8080/farmacia-turno/swagger-ui.html#/