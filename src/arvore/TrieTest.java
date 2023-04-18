package arvore;

public class TrieTest {
    
	public static void main(String[] args) {
        
        // Input keys (use only 'a' through 'z' and lower case)
          String chaves[] = {"The", "a", "there", "answer", "any", "by", "bye", "their"};
        
          String mensagemDeSaida[] = {"Nao esta presente na trie", "Esta presente trie"};
        
          Trie trie = new Trie();
          
          for (int i = 0; i < chaves.length ; i++){
              trie.insere(chaves[i]);
          }    
        
          trie.remove("the");

          // -> Buscando por diferentes chaves
          if( trie.busca("the") == true)
              System.out.println("the --- " + mensagemDeSaida[1]);
          else System.out.println("the --- " + mensagemDeSaida[0]);
           
          if( trie.busca("any") == true)
              System.out.println("these --- " + mensagemDeSaida[1]);
          else System.out.println("these --- " + mensagemDeSaida[0]);
           
          if( trie.busca("their") == true)
              System.out.println("their --- " + mensagemDeSaida[1]);
          else System.out.println("their --- " + mensagemDeSaida[0]);
           
          if( trie.busca("thaw") == true)
              System.out.println("thaw --- " + mensagemDeSaida[1]);
          else System.out.println("thaw --- " + mensagemDeSaida[0]);

          if( trie.busca("a") == true)
              System.out.println("a --- " + mensagemDeSaida[1]);
          else System.out.println("a --- " + mensagemDeSaida[0]);
  
      }
}
