package model;
public class Bomb extends Item{
    public int removerVida;

    public int getRemoverVida() {
        return removerVida;
    }

    public void setRemoverVida(int removerVida) {
        this.removerVida = removerVida;
    }

    public Bomb() {
    }

    public Bomb(int removerVida) {
        this.removerVida = removerVida;
    }

    public Bomb(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }

    
    
}
