import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import model.Bomb;
import model.Booster;
import model.GameObject;
import model.Ghost;
import model.Player;

public class Game extends JFrame implements KeyListener {

	private static final long serialVersionUID = 1L;
	private Player player = new Player(600, 50, 180);
	private Ghost ghost1 = new Ghost(100, 0, 90);
	private Ghost ghost2 = new Ghost(500, 0, 0);
	private Ghost ghost3 = new Ghost(0, 500, 0);
	private Ghost ghost4 = new Ghost(500, 500, 0);
	private Bomb bomb = new Bomb(100, 100);
	private Booster booster = new Booster(400, 400);

	private JLabel imgPlayer = new JLabel(new ImageIcon("src/images/pacman.png"));
	private JLabel imgGhost1 = new JLabel(new ImageIcon("src/images/ghost.png"));
	private JLabel imgGhost2 = new JLabel(new ImageIcon("src/images/ghost.png"));
	private JLabel imgGhost3 = new JLabel(new ImageIcon("src/images/ghost.png"));
	private JLabel imgGhost4 = new JLabel(new ImageIcon("src/images/ghost.png"));
	private JLabel imgBomb = new JLabel(new ImageIcon("src/images/bomb.png"));
	private JLabel imgBooster = new JLabel(new ImageIcon("src/images/booster.png"));

	private final int SCREENSIZE = 600;
	private int speed = 500;

	public static void main(String[] args) {
		new Game().init();

	}

	private void init() {
		setLayout(null);
		this.setVisible(true);
		player.setScreenSize(SCREENSIZE);
		player.setLife(15);

		ghost1.setScreenSize(SCREENSIZE);
		ghost2.setScreenSize(SCREENSIZE);
		ghost3.setScreenSize(SCREENSIZE);
		ghost4.setScreenSize(SCREENSIZE);

		add(imgPlayer);
		add(imgGhost1);
		add(imgGhost2);
		add(imgGhost3);
		add(imgGhost4);
		add(imgBomb);
		add(imgBooster);

		render();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(SCREENSIZE + 100, SCREENSIZE + 100);

		setVisible(true);
		addKeyListener(this);

		run();
	}

	private void render() {

		updateLocation(imgPlayer, player);
		updateLocation(imgGhost1, ghost1);
		updateLocation(imgGhost2, ghost2);
		updateLocation(imgGhost3, ghost3);
		updateLocation(imgGhost4, ghost4);
		updateLocation(imgBomb, bomb);
		updateLocation(imgBooster, booster);
		setTitle("Life: " + player.getLife());
		SwingUtilities.updateComponentTreeUI(this);

	}

	private void updateLocation(JLabel label, GameObject object) {
		label.setBounds(object.getPosicaoX(), object.getPosicaoY(), 50, 50);
		ImageIcon myImage = (ImageIcon) label.getIcon();
		Image img = myImage.getImage();
		Image newImg = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(newImg));
	}

	private void run() {
		while (player.getLife() > 0) {

			// Se player colidir com ghost perde 1 vida
			if (player.getPosicaoX() == ghost1.getPosicaoX() && player.getPosicaoY() == ghost1.getPosicaoY()) {
				if (!player.isInvencivel()) {
					Ghost.removeLife(player);
				}
			}
			if (player.getPosicaoX() == ghost2.getPosicaoX() && player.getPosicaoY() == ghost2.getPosicaoY()) {
				if (!player.isInvencivel()) {
					Ghost.removeLife(player);
				}
			}
			if (player.getPosicaoX() == ghost3.getPosicaoX() && player.getPosicaoY() == ghost3.getPosicaoY()) {
				if (!player.isInvencivel()) {
					Ghost.removeLife(player);
				}
			}
			if (player.getPosicaoX() == ghost4.getPosicaoX() && player.getPosicaoY() == ghost4.getPosicaoY()) {
				if (!player.isInvencivel()) {
					Ghost.removeLife(player);
				}
			}

			// Se player colidir com bomb perde 1 vida
			if (bomb.isVisivel()) {
				if (player.getPosicaoX() == bomb.getPosicaoX() && player.getPosicaoY() == bomb.getPosicaoY()) {
					if (!player.isInvencivel()) {
						bomb.removeLife(player);
					}
				}
			}

			// Se player colidir com o booster fica invencivel por certo periodo
			if (booster.isVisivel()) {
				if (player.getPosicaoX() == booster.getPosicaoX() && player.getPosicaoY() == booster.getPosicaoY()) {
					booster.playerComBooster(player);
					booster.setVisivel(false);
				}
			}

			// Tempo do booster
			if (player.isInvencivel() == true) {
				booster.setDuracaoBoost(booster.getDuracaoBoost() - 1);
				booster.playerComBooster(player);
			}

			try {
				ghost1.moverGhost();
				ghost3.moverGhost();
				ghost2.moverGhost();
				ghost4.moverGhost();

				player.mover(player.getDirection());
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			render();

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		if (c == '8' || c == 'w')
			player.setDirection(0);
		if (c == '6' || c == 'd')
			player.setDirection(90);
		if (c == '2' || c == 's')
			player.setDirection(180);
		if (c == '4' || c == 'a')
			player.setDirection(270);
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
