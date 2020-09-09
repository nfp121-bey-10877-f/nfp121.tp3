package question2;


import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;
import java.util.Arrays;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int capacite;

    public Pile3() {
        this(0);
    }

    public Pile3(int taille) {
        if(taille <=0) taille = PileI.CAPACITE_PAR_DEFAUT;
        
        capacite =  taille;
        
        v = new Vector();
        
    }

    public void empiler(Object o) throws PilePleineException {
        if(v.size() >= this.capacite) throw new PilePleineException();
        v.add(o);
    }

    public Object depiler() throws PileVideException {
        if(v.isEmpty()) throw new PileVideException();
        Object o = v.get(v.size()-1);
        v.remove(v.size()-1);
        return o;
    }

    public Object sommet() throws PileVideException {
        if(v.isEmpty()) throw new PileVideException();
        return v.get(v.size()-1);
    }

    public int taille() {
       return v.size();
    }

    public int capacite() {
        return this.capacite;
    }

    public boolean estVide() {
        return v.isEmpty();
    }

	public boolean estPleine() {
		return v.size() >= this.capacite;
	}

	public String toString() {
		String res = "[";
       for(int i = v.size()-1; i>=0; i--)
       {
           res+= v.get(i);
           
           if(i>0) res+=", ";
       }
        
        res += "]";
        
        return res;
	}

	public boolean equals(Object o) {
	 if (o == null)
			return false;
		if (o == this)
			return true;
		if (!(o instanceof Pile3))
			return false;

		Pile3 p = (Pile3) o;
		if (p.taille() != this.taille())
			return false;
		if (p.capacite() != this.capacite)
			return false;

		Object[] tab = p.v.toArray();
		Object[] tab2 = this.v.toArray();

		return Arrays.asList(tab).containsAll(Arrays.asList(tab2));
	}

	// fonction fournie
	public int hashCode() {
		return toString().hashCode();
	}

}
