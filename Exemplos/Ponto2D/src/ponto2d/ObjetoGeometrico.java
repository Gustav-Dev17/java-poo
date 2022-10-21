
package ponto2d;

public interface ObjetoGeometrico {
    //Retorna qual é o centro do objeto.
    Ponto2D centro();
    //Calcula a área do objeto.
    double calcularArea();
    //Calcula o perímetro do objeto.
    double calculaPerimetro();
}
