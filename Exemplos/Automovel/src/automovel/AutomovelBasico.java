
package automovel;

public class AutomovelBasico extends Automovel{
    private boolean retrovisorDoLadoDoPassageiro;
    private boolean limpadorDoVidroTraseiro;
    private boolean radioAMFM;
    
    AutomovelBasico(String m, String c, byte comb, boolean retrov, boolean limpador, boolean radio){
        super(m, c, comb);
        retrovisorDoLadoDoPassageiro = retrov;
        limpadorDoVidroTraseiro = limpador;
        radioAMFM = radio;
    }
    AutomovelBasico(String m, String c, byte comb){
        super(m, c, comb);
        retrovisorDoLadoDoPassageiro = true;
        limpadorDoVidroTraseiro = true;
        radioAMFM = true;
    }
    public float quantoCusta(){
        float preco = super.quantoCusta();
            if (retrovisorDoLadoDoPassageiro)
                preco += 280;
            if (limpadorDoVidroTraseiro)
                preco += 650;
            if (radioAMFM)
                preco += 190;
            return preco;
    }
    public String toString(){
        String resultado = super.toString();
        if (retrovisorDoLadoDoPassageiro)
            resultado += "Possui retrovisor do lado do passageiro\n";
        if (limpadorDoVidroTraseiro)
            resultado += "Possui limpador do vidro traseiro\n";
        if (radioAMFM)
            resultado += "Possui radio AM/FM\n";
        return resultado;
    }
}
    

