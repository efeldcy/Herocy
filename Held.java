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
        KeyListener(true);
}

public void KeyListener(boolean debug){

        if(debug) {
                System.out.println("X: "+getX()+" | Y: "+getY());
        }


        if(Greenfoot.isKeyDown("a") && !isAtEdge("left") && !isOnLadder()) {
                Greenfoot.delay(2); //Zwei Zeiteinheiten delay

                //Movement LINKS
                if(!HC.Spielfeld[getX()][getY()].equals("X")) {
                        move(-1);
                }
                //Movement LINKS RUNTER
                if(!HC.Spielfeld[getX()+1][getY()+1].equals("X") && !HC.Spielfeld[getX()+1][getY()+1].equals("L")) {
                        setLocation(getX(), getY()+1);
                }
        }

        if(Greenfoot.isKeyDown("d") && !isAtEdge("right") && !isOnLadder()) {
                Greenfoot.delay(2); //Zwei Zeiteinheiten delay

                //Movement RECHTS
                if(!HC.Spielfeld[getX()+2][getY()].equals("X")) {
                        move(1);
                }
                //Movement RECHTS RUNTER
                if(!HC.Spielfeld[getX()+1][getY()+1].equals("X") && !HC.Spielfeld[getX()+1][getY()+1].equals("L")) {
                        setLocation(getX(), getY()+1);
                }
        }

        if(Greenfoot.isKeyDown("space") && !isAtEdge("any")) {
                Greenfoot.delay(2); //Zwei Zeiteinheiten delay

                //Movement SPRUNG RECHTS
                if(HC.Spielfeld[getX()+2][getY()].equals("X")) {
                        setLocation(getX()+1, getY()-1);
                }
                //Movement SPRUNG LINKS
                if(HC.Spielfeld[getX()][getY()].equals("X")) {
                        setLocation(getX()-1, getY()-1);
                }
        }

        if(Greenfoot.isKeyDown("shift")) {
                Greenfoot.delay(2); //Zwei Zeiteinheiten delay

                //Movement HOCH KLETTERN
                if(HC.Spielfeld[getX()+1][getY()].equals("L")) {
                        setLocation(getX(), getY()-1);
                }
        }

        if(Greenfoot.isKeyDown("control")) {
                Greenfoot.delay(2); //Zwei Zeiteinheiten delay

                //Movement RUNTER KLETTERN
                if(HC.Spielfeld[getX()+1][getY()+1].equals("L")) {
                        setLocation(getX(), getY()+1);
                }
        }
}

public boolean isOnLadder(){
        if(getX() == 16 && getY() < 7 && getY() > 2) {
                return true;
        }
        else{
                return false;
        }
}

public boolean isAtEdge(String location){
        switch(location) {
        case "right":
                if(getX() == 19) {
                        return true;
                }
                break;

        case "left":
                if(getX() == 0) {
                        return true;
                }
                break;

        case "any":
                if(getX() == 19) {
                        return true;
                }
                if(getX() == 0) {
                        return true;
                }
                break;

        }
        return false;
}

public void addedToWorld(World pW)
{
        HC=(Herocy) pW;
} // addedToWorld

} // class Held
