package arvore;

public class TrieNode {
    TrieNode[] filho;
    boolean isEndOfWord;

    public TrieNode() {
        filho = new TrieNode[26]; // Assumindo que só há letras minúsculas do 'a' ao 'z'
        isEndOfWord = false;
        
        for(int i = 0; i < filho.length; ++i){  // -> Setando para null
                filho[i] = null;
        }
    }

}