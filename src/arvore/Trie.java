package arvore;

public class Trie {
    private TrieNode raiz;

    public Trie() {
        raiz = new TrieNode();
    }

    // Insere uma palavra na Trie
    public void insert(String palavra) {
        TrieNode atual = raiz;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            int index = c - 'a';
            if (atual.filho[index] == null) {
                atual.filho[index] = new TrieNode();
            }
            atual = atual.filho[index];
        }
        atual.isEndOfWord = true;
    }

    // Busca uma palavra na Trie
    public boolean search(String palavra) {
        TrieNode atual = raiz;
        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            int index = c - 'a';
            if (atual.filho[index] == null) {
                return false;
            }
            atual = atual.filho[index];
        }
        return atual != null && atual.isEndOfWord;
    }

    // Atualiza uma palavra na Trie
    public void update(String palavraAntiga, String palavraNova) {
        remove(palavraAntiga);
        insert(palavraNova);
    }

    // Remove uma palavra da Trie
    public void remove(String palavra) {
        remove(raiz, palavra, 0);
    }

    private boolean remove(TrieNode atual, String palavra, int index) {
        if (index == palavra.length()) {
            if (!atual.isEndOfWord) {
                return false;
            }
            atual.isEndOfWord = false;
            return atual.filho == null;
        }

        char c = palavra.charAt(index);
        int filhoIndex = c - 'a';
        TrieNode filho = atual.filho[filhoIndex];
        if (filho == null) {
            return false;
        }

        boolean podeRemoverFilho = remove(filho, palavra, index + 1);
        if (podeRemoverFilho) {
            atual.filho[filhoIndex] = null;
            return atual.filho == null && !atual.isEndOfWord;
        }

        return false;
    }

    // Exibe todas as palavras presentes na Trie
    public void display() {
        display(raiz, "", "");
    }

    private void display(TrieNode atual, String prefix, String palavra) {
        if (atual.isEndOfWord) {
            System.out.println(prefix + palavra);
        }

        for (int i = 0; i < atual.filho.length; i++) {
            TrieNode child = atual.filho[i];
            if (child != null) {
                char c = (char) ('a' + i);
                display(child, prefix + palavra, String.valueOf(c));
            }
        }
    }
}
