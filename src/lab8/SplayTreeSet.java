package Lab8;
/*
	Sergio Cancinos, 	13062
	Angel Basegoda, 	13256
	Augusto Cardenas, 	13136

	Bibliografia
http://algs4.cs.princeton.edu/33balanced/RedBlackBST.java.html
*/
public class SplayTreeSet implements WordSet
{
	
	private SplayTree<Word> base;
	//Constructor
	public SplayTreeSet()
	{
		base = new SplayTree<Word>();
	}
	//Consigue un elemento del �rbol
	public Word get(Word Lord)
	{
		return base.get(Lord);
	}
	//Agrega un elemento al �rbol
	public void add(Word wordObject)
	{
		base.add(wordObject);
	}
}
