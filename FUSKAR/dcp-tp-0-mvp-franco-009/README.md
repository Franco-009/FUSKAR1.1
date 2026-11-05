# DCP MVP Template

Plantilla del curso **DCP** (Universidad Austral) para el trabajo de MVP.

El proyecto es Kotlin/JVM 21 y se construye con el **Gradle Wrapper**. No hace falta instalar Gradle de forma global: usá `./gradlew` (macOS/Linux) o `.\gradlew.bat` (Windows).

Requisitos: **JDK 21**.

## Cómo construir y ejecutar

Compilar (incluye tests):

```bash
./gradlew build          # macOS / Linux
.\gradlew.bat build      # Windows
```

Correr solo los tests:

```bash
./gradlew test           # macOS / Linux
.\gradlew.bat test       # Windows
```

Ejecutar la aplicación:

```bash
./gradlew run            # macOS / Linux
.\gradlew.bat run        # Windows
```

Si todo está bien, `run` imprime `Hello, World!` y los tests pasan.

## Registro de prompts (`prompt-log/`)

Cada interacción con un LLM sobre este repositorio debe guardarse en `prompt-log/`. La política completa está en [`AGENTS.md`](AGENTS.md); el formato de cada entrada está en [`prompt-log/README.md`](prompt-log/README.md).

---

## Secciones a completar por el alumno

Completá las tres secciones de abajo. Dejalas en este README: son parte de la entrega.

### 1. Nombre del MVP

> _FUSKAR_

### 2. Problema, usuario y valor

> _El problema es sobre la administracion de obras, el usuario son las personas que buscan facilidad y tambien en no perder mucho tiempo tomando nota en cada obra o registrando cada avance. Estos pequeños detalles hoy en dia son muy valiosos por que te ayudan a llevar la obra al dia y para una persona qiue maneja 5 obras le viene bien_

### 3. Scope

**In scope**

> 
_Registrar y administrar múltiples obras._
_Crear, modificar, consultar y eliminar obras._
_Registrar el avance de una obra._
_Registrar la fecha del avance._
_Registrar qué trabajos se realizaron._
_Registrar los trabajadores/personas involucradas en cada avance._
_Registrar problemas o inconvenientes de la obra._
_Registrar materiales pendientes o faltantes._
_Registrar la próxima tarea a realizar._
_Consultar el historial de avances de cada obra._
_Visualizar un resumen del estado de todas las obras._
_Buscar y filtrar obras por diferentes criterios._
_Marcar una obra como activa, pausada o finalizada._
_Validar los datos ingresados._
_Contar con una interfaz gráfica._
_Tests unitarios con más del 80% de cobertura._
_Tests E2E de los flujos principales._


**Out of scope**

> 
_Integración con WhatsApp._
_Envío automático de mensajes a trabajadores o clientes._
_Reconocimiento de audios mediante IA._
_IA que interprete automáticamente los avances._
_Análisis automático de fotografías de la obra._
_Gestión completa de costos y presupuestos._
_Facturación._
_Gestión de proveedores._
_Gestión de compras._
_Control de stock de materiales._
_Gestión de sueldos._
_Sistema de pagos._
_GPS o seguimiento de trabajadores en tiempo real._
_Aplicación móvil._
_Integración con Google Calendar._
_Sistema de usuarios y permisos avanzados._
_Notificaciones automáticas._
_Predicción de retrasos mediante IA._
_Integración con otros sistemas externos._

