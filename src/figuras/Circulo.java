package figuras;

public class Circulo {
 
	private Punto centro;   
    private double radio;
    
    public Circulo(Punto centro,double radio) {
    	this.centro = centro;
    	this.radio = radio;
    }
    
    /*calculo en base al metodo  si circulo 1 y 2 se tocan, pido radio y punto
      */ 
    boolean intersectaCon(Circulo obj) {
    
      double r1= this.radio;
      double r2= obj.radio;

      double x1=this.centro.getX();
      double x2= obj.centro.getX();
      
      double y1= this.centro.getY();
      double y2= obj.centro.getY();
      
      /*calculo raiz y potencia Math.sqrt y Math.pow*/
      
      double d = Math.sqrt(Math.pow(( x2-x1 ),2) + Math.pow((y2-y1),2));
      /*lo calculo y despues lo retorno*/
      return d <= r1 + r2;
}
     public static void main(String[] args) {
     
    	 Circulo circulo1 = new Circulo(new Punto(1,1),3);
    	 Circulo circulo2 = new Circulo(new Punto(2,-1),2.5);
    	 /*CIrculo 2 no lleva punto intersectaCon xq sino pide metodo intersectaCon
    	 intersecta recibe un objeto, que  ya esta instanciado y lo pone directo.*/
    	  
    System.out.println(circulo1.intersectaCon(circulo2));
     }
}

