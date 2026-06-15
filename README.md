# Print Diamond (Dots Version)

## Description

Print Diamond is a programming kata whose goal is to generate a diamond-shaped pattern using letters of the alphabet.

In this version, the pattern is not built using spaces, but using dots (`.`), both inside and outside the diamond. This reinforces working with relative positions and symmetry without relying on traditional whitespace gaps.

## Rules

- The input is a single letter (from `A` to `Z`).
- The diamond starts at `A`.
- The pattern is vertically symmetrical.
- All padding is done using dots (`.`).
- Each line has the same total length.

## Example

### Input

```text
C
```

### Output

```text
..A..
.B.B.
C...C
.B.B.
..A..
```

## Pattern Construction

For a target letter `N`:

### 1. Diamond size
The total width of each line is:

```
2 * (position of N) - 1
```

For example:
- A → 1
- B → 3
- C → 5
- D → 7

## 2. Line rules

For each letter `L`:

- Its position determines how many dots are placed on the left and right.
- Dots are also placed between letters.

### Cases:

#### Letter A
Only a centered letter:

```text
..A..
```

#### Intermediate letters (B, C, ...)

```text
.L...L.
```

- Outer dots center the letter.
- Inner dots increase as the distance from A grows.

## 3. Symmetry

The diamond is built as:

1. From `A` to the target letter.
2. Then in reverse order (without repeating the middle line).

## Concepts Covered

- Java programming
- String manipulation
- Position calculations
- Algorithmic symmetry
- Pattern generation
- Text-based visual representation
- Precise index control

## Strategy

A typical approach includes:

1. Calculating the total diamond size.
2. For each letter:
   - Compute its relative position.
   - Build the line using dots (`.`) instead of spaces.
3. Concatenate the upper and lower halves.

## Objective

The goal of this kata is to practice:

- Construction of symmetric patterns
- Precise index handling
- Visual representation without neutral spaces
- Structured thinking in 1D arrays

## Author

Exercise completed as part of Cyber Dojo practice sessions using Java.
