
package automovel;

public class AutomovelDeLuxo extends AutomovelBasico {
    
    private static final byte NUMEROMAXIMODEPRESTACOES = 36;
    
    private boolean direcaoHidraulica;
    private boolean cambioAutomatico;
    private boolean vidrosETravasEletricos;
    
    AutomovelDeLuxo(String m, String c, byte comb, boolean retrov, boolean limpador, boolean radio, boolean dir, boolean cambio, boolean vidros){
        super(m, c, comb, retrov, limpador, radio);
        direcaoHidraulica = dir;
        cambioAutomatico = cambio;
        vidrosETravasEletricos = vidros;
    }
    AutomovelDeLuxo(String m, String c, byte comb){
        super(m, c, comb);
        direcaoHidraulica = true;
        cambioAutomatico = true;
        vidrosETravasEletricos = true;
    }
    
    public float quantoCusta(){
        float preco = super.quantoCusta();
        if (direcaoHidraulica)
            preco += 5340;
        if (cambioAutomatico)
            preco += 7500;
        if (vidrosETravasEletricos)
            preco += 2320;
        return preco;
    }
    public String toString(){
        String resultado = super.toString();
        if (direcaoHidraulica)
            resultado += "Possui direção hidráulica\n";
        if (cambioAutomatico)
            resultado += "Possui câmbio automático\n";
        if (vidrosETravasEletricos)
            resultado += "Possui vidros e travas elétricos";
        return resultado;
    }
}
