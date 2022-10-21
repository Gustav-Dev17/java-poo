
package data;

public class DataHora {
    private Data estaData;
    private Hora estaHora;
    
    DataHora(byte dia, byte mes, short ano, byte h, byte m, byte s){
        estaData = new Data(dia, mes, ano);
        estaHora = new Hora(h, m, s);
    }
    
    DataHora(byte dia, byte mes, short ano){
        estaData = new Data(dia, mes, ano);
        estaHora = new Hora((byte) 0,(byte) 0,(byte) 0);
    }
    
    public String toString(){
        return estaData+" "+estaHora;
    }
    
}