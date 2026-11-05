# Instrucciones para agentes (DCP MVP)

Plantilla del curso **DCP** (Universidad Austral). Leé este archivo antes de editar el repo.

## Política obligatoria: `prompt-log/`

**Para CADA prompt** que hagas contra este repositorio con un LLM (Claude, opencode, GPT, Copilot, Cursor, etc.), **debés guardar el prompt de entrada Y la respuesta del modelo** en `prompt-log/`.

- Convención recomendada: un archivo markdown por interacción.
- Nombre: `prompt-log/YYYY-MM-DD-HHMM-tema-corto.md`
- Contenido mínimo:
  - herramienta y modelo usados
  - sección **Prompt** (el texto que enviaste)
  - sección **Respuesta** (la salida del LLM)
- Ver el formato detallado en [`prompt-log/README.md`](prompt-log/README.md).

No omitas interacciones “chicas”. Si usaste un LLM sobre este repo, va al log.

## Secretos

- Nunca commitees API keys, tokens ni credenciales.
- El log **no debe contener secretos**. Redactalos (`***`) si aparecen en un prompt o respuesta.

## Build

- JDK 21 + Gradle Wrapper 8.10 (`./gradlew` / `.\gradlew.bat`).
- No hace falta instalar Gradle globalmente.
- `./gradlew build` · `./gradlew test` · `./gradlew run`
