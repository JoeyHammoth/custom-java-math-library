# Java Math Library

## Overview
The **Java Math Library** is a versatile and powerful library designed to simplify complex mathematical computations. Whether you are working on arithmetic calculations, statistical analysis, geometry, linear algebra, or financial computations, this library has you covered. It is well-suited for developers, educators, and researchers looking for a comprehensive toolset to handle various mathematical problems.

## Features

### Arithmetic
- Basic operations: addition, subtraction, multiplication, division
- Modular arithmetic
- Power and root calculations
- Factorial and permutations

### Combinatorics
- Permutations and combinations
- Binomial coefficients
- Probability calculations

### Finance
- Compound and simple interest calculations
- Loan amortization schedules
- Future value and present value calculations
- Annuity and investment analysis

### Functions
- Polynomial evaluation and operations
- Root-finding algorithms (e.g., Newton-Raphson)
- Interpolation and extrapolation
- Custom function parser and evaluator

### Geometry
- Area and perimeter of 2D shapes (circle, rectangle, triangle, etc.)
- Volume and surface area of 3D shapes (sphere, cylinder, cone, etc.)
- Point, line, and plane operations
- Distance and angle calculations

### Trigonometry
- Trigonometric functions: sine, cosine, tangent, and their inverses
- Hyperbolic functions
- Degree-radian conversion
- Law of sines and cosines

### Linear Algebra
- Vector operations (dot product, cross product, magnitude, etc.)
- Matrix operations (addition, multiplication, determinant, inverse)
- Eigenvalues and eigenvectors
- Solving systems of linear equations

### Sequences and Series
- Arithmetic and geometric sequences
- Partial sums
- Infinite series summation (where applicable)
- Fibonacci and other common sequences

### Statistics
- Mean, median, mode
- Variance and standard deviation
- Probability distributions (normal, binomial, etc.)
- Regression analysis and correlation

## Getting Started

### Prerequisites
- **Java 8 or later**

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/JoeyHammoth/custom-java-math-library.git
   ```
2. Add the library to your project:
   - If using Maven, include the following dependency:
     ```xml
     <dependency>
         <groupId>java.project</groupId>
         <artifactId>custom-java-math-library</artifactId>
         <version>1.0.0</version>
     </dependency>
     ```
   - If not using Maven, include the JAR file in your project's classpath.

### Usage

Here is a basic example demonstrating the usage of various modules in the library:

```java
package org.example;

import arithmetic.advanced.*;
import arithmetic.basic.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Addition.add(12, 12));
        System.out.println(Subtraction.subtract(12, 12));
        System.out.println(Multiplication.multiply(12, 12));
        System.out.println(Division.divide(12, 12));
        System.out.println(Remainder.remainder(12, 12));
        System.out.println(Exponent.exponent(1, 2));
    }
}
```

## Documentation
Detailed documentation and API references are available [here](https://github.com/JoeyHammoth/custom-java-math-library/wiki).

## Roadmap
- Add support for symbolic computation
- Expand support for advanced statistics and probability
- Integrate graphing utilities
- Add support for optimization algorithms

## Contributing
We welcome contributions to improve the library! Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bugfix.
3. Commit your changes and push them to your fork.
4. Create a pull request to the main repository.

Please ensure your code adheres to the coding guidelines and is thoroughly tested.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Authors
- **JoeyHammoth** - [My GitHub Profile](https://github.com/JoeyHammoth)

## Acknowledgments
- Inspiration from various open-source math libraries.
- Community feedback and support.
