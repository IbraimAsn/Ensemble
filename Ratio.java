public class Ratio
{
    private int numera;
    private int denomi;

    public int getNumera()
    {
        return numera;
    }

    public int getDenomi()
    {
        return denomi;
    }

    public Ratio(int numera, int denomi)
    {
        this.numera = numera; 
        this.denomi = denomi;
    }

    public Ratio addition(Ratio a)
    {
       if(denomi == a.getDenomi())
       {
           return new Ratio(numera+a.getNumera(),denomi);
       }
       return new Ratio(numera+a.getNumera(),denomi*a.getDenomi());
    }

    public Ratio produit(Ratio a)
    {
       return new Ratio(numera*a.getNumera(),denomi*a.getDenomi());
    }

    public boolean egale(Ratio a)
    {
        if(numera == a.getNumera() && denomi == a.getDenomi())
        {
            return true;
        }
        return false;
    }

    public boolean plusGrand(Ratio a)
    {
        if((double)numera/denomi > (double)a.getNumera()/a.getDenomi())
        {
            return true;
        }
        return false;
    }

    public String toString() 
    {
        return numera+"/"+denomi;
    }
}