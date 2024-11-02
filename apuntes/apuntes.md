
# Spring Boot: Anotaciones y Arquitectura en Capas

## **@RestController**
Anotación que marca una clase como un controlador **REST** en **Spring Boot**.

- Combina las anotaciones **@Controller** y **@ResponseBody**.
- Maneja solicitudes HTTP y retorna datos en formato **JSON** o **XML**.
- Los métodos en la clase marcada con esta anotación se asignan automáticamente a una URL que responderá a las solicitudes HTTP basadas en las siguientes anotaciones:
  - **@GetMapping**: para solicitudes HTTP **GET**.
  - **@PostMapping**: para solicitudes HTTP **POST**.
  - **@PutMapping**: para solicitudes HTTP **PUT**.
  - **@DeleteMapping**: para solicitudes HTTP **DELETE**.

---

## **@GetMapping**
Anotación para mapear un método a un **endpoint** específico.

- Maneja las solicitudes **HTTP GET** en la **URL** especificada.
- Invoca el método correspondiente y devuelve el resultado, generalmente en formato **JSON** o **XML**.

---

## **@PathVariable**
Permite mapear partes de la URL a parámetros de un controlador en **Spring**.

- Útil para manejar valores dinámicos en la URL y extraerlos para su uso en el código.
- Convierte un parámetro de **Java** en un parámetro en la URL de un **endpoint**.

---

# Estructura de Paquetes en Spring Boot
En **Spring Boot**, las aplicaciones se pueden organizar de varias maneras. En este curso, usaremos **arquitectura por capas**.

### **Controladores**
- Gestionan las solicitudes **HTTP** desde el cliente.

---

# Arquitectura Basada en Capas
### ¿Qué es la Arquitectura Basada en Capas?
Es un enfoque común en el diseño de sistemas de software y se aplica también en el diseño y desarrollo de microservicios. La idea es **segmentar responsabilidades** en distintas capas para una mejor organización.

### Capas Básicas:
1. **Capa de Presentación**
2. **Capa de Lógica de Negocio**
3. **Capa de Acceso a Datos**

### Capas Opcionales:
- **Capa de Integración**
- **Capa de Seguridad**

#### **1. Capa de Presentación**
En un microservicio, generalmente no existe una interfaz de usuario. Sin embargo, podría tener una API para interactuar con otras partes del sistema o aplicaciones externas. Esta capa suele incluir los controladores que exponen la API.

#### **2. Capa de Lógica de Negocio**
Implementa la lógica del negocio y expone una interfaz para interactuar con ella. Incluye reglas de negocio, cálculos, validación de datos, y coordina operaciones necesarias según los requisitos del negocio.

#### **3. Capa de Acceso a Datos**
Gestiona la interacción con la base de datos u otros sistemas de almacenamiento. En microservicios, cada servicio podría tener su propia base de datos o compartir una según las necesidades de la arquitectura.

#### **4. Capa de Integración**
Se utiliza para integrar el microservicio con otros sistemas externos o microservicios dentro de la misma arquitectura. Puede incluir componentes como **clientes HTTP**, **servicios web**, **colas de mensajes**, etc.

#### **5. Capa de Seguridad**
Se encarga de la seguridad del sistema, como la autenticación y autorización. Puede incluir filtros de seguridad, tokens de acceso, entre otros.

---

# ¿Qué es una API? ¿Qué es una API REST? Diferencias

Una **API** (Interfaz de Programación de Aplicaciones) es un conjunto de definiciones y protocolos que facilita la **comunicación e integración** entre diferentes componentes de software.

### **Características de una API**:
- **Contrato** que define cómo se comunican las aplicaciones mediante **solicitudes** y **respuestas**.
- **Intermediario esencial** entre sistemas y aplicaciones.
- La **arquitectura de una API** define las reglas para compartir datos entre cliente y servidor.

### **Tipos de API**:
1. **SOAP**
2. **RPC**
3. **WebSocket**
4. **REST** (enfocado en este curso)

### **¿Qué es REST?**
**REST** (Representational State Transfer) es una arquitectura común para **APIs** debido a su **escalabilidad** y **facilidad de implementación**. A menudo, se le conoce como **API RESTful**.

#### **Principios de REST**:
- **Basada en estándares web**:
  - Utiliza **HTTP** para operaciones **CRUD**:
    - **GET** (leer), **POST** (crear), **PUT** (actualizar), **DELETE** (eliminar)
  - Identifica **recursos** mediante **URLs**.

- **Representación de Recursos**:
  - Los recursos pueden representarse en varios formatos: **JSON**, **XML**, **HTML**, entre otros.
  - La información se envía o recibe en cada solicitud.

#### **Restricciones de REST**:
1. **Separación Cliente-Servidor**:
  - Cambios en el cliente no afectan al servidor y viceversa.

2. **Interfaz Uniforme**:
  - Todas las solicitudes y respuestas tienen un formato uniforme y se transmiten a través de **HTTP**.

3. **Sin Estado**:
  - Cada solicitud es **independiente**; el servidor no almacena datos de solicitudes previas.

4. **Sistema de Capas**:
  - Las solicitudes y respuestas pueden pasar por varias capas intermedias sin que el cliente o servidor lo perciban.

5. **Almacenamiento en Caché**:
  - Reduce la carga en el servidor y el tiempo de respuesta para mejorar el rendimiento general.

---

**Referencia**: [Ver video en YouTube](https://www.youtube.com/watch?v=vDN0gThf_oQ&list=PLyvsggKtwbLVOPuOGn9J1Ie9RD7r7LcWD&index=8)
