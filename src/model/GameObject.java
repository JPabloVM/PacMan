package model;

import Exceptions.ExceptionParameter;

public abstract class GameObject {
    protected int posicaoX;
    protected int posicaoY;
    private int screenzize;
    

    public GameObject(int posicaoX, int posicaoY) {
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }

    public GameObject() {
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

    public int getScreenzize() {
        return screenzize;
    }

    public void setScreenzize(int screenzize) {
        this.screenzize = screenzize;
    }

    public GameObject(int screenzize) {
        if(screenzize<0){
            throw new ExceptionParameter("O tamanho da tela deve ser maior que 0!");
        }
        this.screenzize = screenzize;
    }

   

}
