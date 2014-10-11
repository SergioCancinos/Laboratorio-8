package Lab8;
/*

Bibliograf�a:

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