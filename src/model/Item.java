package model;
public abstract class Item extends GameObject {

    private boolean visivel;
    private int posicaoX;
    private int posicaoY;

   

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public Item() {
    }

    public Item(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }
    
    
    
}
