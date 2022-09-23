package model;

public class Booster extends Item {
    private int duracaoBoost;

    public int getDuracaoBoost() {
        return duracaoBoost;
    }

    public void setDuracaoBoost(int duracaoBoost) {
        this.duracaoBoost = duracaoBoost;
    }

    public Booster() {
    }

    public Booster(int posicaoX, int posicaoY, boolean visivel, int duracaoBoost) {
        super(posicaoX, posicaoY, visivel);
        this.duracaoBoost = duracaoBoost;
    }

    

    public Booster(int posicaoX, int posicaoY) {
        super(posicaoX, posicaoY);
    }

    public boolean playerComBooster(Player pl) {
        
        if (duracaoBoost > 0) {
            pl.setInvencivel(true);
            return true;
        }if(duracaoBoost<=0){
            pl.setInvencivel(false);
            return false;
        }

        return false;
    }

}
