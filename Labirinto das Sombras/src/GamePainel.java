import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePainel extends JPanel implements ActionListener {

    private Player jogador;
    private Mapa mapa;
    private Timer timer;

    public GamePainel() {
        this.setSize(800, 600);
        this.setBackground(Color.BLACK);

        mapa = new Mapa("C:\\Users\\Kayo Victor\\eclipse-workspace\\Labirinto das Sombras\\src\\res\\mapas\\mapa.txt");
        jogador = new Player(100, 100); // depois vamos iniciar baseado no mapa

        this.setFocusable(true);
        this.addKeyListener(new InputHandler(jogador));

        timer = new Timer(20, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha mapa primeiro
        mapa.desenhar(g);

        // Depois o jogador
        jogador.desenhar(g);
    }

    
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}