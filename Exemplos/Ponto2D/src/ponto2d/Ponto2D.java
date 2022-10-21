
package ponto2d;

public class Ponto2D {
    protected double x, y;
        public Ponto2D(double x, double y){
            this.x = x;
            this.y = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
}