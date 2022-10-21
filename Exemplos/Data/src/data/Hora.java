
package data;

public class Hora {
    private byte hora;
    private byte minuto;
    private byte segundo;
  
Hora(byte h, byte m, byte s){
    if (horaValida(h,m,s)){
        hora = h;
        minuto = m;
        segundo = s;
    }
    else {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }
}
public boolean horaValida(byte h, byte m, byte s){
    return (h>=0 && h<24 && m>=0 && m<60 && s>=0 && s<60);
}
public String toString(){
    return hora+"h"+minuto+"m"+segundo+"s";
}
    
}