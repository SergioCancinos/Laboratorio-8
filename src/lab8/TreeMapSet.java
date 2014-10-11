package Lab8;
/*
	Sergio Cancinos, 	13062
	Angel Basegoda, 	13256
	Augusto Cardenas, 	13136

	Bibliografia
http://algs4.cs.princeton.edu/33balanced/RedBlackBST.java.html
*/
import java.util.TreeMap;

public class TreeMapSet implements WordSet{

    private TreeMap<String,String> rbTree;
   //Constructor
    public TreeMapSet(){
        rbTree = new TreeMap();
    }
   // Agrega un elemento al �rbol
    @Override
    public void add(Word wordObject) {
        rbTree.put(wordObject.getWord(),wordObject.getType());
    }
	//Consigue un elemento del �rbol
    @Override
    @SuppressWarnings("element-type-mismatch")
    public Word get(Word word) {
        if(!rbTree.containsKey(word.getWord())){
            return null;
        }
        return new Word(rbTree.ceilingKey(word.getWord()),rbTree.get(rbTree.ceilingKey(word.getWord())));
    }

}

