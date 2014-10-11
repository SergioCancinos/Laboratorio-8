package Lab8;
/*
	Sergio Cancinos, 	13062
	Angel Basegoda, 	13256
	Augusto Cardenas, 	13136

	Bibliografia
http://algs4.cs.princeton.edu/33balanced/RedBlackBST.java.html
*/
import java.util.HashMap;
class HashTreeSet implements WordSet{

    private HashMap<String,String> hash;
   
	// Crea el objeto Constructor
    public HashTreeSet(){
        hash = new HashMap();
    }
   
    @Override
	// Se encarga de agregar un dato a l Hash Tree
    public void add(Word wordObject) {
        hash.put(wordObject.getWord(),wordObject.getType());
    }

    @Override
	// Se encarga de obtener un dato del HashTree
    public Word get(Word word) {
        if(!hash.containsKey(word.getWord())){
            return null;
        }
        return new Word(word.getWord(),hash.get(word.getWord()));
    }
}

