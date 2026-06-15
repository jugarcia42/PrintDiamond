# Print Diamond (Dots Version)

## Descripción

Print Diamond es un kata de programación cuyo objetivo es generar un patrón en forma de diamante utilizando letras del alfabeto.

En esta versión, el patrón no se construye con espacios, sino con puntos (`.`), tanto en el interior como en el exterior del diamante. Esto refuerza el trabajo con posiciones relativas y simetría sin depender del “vacío” visual tradicional.

## Reglas

- La entrada es una única letra (de `A` a `Z`).
- El diamante comienza en `A`.
- El patrón es simétrico verticalmente.
- Todo el relleno se hace con `.` (puntos).
- Cada línea tiene la misma longitud total.

## Ejemplo

### Entrada

```text
C
```

### Salida

```text
..A..
.B.B.
C...C
.B.B.
..A..
```

## Construcción del patrón

Para una letra objetivo `N`:

### 1. Tamaño del diamante
El ancho total de cada línea es:

```
2 * (posición de N) - 1
```

Por ejemplo:
- A → 1
- B → 3
- C → 5
- D → 7

## 2. Reglas de cada línea

Para cada letra `L`:

- La posición determina cuántos puntos hay a izquierda y derecha.
- Entre letras se colocan puntos también.

### Casos:

#### Letra A
Solo una letra centrada:

```text
..A..
```

#### Letras intermedias (B, C, ...)

```text
.L...L.
```

- Los puntos exteriores centran la letra.
- Los puntos interiores crecen conforme aumenta la distancia desde A.

## 3. Simetría

El diamante se construye:

1. De `A` hasta la letra objetivo.
2. Luego en orden inverso (sin repetir la línea central).

## Conceptos trabajados

- Programación en Java
- Manipulación de strings
- Cálculo de posiciones
- Simetría algorítmica
- Generación de patrones
- Representación visual en texto
- Control preciso de índices

## Estrategia de solución

Un enfoque típico incluye:

1. Calcular el tamaño total del diamante.
2. Para cada letra:
   - Calcular posición relativa.
   - Construir línea con puntos (`.`) en lugar de espacios.
3. Concatenar mitad superior e inferior.

## Objetivo

El objetivo del kata es practicar:

- Construcción de patrones simétricos
- Manejo preciso de índices
- Representación visual sin espacios “neutros”
- Pensamiento estructurado en matrices 1D

## Autor

Ejercicio realizado como parte de las prácticas de Cyber Dojo utilizando Java.
