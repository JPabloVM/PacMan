package model;

public abstract class Item extends GameObject {

    private boolean visivel;

    public boolean isVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public Item() {
    }

    public Item(int posicaoX, int posicaoY, boolean visivel) {
        super(posicaoX, posicaoY);
        this.visivel = visivel;
    }

    public Item(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }
    

}
