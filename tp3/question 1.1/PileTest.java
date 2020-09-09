package question1;

public class PileTest extends junit.framework.TestCase {
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test PileTest
     */
    public PileTest() {
        
        
        
    }

    /**
     * Met en place les engagements.
     * 
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
    }

    /**
     * Supprime les engagements
     * 
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libérez ici les ressources engagées par setUp()
    }

    /**
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test. Ces
     * méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>). Par convention, leurs noms devraient débuter par
     * "test". Vous pouvez ébaucher le corps grâce au menu contextuel
     * "Enregistrer une méthode de test".
     */
    
  

    public void testEncourageant(){
        assertTrue(true);
    }

    public void testPile() throws PilePleineException
    {
        Pile p1 = new Pile(2);
        assertTrue(p1.estVide());
        
        try
        {
            p1.depiler();
            fail();
        }catch(PileVideException e)
        {
            assertTrue( e instanceof PileVideException);
        }
        
        p1.empiler(1);
        p1.empiler(2);
        
        try
        {
            p1.empiler(3);
            fail();
        }
        catch(PilePleineException ee)
        {
            assertTrue (ee instanceof PilePleineException);
        }
        
        
        assertTrue(p1.estPleine());
        
        assertEquals("[2, 1]", p1.toString());
        
        
    }
}

