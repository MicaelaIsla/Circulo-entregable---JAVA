package figuras;

public class Punto {
      private double x;
      private double y;
      
      /*constructor publico que recibe parametros que espera el privado y
      los construye*/
      
      public Punto (double x, double y) {
    	  this.x=x;
    	  this.y=y;
      }
	
      /*get para que la salida sea publica , arriba los llama en privado*/
      public double getX() {
    	  return this.x;
      }
      public double getY() {
    	  return this.y;
      }
      
}

