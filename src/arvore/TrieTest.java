package arvore;

import util.Controlador;
import util.LeituraArquivo;

public class TrieTest {
    
	public static void main(String[] args) {
        
        // Input keys (use only 'a' through 'z' and lower case)
        
        LeituraArquivo dados = new LeituraArquivo("src\\entrada\\palavras.txt");
        LeituraArquivo comandos = new LeituraArquivo("src\\entrada\\comandos.txt");
        Controlador ctrl = new Controlador();

        System.out.println("Kaillane Corrêa Martins");
        System.out.println("----------Iniciando----------");
        System.out.println("");
        
        ctrl.adicionarDados(dados.lerTudo());
        
        Object comando[] = comandos.lerTudo();
        for (int i = 0; i < comando.length; i++) {
            ctrl.tratar(comando[i].toString());
        }
        
      }
}
