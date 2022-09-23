package model;
public class Bomb extends Item{

    public Bomb() {
    }

    public Bomb(int posicaoX, int posicaoY, boolean visivel) {
        super(posicaoX, posicaoY, visivel);
    }

    public Bomb(int posicaoX, int posicaoY){
        super(posicaoX,posicaoY);
    }
    
    public void removeLife(Player pl){
        pl.setLife(pl.getLife() - 1);
    }

    
       
    
}
