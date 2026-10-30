/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_fp06.pizza_restaurant;
/**
 *
 * @author luism
 */
public class GestorEmentas {
    private Ementa[] ementas;
    private int numEmentas;
    private static final int MAX_EMENTAS = 20;
 
    public GestorEmentas() {
        this.ementas = new Ementa[MAX_EMENTAS];
        this.numEmentas = 0;
    }
 
    
    public boolean adicionarEmenta(Ementa ementa) {
        if (ementa == null || this.numEmentas >= MAX_EMENTAS) {
            return false;
        }
        if (this.encontrarEmenta(ementa.getCodigo()) != null) {
            return false; 
        }
        if (ementa.isAtivo() && this.getEmentaAtiva() != null) {
            ementa.setAtivo(false);
        }
        this.ementas[this.numEmentas++] = ementa;
        return true;
    }
 
    
    public Ementa encontrarEmenta(int codigo) {
        for (int i = 0; i < this.numEmentas; i++) {
            if (this.ementas[i].getCodigo() == codigo) {
                return this.ementas[i];
            }
        }
        return null;
    }
 
    
    public Ementa getEmentaAtiva() {
        for (int i = 0; i < this.numEmentas; i++) {
            if (this.ementas[i].isAtivo()) {
                return this.ementas[i];
            }
        }
        return null;
    }
 
    
    public boolean ativarEmenta(int codigo) {
        Ementa alvo = this.encontrarEmenta(codigo);
        if (alvo == null) {
            return false;
        }
        for (int i = 0; i < this.numEmentas; i++) {
            this.ementas[i].setAtivo(false);
        }
        alvo.setAtivo(true);
        return true;
    }
 
    
    public boolean desativarEmenta(int codigo) {
        Ementa alvo = this.encontrarEmenta(codigo);
        if (alvo == null) {
            return false;
        }
        alvo.setAtivo(false);
        return true;
    }
 
    public int getNumEmentas() { return this.numEmentas; }
 
    
    public String listar() {
        if (this.numEmentas == 0) {
            return "Não existem ementas.";
        }
        String texto = "";
        for (int i = 0; i < this.numEmentas; i++) {
            texto += this.ementas[i] + "\n";
        }
        return texto;
    }
}