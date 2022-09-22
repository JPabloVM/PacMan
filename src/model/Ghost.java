package model;

public class Ghost extends GameObject {
    private int direction;

    public Ghost() {
    }

    public Ghost(int posicaoX, int posicaoY, int direction) {
        super(posicaoX, posicaoY);
        this.direction = direction;
    }

    public Ghost(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setScreenSize(int screenzize) {

    }

    public void moverGhost() {
        // Defino o escolha de opções que o Random pode "escolher"
        int mini = 0;
        int maxi = 4;
        int limite = maxi - mini + 1;
        int escolha = (int) (Math.random() * limite);

        if (podeMoverGhost(escolha) == true) {
            this.setPosicaoY(this.getPosicaoY() - 10);
        }
        if (podeMoverGhost(escolha) == true) {
            this.setPosicaoX(this.getPosicaoX() + 10);
        }
        if (podeMoverGhost(escolha) == true) {
            this.setPosicaoY(this.getPosicaoY() + 10);
        }
        if (podeMoverGhost(escolha) == true) {
            this.setPosicaoX(this.getPosicaoX() - 10);
        }

    }

    public boolean podeMoverGhost(int escolha) {
        int novoX, novoY;
        boolean pMoverGhost = false;

        if (escolha == 0) {

            if (this.getPosicaoY() - 10 > 0) {
                pMoverGhost = true;
            }
        }
        if (escolha == 1) {
            novoX = this.getPosicaoX() + 10;
            if (novoX > 0 && novoX < getScreenzize() && posicaoY < getScreenzize()) {
                pMoverGhost = true;
            }
        }
        if (escolha == 2) {
            novoY = this.getPosicaoY() + 10;

            if (novoY > 0 && novoY < getScreenzize() && posicaoX < getScreenzize()) {
                pMoverGhost = true;
            }
        }
        if (escolha == 3) {
            if (this.getPosicaoX() - 10 > 0) {
                pMoverGhost = true;
            }
        }

        return pMoverGhost;

    }

}
