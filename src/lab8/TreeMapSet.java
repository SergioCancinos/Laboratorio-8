package Lab8;
/*

Bibliograf�a: 
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

