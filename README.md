# Conversor de Monedas 🌍💱

![CONVERSOS DE MONEDAS](https://github.com/user-attachments/assets/88ef08b4-e691-426a-a505-236993342962)

## Descripción

Bienvenido al Conversor de Monedas. Este programa permite convertir cantidades entre diferentes monedas usando datos actualizados de una API de tasas de cambio. Es una herramienta práctica para quienes necesitan hacer conversiones rápidas y precisas.

## ¿Cómo usarlo? 🚀

### Descarga y abre el proyecto:
- Clona este repositorio en tu máquina local.
- Abre el proyecto en tu IDE preferido (recomendamos IntelliJ IDEA).

### Configuración:
- Asegúrate de tener instalada la biblioteca Gson 2.10.1 o superior.
- Obtén una clave de API de [ExchangeRate-API](https://www.exchangerate-api.com/) y guárdala en el archivo de configuración del proyecto.

### Ejecutar el programa:
- Corre el programa desde tu IDE.
- Seleccione la moneda base.
  
  ![CONVERSOR 1](https://github.com/user-attachments/assets/deb35387-6549-4341-8785-496722e505db)

- Selecciona la moneda a la que deseas convertir de una lista de opciones.
  
  ![CONVERSOR 2](https://github.com/user-attachments/assets/ccc32fb0-9297-4b70-ab1a-cec13e22d2ee)

- Introduce la cantidad de dinero en dólares que deseas convertir.
  
![CONVERSOR 3](https://github.com/user-attachments/assets/e0734692-3f5f-4bec-9789-bbcb4ed83d70)


### Resultados:
- El programa mostrará el monto convertido basado en la tasa de cambio actual.

## Tecnologías Utilizadas 🛠️

- **Java 17:** La versión utilizada para el desarrollo del proyecto.
- **Gson 2.10.1:** Biblioteca para manipulación y mapeo de JSON.
- **HttpClient:** Para realizar solicitudes HTTP a la API de tasas de cambio.
- **HttpRequest:** Para configurar y personalizar las solicitudes HTTP.
- **API REST:** Para obtener las tasas de cambio de moneda actualizadas.
- **IntelliJ IDEA:** IDE utilizado para el desarrollo del proyecto.
- **Manejo de Excepciones:** Para garantizar la robustez y manejar posibles errores.
- **Programación Orientada a Objetos (POO):** Para una estructura de código clara y modular.

## Configuración del Entorno

### IntelliJ IDEA:
Descarga e instala IntelliJ IDEA desde [aquí](https://www.jetbrains.com/idea/download/).

### Biblioteca Gson:
1. Abre tu proyecto en IntelliJ.
2. Ve a `File > Project Structure > Libraries`.
3. Añade la dependencia de Gson desde Maven: `com.google.code.gson:gson:2.10.1`.

## Consumo de la API

- Utiliza `HttpClient` para realizar solicitudes a la API.
- Configura las solicitudes usando `HttpRequest` para obtener las tasas de cambio.
- Analiza y mapea la respuesta JSON utilizando `JsonParser` y `JsonObject` de Gson.

## Desarrollado por 
Edmi Perez
