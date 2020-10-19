# Functions

Naming a process

- Level of abstrction
- Reusable
- Isolate changing parts (parameters)

## Types of functions

- Commands

  - Functions without outputs
  - May produce side effects
    - Printing to screen, changing data, sounds
    - Anything that is not the return value of the function
- Queries
  - Functions with outputs

## Functions in Java

In java, functions and methods are synonymous  
Method signatures declare methods

- accessibility (public/private/protected)
- type (static)
- return type (`int`, `double`, `void`, etc.)
- methodName (Name of the method)
- parameters (inputs)
- example:
  - `public static int getAbsoluteValue(int v)`

Can have same names based on the function signature. (Overloading functions)  
`doStuff()` and `doStuff(int x)` are 2 separate functions. calling `doStuff()` vs `doStuff(3)` call separate functions.  
Inputted parameters -> arguments
