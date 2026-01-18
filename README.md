# Tarea 2 - Investigación: Hileras de Caracteres
### Universidad de Costa Rica - Sede de Occidente: Recinto de Grecia
### Desarrollo de Software II
### Docente: Angélica Ulate Céspedes
### Estudiante: Evelyn Martinez Hernandez - C34617


#### ¿Qué es una hilera de caracteres?
Una hilera de caracteres es un tipo de datos que representa una secuencia de caracteres que puede consistir de letras, números, símbolos, palabras o frases. Las cadenas de caracteres se utilizan para representar datos de texto.

**Ejemplos de hileras de caracteres**
- `"example@hotmail.com"`
- `"Hello World"`
- `"Juan Pérez"`
- `"ABC123"`
- `"Don’t just dream, do"`

#### Carácter vs Hilera de Caracteres


| Concepto | Descripción | Ejemplo |
|--------|------------|--------|
| **Carácter** |  Es la unidad más pequeña de texto, representando una letra, número, símbolo | `'A'`, `'9'`, `'#'` |
| **Hilera de caracteres** | Colección ordenada de caracteres tratada como una unidad para representar texto | `"Hola"`, `"2024"` `"It is our choices, Harry"` |

#### Operaciones que se pueden realizar con hileras de caracteres
En la siguiente tabla de detallan algunas operaciones que se pueden realizar con hileras de caracteres (se usara Java como referencia):

## Operaciones con Hileras de Caracteres 

### Tabla de Referencia Rápida

| Categoría | Métodos | Ejemplo | Resultado |
|-----------|---------|---------|-----------|
| **Información** | `length()` | `"Hola".length()` | `4` |
| | `isEmpty()` | `"".isEmpty()` | `true` |
| | `isBlank()` | `"   ".isBlank()` | `true`  |
| | `charAt(i)` | `"Hola".charAt(0)` | `'H'` |
|                                                        |
| **Comparación** | `equals()` | `"a".equals("a")` | `true` |
| | `equalsIgnoreCase()` | `"Hola".equalsIgnoreCase("HOLA")` | `true` |
| | `compareTo()` | `"a".compareTo("b")` | `< 0` |
|                                                                     |
| **Búsqueda** | `contains()` | `"Java".contains("av")` | `true` |
| | `indexOf()` | `"Hola".indexOf("la")` | `2` |
| | `lastIndexOf()` | `"Java".lastIndexOf("a")` | `3` |
| | `startsWith()` | `"Java".startsWith("Ja")` | `true` |
| | `endsWith()` | `"Java".endsWith("va")` | `true` |
|                                                                      |
| **Extracción** | `substring(start)` | `"Hola".substring(2)` | `"la"` |
| | `substring(start, end)` | `"Hola".substring(0, 2)` | `"Ho"` |
| | `split(delimiter)` | `"a,b,c".split(",")` | `["a", "b", "c"]` |
|                                                                 |
| **Transformación** | `toUpperCase()` | `"hola".toUpperCase()` | `"HOLA"` |
| | `toLowerCase()` | `"HOLA".toLowerCase()` | `"hola"` |
| | `replace(old, new)` | `"Hola".replace("o", "0")` | `"H0la"` |
| | `replaceFirst(old, new)` | `"aaa".replaceFirst("a", "b")` | `"baa"` |
| | `replaceAll(regex, new)` | `"a1b2".replaceAll("\\d", "")` | `"ab"` |
| | `trim()` | `"  Hola  ".trim()` | `"Hola"` |
| | `strip()` | `"  Hola  ".strip()` | `"Hola"`  |
| | `repeat(n)` | `"*".repeat(3)` | `"***"`  |
|                                                                           |
| **Concatenación** | `+` | `"Ho" + "la"` | `"Hola"` |
| | `concat()` | `"Ho".concat("la")` | `"Hola"` |
| | `join(delimiter, elements)` | `String.join("-", "a", "b")` | `"a-b"` |
| | `format(format, args)` | `String.format("Hola %s", "Juan")` | `"Hola Juan"` |
|                                                                               |
| **Conversión** | `valueOf()` | `String.valueOf(123)` | `"123"` |
| | `Integer.parseInt()` | `Integer.parseInt("123")` | `123` |
| | `toCharArray()` | `"Hola".toCharArray()` | `['H', 'o', 'l', 'a']` |
|                                                                     |
| **Validación** | `matches(regex)` | `"123".matches("\\d+")` | `true` |
|                                                                      |

### Puntos Importantes de Funcionamiento

- **Los Strings son inmutables**: Cada operación crea un nuevo String
- **Comparación de contenido**: Usar `equals()`, NO `==` (error común)
- **StringBuilder**: Para muchas concatenaciones (más eficiente)

### Ejemplo de Uso
```java
String text = "Hello World";

// Información
int textLength = text.length();              // 11
char firstCharacter = text.charAt(0);      // 'H'

// Búsqueda
boolean isIn = text.contains("World"); // true
int position = text.indexOf("World");      // 5

// Transformación
String textUpper = text.toUpperCase();    // "HELLO WORLD"
String replaceText = text.replace("World", "There"); // "Hello There"

// Extracción
String sub = text.substring(0, 5);         // "Hello"
String[] parts = text.split(" ");         // ["Hello", "World"] - returns an Array
```
