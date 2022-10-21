
package ponto2d;


public class Retangulo implements ObjetoGeometrico {
    
    private Ponto2D primeiroCanto, segundoCanto;
    
    Retangulo(Ponto2D primeiroCanto, Ponto2D segundoCanto){
        this.primeiroCanto = primeiroCanto;
        this.segundoCanto = segundoCanto;
}
@Override
public Ponto2D centro(){
    double coordX = (primeiroCanto.getX()+segundoCanto.getX())/2.;
    double coordY = (primeiroCanto.getY()+segundoCanto.getY())/2.;
    return new Ponto2D(coordX, coordY);
}
public double calculaArea(){
    double ladoX = Math.abs(primeiroCanto.getX()-segundoCanto.getX());
    double ladoY = Math.abs(primeiroCanto.getY()-segundoCanto.getY());
    return ladoX*ladoY;
}
@Override
public double calculaPerimetro(){
    double ladoX = Math.abs(primeiroCanto.getX()-segundoCanto.getX());
    double ladoY = Math.abs(primeiroCanto.getY()-segundoCanto.getY());
    return 2*ladoX + 2*ladoY;
}
public String toString(){
    return "Retângulo com cantos em "+primeiroCanto+" e "+segundoCanto;
    }
}