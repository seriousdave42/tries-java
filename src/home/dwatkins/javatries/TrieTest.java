package home.dwatkins.javatries;

public class TrieTest {

	public static void main(String[] args) {
		Trie trie = new Trie();
		
		trie.insertWord("car");
		trie.insertWord("cart");
		trie.insertWord("carry");
		trie.insertWord("cad");
		trie.insertWord("hat");
		trie.insertWord("hate");
		trie.insertWord("haberdashery");
		trie.insertWord("hater");
		trie.insertWord("sizzle");
		
//		System.out.println(trie.isWordValid("sizzle"));
//		System.out.println(trie.isWordValid("sizzler"));
//		System.out.println(trie.isWordValid("hater"));
//		
//		System.out.println(trie.isPrefixValid("so"));
//		System.out.println(trie.isPrefixValid("ca"));
		
		trie.printAllKeys();
	}

}
