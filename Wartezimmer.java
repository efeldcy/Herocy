import greenfoot.*; 
public class Wartezimmer extends Actor
{
Held[] Schlange=new Held[21];int n;
public void anstellen(Held pH)
{
    if(n>19)
        System.out.println("Wartezimmer voll!");
    else
        Schlange[++n]=pH;
} // anstellen
public Held ersterRaus()
{
Held erster=Schlange[1];
for(int i=1;i<n;i++)
    Schlange[i]=Schlange[i+1];
n--;
return erster;
} // ersterRaus
public boolean nichtleer()
{
if(n>0)
    return true;
else
    return false;
} // nichtller
} // Wartezimmer;