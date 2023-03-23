package service;

import model.Quadrado;
import model.Triangulo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraServiceTest {
    CalculadoraService calculadoraService;
    @Before
    public void before(){
        calculadoraService = new CalculadoraService();
    }

    @Test
    public void deveSomar() {
        int a = 2;
        int b = 2;
        int soma =  calculadoraService.somar(a, b);
        assertEquals(4, soma);

    }

    @Test
    public void deveSubtrair() {
        int a = 2;
        int b = 2;
        int subtracao =  calculadoraService.subtrair(a, b);
        assertEquals(0, subtracao);

    }

    @Test
    public void deveDividir() {
        int a = 2;
        int b = 2;
        int divisao =  calculadoraService.dividir(a, b);
        assertFalse(divisao == 2);

    }

    @Test
    public void deveMultiplicar() {
        int a = 2;
        int b = 2;
        int multiplicacao =  calculadoraService.multiplicar(a, b);
        assertEquals(4, multiplicacao);

    }
        @Test
        public void deveCalcularAreaQuadrado(){
        int a = 2;
        int areaQuadrado = calculadoraService.calcularAreaQuadrado(a);
        assertEquals(4, areaQuadrado);
        }

    @Test
    public void deveCalcularAreaTriangulo(){
        int a = 2;
        int b = 2;
        int areaTriangulo = calculadoraService.calcularAreaTriangulo(a,b);
        assertEquals(2, areaTriangulo);
    }

    @Test
    public void deveRetonarOMenorTriangulo(){
        Triangulo triangulo1 = new Triangulo(2,4);
        Triangulo triangulo2 = new Triangulo(3,6);
        Triangulo resultado = calculadoraService.trianguloDeMenorArea(triangulo1, triangulo2);
        assertEquals(resultado,triangulo1);
    }

    @Test
    public void deveRetonarOMaiorTriangulo(){
        Triangulo triangulo1 = new Triangulo(2,4);
        Triangulo triangulo2 = new Triangulo(3,6);
        Triangulo resultado = calculadoraService.trianguloDeMaiorArea(triangulo1, triangulo2);
        assertEquals(resultado,triangulo1);
    }

    @Test
    public void deveRetornarOMenorQuadrado(){
        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado(4);
        Quadrado resultado = calculadoraService.quadradoDeMenorArea(quadrado1,quadrado2);
        assertEquals(resultado,quadrado2);
    }

    @Test
    public void deveRetornarOMaiorQuadrado(){
        Quadrado quadrado1 = new Quadrado(2);
        Quadrado quadrado2 = new Quadrado(4);
        Quadrado resultado = calculadoraService.quadradoDeMaiorArea(quadrado1,quadrado2);
        assertEquals(resultado,quadrado2);
    }
}
