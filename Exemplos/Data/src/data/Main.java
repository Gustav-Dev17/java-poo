
package data;


public class Main {
    public static void main(String[] args) {
        Data d = new Data((byte) 15, (byte) 03, (short) 2020);
        Hora h = new Hora((byte) 23, (byte) 30, (byte) 59);
    
        DataHora dh = new DataHora((byte) 16, (byte) 03, (short) 2020
        , (byte) 19, (byte) 30, (byte) 45);
        
        System.out.println(d.toString());
        System.out.println(h.toString());
        System.out.println(dh.toString());
    }
    
}
