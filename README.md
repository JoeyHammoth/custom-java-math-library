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
- **Java 11 or later**

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
For documentation regarding this library of packages, the javadoc can be accessed [here](https://joeyhammoth.github.io/custom-java-math-library/).
## Project Structure 
```
custom-java-math-library
├── LICENSE
├── README.md
├── pom.xml
└── src
    └── main
        └── java
            ├── arithmetic
            │   ├── advanced
            │   │   ├── Exponent.java
            │   │   ├── Factorial.java
            │   │   ├── Logarithm.java
            │   │   └── package-info.java
            │   ├── basic
            │   │   ├── Addition.java
            │   │   ├── Division.java
            │   │   ├── Multiplication.java
            │   │   ├── Remainder.java
            │   │   ├── Subtraction.java
            │   │   └── package-info.java
            │   └── package-info.java
            ├── calculus
            │   ├── Derivative.java
            │   └── package-info.java
            ├── combinatorics
            │   ├── Basic.java
            │   └── package-info.java
            ├── finance
            │   ├── Basic.java
            │   └── package-info.java
            ├── function
            │   ├── Element.java
            │   ├── Expression.java
            │   ├── Function.java
            │   ├── Operation.java
            │   ├── Type.java
            │   ├── advanced
            │   │   ├── Cos.java
            │   │   ├── Exp.java
            │   │   ├── Log.java
            │   │   ├── Sin.java
            │   │   └── package-info.java
            │   ├── basic
            │   │   ├── Constant.java
            │   │   ├── Variable.java
            │   │   └── package-info.java
            │   └── package-info.java
            ├── geometry
            │   ├── Coordinate.java
            │   ├── Distance.java
            │   ├── Polygon.java
            │   ├── Shape.java
            │   ├── ThreeDimCoordinate.java
            │   ├── ThreeDimShape.java
            │   ├── formula
            │   │   ├── ThreeDimensional.java
            │   │   ├── TwoDimensional.java
            │   │   └── package-info.java
            │   ├── package-info.java
            │   └── trig
            │       ├── Advanced.java
            │       ├── Basic.java
            │       └── package-info.java
            ├── linalg
            │   ├── Matrix.java
            │   ├── advanced
            │   │   ├── Attributes.java
            │   │   ├── Diagonal.java
            │   │   ├── Eigen.java
            │   │   ├── Identity.java
            │   │   ├── Inverse.java
            │   │   ├── Simplification.java
            │   │   ├── Transpose.java
            │   │   └── package-info.java
            │   ├── basic
            │   │   ├── Addition.java
            │   │   ├── Division.java
            │   │   ├── Multiplication.java
            │   │   ├── Operation.java
            │   │   ├── Subtraction.java
            │   │   └── package-info.java
            │   └── package-info.java
            ├── seqser
            │   ├── Arithmetic.java
            │   ├── Geometric.java
            │   ├── Harmonic.java
            │   └── package-info.java
            └── statistics
                ├── Basic.java
                ├── Evaluation.java
                ├── Regression.java
                └── package-info.java                           
```
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
