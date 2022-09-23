package model;

import Exceptions.ExceptionParameter;

public class Player extends GameObject {
    private int life;
    private int direction;
    private boolean invencivel;

    public Player() {
    }

    public Player(int posicaoX, int posicaoY, int direction) {
        super(posicaoX, posicaoY);

        this.direction = direction;

    }

    public Player(int direction) {
        this.direction = direction;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (life < 0) {
            throw new ExceptionParameter("A quantidade de vidas deve ser maior que 0!");
        }
        this.life = life;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public boolean isInvencivel() {
        return invencivel;
    }

    public void setInvencivel(boolean invencivel) {
        this.invencivel = invencivel;
    }

    public void setScreenSize(int screenzize) {
    }

    public void mover(int direction) {
        /*
         * if (podeMover(0) == true) {
         * this.setPosicaoY(this.getPosicaoY() - 10);
         * }
         * if (podeMover(90) == true) {
         * this.setPosicaoX(this.getPosicaoX() + 10);
         * }
         * if (podeMover(180) == true) {
         * this.setPosicaoY(this.getPosicaoY() + 10);
         * }
         * if (podeMover(270) == true) {
         * this.setPosicaoX(this.getPosicaoX() - 10);
         * }
         */
        if (podeMover(direction)) {
            switch (direction) {
                case 0:
                    this.setPosicaoY(this.getPosicaoY() - 10);
                    break;
                case 180:
                    this.setPosicaoY(this.getPosicaoY() + 10);
                    break;
                case 270:
                    this.setPosicaoX(this.getPosicaoX() - 10);
                case 90:
                    this.setPosicaoX(this.getPosicaoX() + 10);
                    break;
                    default:
                    System.out.println("Direção inválida");
            }
        }

    }

    public boolean podeMover(int direction) {
       /* boolean pMover = false;

        if (direction == 0) {

            if (this.getPosicaoY() - 10 > 0) {
                pMover = true;
                System.out.println("pode mover 0");
            }
        }
        if (direction == 90) {

            if (this.getPosicaoX() + 10 < this.getScreenzize()) {
                pMover = true;
                System.out.println("pode mover 90");
            }
        }
        if (direction == 180) {

            if (this.getPosicaoY() + 10 < this.getScreenzize()) {
                pMover = true;
                System.out.println("pode mover 180");
            }
        }
        if (direction == 270) {
            if (this.getPosicaoX() - 10 > 0) {
                pMover = true;
                System.out.println("pode mover 270");
            }
        }
        //JOptionPane.showMessageDialog(null, "Não pode mover");
        return pMover;*/

        boolean ok = false;
        
        if(direction == 0)
            if(this.getPosicaoY() - 10 > 0)
                ok = true; 
        if(direction == 180)
            if(this.getPosicaoY() + 10 < this.getScreensize())
                ok = true; 
        if(direction == 270)
            if(this.getPosicaoX() - 20 > 0)
                ok = true; 
        if(direction == 90)
            if(this.getPosicaoX() + 10 < this.getScreensize())
                ok = true; 
        return ok;

    }

}
