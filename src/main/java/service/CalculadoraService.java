package service;

import model.Quadrado;
import model.Triangulo;

public class CalculadoraService {

    private int a;

    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        return a / b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int calcularAreaQuadrado(int a) {
        return a * a;
    }

    public int calcularAreaTriangulo(int a, int b) {
        return (a * b) / 2;
    }

    public double calcularArea(Quadrado quadrado) {
        return multiplicar((int) quadrado.getLado(), (int) quadrado.getLado());
    }

    public double calcularArea(Triangulo triangulo) {
        return multiplicar((int) triangulo.getBase(), (int) triangulo.getAltura()) / 2.0;
    }

    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double primeiroTriangulo = calcularArea(triangulo1);
        double segundoTriangulo = calcularArea(triangulo2);
        if (primeiroTriangulo > segundoTriangulo) {
            return triangulo2;
        } else if (primeiroTriangulo < segundoTriangulo) {
            return triangulo1;
        } else {
            return null;
        }
    }

    public Triangulo trianguloDeMaiorArea(Triangulo triangulo1, Triangulo triangulo2) {
        double primeiroTriangulo = calcularArea(triangulo1);
        double segundoTriangulo = calcularArea(triangulo2);
        if (primeiroTriangulo > segundoTriangulo) {
            return triangulo2;
        } else if (primeiroTriangulo < segundoTriangulo) {
            return triangulo1;
        } else {
            return null;
        }
    }

    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double primeiroQuadrado = calcularArea(quadrado1);
        double segundoQuadrado = calcularArea(quadrado2);
        if (primeiroQuadrado > segundoQuadrado) {
            return quadrado1;
        } else if (primeiroQuadrado < segundoQuadrado) {
            return quadrado2;
        } else {
            return null;
        }
    }

    public Quadrado quadradoDeMaiorArea(Quadrado quadrado1, Quadrado quadrado2) {
        double primeiroQuadrado = calcularArea(quadrado1);
        double segundoQuadrado = calcularArea(quadrado2);
        if (primeiroQuadrado > segundoQuadrado) {
            return quadrado1;
        } else if (primeiroQuadrado < segundoQuadrado) {
            return quadrado2;
        } else {
            return null;
        }
    }
}
//instruções
//    public void calcularArea() {
//    }
//    public Triangulo trianguloDeMenorArea(Triangulo triangulo1, Triangulo triangulo2) {
//    }
//    public Quadrado quadradoDeMenorArea(Quadrado quadrado1, Quadrado quadrado2) {
//    }
//    Caso a area seja igual, retorn null

