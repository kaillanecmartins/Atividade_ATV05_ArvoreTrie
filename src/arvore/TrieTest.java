package arvore;

public class TrieTest {
    
	public static void main(String[] args) {
        
        // Input keys (use only 'a' through 'z' and lower case)
          String chaves[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        
          String mensagemDeSaida[] = {"Nao esta presente na trie", "Esta presente trie"};
        
          Trie trie = new Trie();
          
          for (int i = 0; i < chaves.length ; i++){
              trie.insert(chaves[i]);
          }    
        
          trie.remove("the");

          // -> Buscando por diferentes chaves
          if( trie.search("the") == true)
              System.out.println("the --- " + mensagemDeSaida[1]);
          else System.out.println("the --- " + mensagemDeSaida[0]);
           
          if( trie.search("any") == true)
              System.out.println("any --- " + mensagemDeSaida[1]);
          else System.out.println("any --- " + mensagemDeSaida[0]);
           
          if( trie.search("their") == true)
              System.out.println("their --- " + mensagemDeSaida[1]);
          else System.out.println("their --- " + mensagemDeSaida[0]);
           
          if( trie.search("by") == true)
              System.out.println("by --- " + mensagemDeSaida[1]);
          else System.out.println("by --- " + mensagemDeSaida[0]);

          if( trie.search("a") == true)
              System.out.println("a --- " + mensagemDeSaida[1]);
          else System.out.println("a --- " + mensagemDeSaida[0]);
  
      }
}
