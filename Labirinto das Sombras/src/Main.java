import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		//aqui eu uso o jframe para criar a janela incial do jogo
		JFrame janela =  new JFrame("Labirinto as Cegas");
		//tamanho da janela(depende do tamanho da tela fica ruim)
		janela.setSize(800, 600);
		//impede que a janela possa ser redimenionsionda (para fixar)
		janela.setResizable(false);
		// fecha o jogo quando a janela for fechada(bem util)
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// cria o painel de jogo e adiciona na janela
		GamePainel painel = new GamePainel();
		janela.add(painel);
		
		// torna a janela visivel para jogar
		janela.setVisible(true);
	}

}
