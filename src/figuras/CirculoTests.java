package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTests {
	  Circulo circulo1;
	  Circulo circulo2;
	  //no se intersectan
	  @Test
	  public void circuloTest1() {
	    circulo1 = new Circulo(new Punto(2,1),2);
	        circulo2 = new Circulo(new Punto(5,5),2);
	    assertFalse(circulo1.intersectaCon(circulo2));
	     
	  }
	  //se intersecta en 1 punto
	  @Test
	  public void circuloTest2() {
	     circulo1 = new Circulo(new Punto(2,1),3);
	       circulo2 = new Circulo(new Punto(5,5),2);
	       assertTrue(circulo1.intersectaCon(circulo2));
	  }
	  //se intersecta en 2 puntos
	  @Test
	  public void circuloTest3() {
	    circulo1 = new Circulo(new Punto(1,1),3);
	        circulo2 = new Circulo(new Punto(2,-1),2.5);
	    assertTrue(circulo1.intersectaCon(circulo2));
	  }
	}