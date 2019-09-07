import greenfoot.*;
public class Held extends Actor
{
// Attribute
int Spielernummer;
String Name;
int Lebenspunkte;
int Energie;
int Geld;
Waffe meineWaffe;
Herocy HC;
// Konstruktor
public Held(int pSpielernummer,String pName)
{
Spielernummer=pSpielernummer;
Name=pName;
//HC=pHC;
setImage("Held"+Spielernummer+".png"); // Für jeden Helden ein eignes Bild!
                                        // z.B. 'Held3.png' für den 3. Helden    
} // Konstuktor
public void addedToWorld(World pW)
{
HC=(Herocy) pW;
} // addedToWorld
public void geheNachOsten()
{
System.out.println(HC.Spielfeld[getX()][getY()]);
if(!HC.Spielfeld[getX()+2][getY()].equals("X"))
{
    setRotation(0);
    move(1);
} // if

} // geheNachOsten
} // class Held 