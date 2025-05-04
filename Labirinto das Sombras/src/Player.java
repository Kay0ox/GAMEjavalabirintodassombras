import java.awt.Graphics;
import java.awt.Color;

public class Player {
// posição do jogador
	private int x;
	private int y;
	
	//tamanho do jogador
	private final int tamanho = 40;
	
	//velocidade do jogador(quantos pixes o jogador anda por tecla pressionada )
	
	private final int velocidade = 5;
	
	public Player(int xInicial, int yInicial) {
		this.x = xInicial;
		this.y = yInicial;
	}
	
	public void mover(String direcao) {
	    switch (direcao) {
	        case "CIMA":
	            if (y - velocidade >= 0) {
	                y -= velocidade;
	            }
	            break;
	        case "BAIXO":
	            if (y + velocidade + tamanho <= 600) {
	                y += velocidade;
	            }
	            break;
	        case "ESQUERDA":
	            if (x - velocidade >= 0) {
	                x -= velocidade;
	            }
	            break;
	        case "DIREITA":
	            if (x + velocidade + tamanho <= 800) {
	                x += velocidade;
	            }
	            break;
	    }
	}
	
	public void desenhar(Graphics g) {
		g.setColor (Color.RED);
		g.fillRect(x,y, tamanho, tamanho);
	}
}


