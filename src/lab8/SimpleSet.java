package Lab8;
/*
	Sergio Cancinos, 	13062
	Angel Basegoda, 	13256
	Augusto Cardenas, 	13136

	Bibliografia
http://algs4.cs.princeton.edu/33balanced/RedBlackBST.java.html
*/
import java.util.ArrayList;

class SimpleSet implements WordSet
{
	private ArrayList<Word> base;
	
	public SimpleSet()
	{
		base = new ArrayList<Word>();
	}
	
	public Word get(Word word)
	{
		int index = base.indexOf(word);
		if(index == -1) return null;
		return base.get(index);
	}
	
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}
