# Guía para Agentes de IA — Proyecto "Calculadora"

Resumen corto
- Proyecto Java mínimo (fase inicial). Código fuente actual en `src/main/java` sin paquetes (default package).

Qué hay ahora (hallazgos concretos)
- `src/main/java/Calculadora.java`: métodos estáticos discoverables: `sumar`, `restar`, `multiplicar`, `dividir`.
   - Nota: `dividir(double a, double b)` lanza `IllegalArgumentException` si `b == 0.0`.
- `src/main/java/Main.java`: menú por consola que usa `Scanner` y llama a `Calculadora`. Tiene validación de entrada (`readDouble`) y un caso adicional `5` que usa `Math.pow(a,b)`.
- No hay `pom.xml` ni `build.gradle` detectados; no hay pruebas (`src/test/java` vacío) ni paquetes definidos.

Puntos importantes para agentes
- Las clases están en el paquete por defecto. Si introduces un sistema de construcción (Maven/Gradle), añade una declaración de `package` y mueve los archivos a la ruta correspondiente (por ejemplo `com.example.calculadora`) o ajusta la configuración del build.
- Evita asumir dependencias externas: actualmente sólo se usa la JDK estándar (java.lang, java.util).

Comandos útiles (PowerShell, Windows)
- Compilar (coloca clases compiladas en `out`):

```powershell
javac -d .\out .\src\main\java\Calculadora.java .\src\main\java\Main.java
```

- Ejecutar:

```powershell
java -cp .\out Main
```

Notas sobre patrones de código locales
- Documentación: las clases actuales incluyen Javadoc; sigue ese patrón para nuevas APIs públicas.
- Manejo de errores: la división por cero se comunica mediante `IllegalArgumentException` — las llamadas a `dividir` se envuelven en try/catch en `Main`.
- Validación de entrada: `Main.readDouble(Scanner)` valida con `hasNextDouble()` antes de leer.

Sugerencias prácticas y límites encontrados (no aspiracionales)
- Añadir un sistema de construcción (Maven/Gradle) facilitará pruebas y empaquetado. Si agregas Maven, crea `pom.xml` y mapea `package` -> `src/main/java/<paquete>`.
- Si vas a añadir pruebas, usa JUnit 5 y crea tests para los métodos estáticos de `Calculadora` en `src/test/java`.

Si algo está incompleto o deseas que incorpore:
- Un `pom.xml` o `build.gradle` mínimo
- Conversión de las clases al paquete base (p. ej. `com.agcgonzalez.calculadora`)
- Ejemplos de tests unitarios (JUnit)

Pídeme qué quieres que haga a continuación y lo implemento (ej.: generar build files, tests o refactor a paquetes).