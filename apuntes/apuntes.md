### @RestController:
Anotación que marca la clase como un controlador REST en **Spring Boot**.

- Combina las anotaciones **@Controller** y **@ResponseBody**.
- Maneja solicitudes HTTP y retorna datos en formato **JSON** o **XML**.
- Los métodos dentro de la clase marcada con esta anotación se mapearán automáticamente a una
  URL que responderá a las solicitudes HTTP entrantes basadas en las siguientes anotaciones:
    - **@GetMapping**: para solicitudes HTTP GET.
    - **@PostMapping**: para solicitudes HTTP POST.
    - **@PutMapping**: para solicitudes HTTP PUT.
    - **@DeleteMapping**: para solicitudes HTTP DELETE.

---

### @GetMapping:
Anotación que se utiliza para mapear un método a un **endpoint** específico.

- Maneja las solicitudes HTTP GET a la **URL** especificada.
- Invoca el método correspondiente y devuelve el resultado como respuesta, generalmente en formato **JSON** o **XML**.

### @PathVariable
Se utiliza para mapear partes de la URL de una solicitud web a parametros de un controlador de Spring
Util para manejar valores dinamicos en lar URL que deseas extraer y utilizar
Convierte un parametro java para transfromarlo en un parametro web en la url de un endpoint
---

# Packages
En spring boot se pueden diseñar de varias formas la app, en este curso, usaremos arquitectura por capas
### Controllers
- Gestionan las solicitudes http del lado del cliente