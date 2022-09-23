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
        int minimo = 0;
        int maximo = 3;
        int range = maximo - minimo + 1;
        int escolha = (int) (Math.random() * range) + minimo;
        System.out.println(escolha);

        if (podeMoverGhost(escolha) == true) {
            if (escolha == 0) {
                this.setPosicaoY(this.getPosicaoY() - 10);
                this.setDirection(0);
            }
            if (escolha == 1) {
                this.setPosicaoX(this.getPosicaoX() + 10);
                this.setDirection(90);

            }
            if (escolha == 2) {
                this.setPosicaoY(this.getPosicaoY() + 10);
                this.setDirection(180);
            }
            if (escolha == 3) {
                this.setPosicaoX(this.getPosicaoX() - 10);
                this.setDirection(270);
            }
        }

    }

    public boolean podeMoverGhost(int escolha) {
        boolean pMoverGhost = false;

        if (escolha == 0) {

            if (this.getPosicaoY() - 10 > 0) {
                pMoverGhost = true;
            }
        }
        if (escolha == 1) {
            if (this.getPosicaoX() + 10 < this.getScreensize()) {
                pMoverGhost = true;
            }
        }
        if (escolha == 2) {

            if (this.getPosicaoY() + 10 < this.getScreensize()) {
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

    public static void removeLife(Player pl) {
        pl.setLife(pl.getLife() - 1);
    }

}
