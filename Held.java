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

public void act(){
  KeyListener();
}

public void KeyListener(){
    if(Greenfoot.isKeyDown("a")){
        Greenfoot.delay(2); //Zwei Zeiteinheiten delay

      //Movement LINKS
      if(!HC.Spielfeld[getX()][getY()].equals("X")){
        move(-1);
      }
      //Movement LINKS RUNTER
      if(!HC.Spielfeld[getX()+1][getY()+1].equals("X") && !HC.Spielfeld[getX()+1][getY()+1].equals("L")){
        setLocation(getX(), getY()+1);
      }
    }

    if(Greenfoot.isKeyDown("d")){
        Greenfoot.delay(2); //Zwei Zeiteinheiten delay

      //Movement RECHTS
      if(!HC.Spielfeld[getX()+2][getY()].equals("X")){
        move(1);
      }
      //Movement RECHTS RUNTER
      if(!HC.Spielfeld[getX()+1][getY()+1].equals("X") && !HC.Spielfeld[getX()+1][getY()+1].equals("L")){
        setLocation(getX(), getY()+1);
      }
    }

    if(Greenfoot.isKeyDown("space")){
        Greenfoot.delay(2); //Zwei Zeiteinheiten delay

      //Movement SPRUNG RECHTS
      if(HC.Spielfeld[getX()+2][getY()].equals("X")){
        setLocation(getX()+1, getY()-1);
      }
      //Movement SPRUNG LINKS
      if(HC.Spielfeld[getX()][getY()].equals("X")){
        setLocation(getX()-1, getY()-1);
      }
    }

    if(Greenfoot.isKeyDown("shift")){
        Greenfoot.delay(2); //Zwei Zeiteinheiten delay

      //Movement HOCH KLETTERN
      if(HC.Spielfeld[getX()+1][getY()].equals("L")){
        setLocation(getX(), getY()-1);
      }
    }

    if(Greenfoot.isKeyDown("control")){
        Greenfoot.delay(2); //Zwei Zeiteinheiten delay

      //Movement RUNTER KLETTERN
      if(HC.Spielfeld[getX()+1][getY()+1].equals("L")){
        setLocation(getX(), getY()+1);
      }
    }
  }

public void addedToWorld(World pW)
{
HC=(Herocy) pW;
} // addedToWorld

} // class Held
