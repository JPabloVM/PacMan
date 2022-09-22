package model;
public class Booster extends Item {
    private int duracao;
    
    

    public Booster(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    /*private boolean imunizar(int posicaoX,int posicaoY){
        if(posicaoX==)
    
}*/
public Booster() {
}
public Booster(int posicaoX, int posicaoY){
    super(posicaoX, posicaoY);
}

public Booster(int posicaoX, int posicaoY, int duracao, int posicaoX2, int posicaoY2) {
    this.duracao = duracao;
    posicaoX = posicaoX2;
    posicaoY = posicaoY2;
}
}
