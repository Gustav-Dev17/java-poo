
package data;

public class Data {
    private byte dia;
    private byte mes;
    private short ano;

Data(byte dia, byte mes, short ano){
    if (dataValida(dia, mes, ano)){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    else {
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }
}

public boolean dataValida(byte dia, byte mes, short ano){
    if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes ==12){
        return (dia>=1 && dia<=31);
    }
    else {
        if (mes==2){
            return (dia>=1 && dia <=29);
        }
        else {
            return (dia>=1 && dia<=30);
        }
    }
}

public String toString(){
    return dia+"/"+mes+"/"+ano;
}
    
}
