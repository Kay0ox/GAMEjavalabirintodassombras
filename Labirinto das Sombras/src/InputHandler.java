import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

    private Player jogador;

    public InputHandler(Player jogador) {
        this.jogador = jogador;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();

        switch (tecla) {
            case KeyEvent.VK_W:
            case KeyEvent.VK_UP:
                jogador.mover("CIMA");
                break;
            case KeyEvent.VK_S:
            case KeyEvent.VK_DOWN:
                jogador.mover("BAIXO");
                break;
            case KeyEvent.VK_A:
            case KeyEvent.VK_LEFT:
                jogador.mover("ESQUERDA");
                break;
            case KeyEvent.VK_D:
            case KeyEvent.VK_RIGHT:
                jogador.mover("DIREITA"); 
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {} 

    @Override
    public void keyTyped(KeyEvent e) {} 
}
