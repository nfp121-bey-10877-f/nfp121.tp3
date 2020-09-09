package question3;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Stack;
import java.util.Arrays;

public class Pile2<T> implements PileI<T>{
    /** par délégation : utilisation de la class Stack */
    private Stack<T> stk;
    /** la capacité de la pile */
    private int capacite;

    /** Création d'une pile.
     * @param taille la "taille maximale" de la pile, doit être > 0
     */
    public Pile2(int taille){
        if(taille <=0)
            taille = PileI.CAPACITE_PAR_DEFAUT;
         this.capacite = taille;
         
         stk = new Stack<T>();
    }

    public Pile2(){
        this(0);
    }

    public void empiler(T o) throws PilePleineException{
        if(stk.size() >= this.capacite) throw new PilePleineException();
        else
         stk.push(o);
       
    }

    public T depiler() throws PileVideException{
        if(stk.isEmpty()) throw new PileVideException();
        else
        {
            T t =  stk.pop();
            return t;
        }
    }

    public T sommet() throws PileVideException{
        if(stk.isEmpty()) throw new PileVideException();
        return stk.peek();
    }
    
    public boolean estPleine()
    {
        return this.stk.size() >= this.capacite;
        
    }
    
    public boolean equals(Object o)
    {
          if (o == null)
			return false;
		if (o == this)
			return true;

		if (!(o instanceof Pile2))
			return false;

		Pile2 p = (Pile2) o;

		if (p.taille() != this.taille())
			return false;
		if (p.capacite() != this.capacite)
			return false;

		Object[] tab = p.stk.toArray();

		Object[] tab2 = this.stk.toArray();

		return Arrays.asList(tab).containsAll(Arrays.asList(tab2));
    }
    
    public boolean estVide()
    {
        return stk.isEmpty();
    }
    
    
    public int taille()
    {
        return stk.size();
    }
    
    public int capacite()
    {
        return this.capacite();
    }
    // recopier ici toutes les autres méthodes
    // qui ne sont pas modifiées en fonction
    // du type des éléments de la pile

} // Pile2