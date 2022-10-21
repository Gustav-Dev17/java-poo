
package estação;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Estação {
    
    
    public int dia;
    public int mes;
    public int ano;
    
    
   public Estação(){}
   private String getDateTime() {
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    return dateFormat.format(date);
   }
    public int getdia(){
        return dia;
}
    public int getmes(){
        return mes;
}
    public int getano(){
        return ano;
    }
    public void setdia(int value){
        if (value >= 0) dia = value;
    }
    public void setmes(int value){
        if (value >= 0) mes = value;
    }
    public void setano(int value){
        if (value >= 0) ano = value;
    }
    public void setDateTime(int value){
        
    }
}
