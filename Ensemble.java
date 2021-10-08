import java.util.LinkedList;

/*
Il ne manque plus qu'à rajouter une méthode qui trouve la forme la plus simplifiée
d'un nombre rationnel, après quoi on appliquera cette méthode à tout entrée potentielle
afin de vérifier si elle y est déjà
*/

public class Ensemble
{
    private LinkedList<Ratio> llEnsemble;
    private int nbrElements;

    public Ensemble()
    {
        llEnsemble = new LinkedList<>();
        nbrElements = 0;
    }
    
    public boolean est_dans(Ratio a)
    {
        if(llEnsemble.contains(a))
        {
            return true;
        }
        return false;
    }

    public void ajoute(Ratio a)
    {
        if(!est_dans(a))
        {
            llEnsemble.add(a);
            nbrElements++;
        }
        else
        {
            System.out.printf("%s est deja present dans l'ensemble\n",a.toString());
        }
    }

    public void retire(Ratio a)
    {
        if(est_dans(a))
        {
            llEnsemble.remove(a);
            nbrElements--;
        }
        else
        {
            System.out.printf("%s n'est pas present dans l'ensemble\n",a.toString());
        }
    }

    public String toString()
    {
        if(nbrElements != 0)
        {
            StringBuilder str = new StringBuilder();
            for(int i = 0; i < llEnsemble.size(); i++)
            {
                if(i == 0)
                {
                    str.append("{");
                }
                str.append(llEnsemble.get(i));
                if(i == llEnsemble.size()- 1)
                {
                    str.append("}");
                }
                else
                {
                    str.append(",");
                }
            }
            return str.toString();
        }
        return "{}";
    }
}