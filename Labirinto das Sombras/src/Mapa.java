import java.awt.Graphics;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mapa {
    private int[][] blocos;
    private final int tamanhoBloco = 40;

    public Mapa(String caminhoArquivo) {
        blocos = new int[20][15]; // tamanho fixo por agora

        try {
            BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo));
            String linha;
            int linhaIndex = 0;

            while ((linha = br.readLine()) != null) {
                for (int colunaIndex = 0; colunaIndex < linha.length(); colunaIndex++) {
                    blocos[colunaIndex][linhaIndex] = Character.getNumericValue(linha.charAt(colunaIndex));
                }
                linhaIndex++;
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Erro ao carregar o mapa: " + caminhoArquivo);
            e.printStackTrace();
        }
    }

    public void desenhar(Graphics g) {
        for (int x = 0; x < blocos.length; x++) {
            for (int y = 0; y < blocos[x].length; y++) {
                if (blocos[x][y] == 1) {
                    g.setColor(Color.GRAY);
                    g.fillRect(x * tamanhoBloco, y * tamanhoBloco, tamanhoBloco, tamanhoBloco);
                }
            }
        }
    }

    public int[][] getBlocos() {
        return blocos;
    }

    public int getTamanhoBloco() {
        return tamanhoBloco;
    }
}
