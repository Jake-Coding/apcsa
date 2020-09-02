# 08/31/2020

## What is a computer?

- Billions of light switches (bits)
  - On or off (1 or 0)
- Can store information
  - Combinations of on and off
- 8 bits == 1 byte
  - can get bigger (megabyte = million bytes, etc.)

## Binary

- Boolean arithmetic
- EXAMPLES:
  - `1897` = `1 * 10^3 + 8 * 10^2 + 9 * 10^1 + 7 * 10^0`

## Types of Vars

- `char`
  - The byte value -> a character
    - ASCII table
  - Default: empty char
- `int` / `long`
  - signed vs unsigned (use first or last bit to represent +/-)
  - Default: `0`
- `float` / `double`
  - Default: `0.0`
- `Object`
  - Default: `Null`

## Computer instructions

- Byte value -> operation
  - `x86`

## RAM

- Grid of bytes
  - Labeled rows/columns
    - Address (A1, B7, etc.)
- Each program gets a space of grid
  - Stack
    - LIFO
- Program can also use less organized memory in RAM
  - Heap
    - Can grab any data

## Running a program

- Instructions go on stack
- Primitives go on stack (ints, chars, floats, doubles, bools, etc.)
  - Stored by value
- Objects go on heap (String, Object)
  - Java likes Capitalized Objects
  - Stored by address (reference)
  - Object names in stack, with pointers to value in heap
- Every function call, add it to stack
- Then stack executes top -> bottom

## Examples

- `int x = 3; int y = x; y = y+1;`
  - `y = 4`, `x = 3` (cause its primitive)
- `String s = "a"; String t = s; t = t + "b";` 
  - Mutates both - `s = "ab"` and `t = "ab"` (cause it modifies the reference object)
  - Only sometimes tho, cause sometimes `t` will be stored not on same address as `s`
