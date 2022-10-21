
package ponto2d;

public class Circulo implements ObjetoGeometrico {
    
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
@Override
public double calculaArea(){
    //PI vezes o raio quadrado
    return Math.PI*raio*raio;
    }
@Override
public double calculaPerimetro(){
    //duas vezes PI vezes o raio.
    return 2.0*Math.PI*raio;
    }
public String toString(){
    return "Círculo com centro em "+centro+" e raio"+raio;
    }

@Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}