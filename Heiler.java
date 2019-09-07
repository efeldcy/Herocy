import greenfoot.*;
public class Heiler extends Actor
{
Wartezimmer Warteraum=new Wartezimmer(); 
public void insWartezimmer(Held pHeld)
{
System.out.println(pHeld);
Warteraum.anstellen(pHeld);
} // insWartezimmer
public void heilen()
{
if(Warteraum.nichtleer())
{
    Held H=Warteraum.ersterRaus();
    H.Lebenspunkte+=10;
    H.Energie+=5;
} // if
else
    System.out.println("Kein Patient mehr da!");
} // raus
} // class Heiler 