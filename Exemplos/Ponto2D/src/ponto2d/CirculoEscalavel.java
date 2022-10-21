
package ponto2d;

public class CirculoEscalavel implements Escalavel, ObjetoGeometrico{
    
    private Ponto2D centro;
    private double raio;
    
    Circulo(Ponto2D centro, double raio){
        this.centro = centro;
        this.raio = raio;
}
@Override
public Ponto2D centro(){
    return centro;
    }
public double calculaArea(){
    //PI vezes o raio quadrado
    return Math.PI*raio*raio;
    }
@Override
public double calculaPerimetro(){
    //duas vezes PI vezes o raio.
    return 2.0*Math.PI*raio;
    }
@Override
public void amplia(double escala){
    raio = raio*escala;
}
@Override
public void espelha(){
    centro = new Ponto2D(-centro.getX(), centro.getY());
}
public String toString(){
    return "Círculo com centro em "+centro+" e raio"+raio;
}
@Override
public double calcularArea() {
throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}