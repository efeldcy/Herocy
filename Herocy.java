import greenfoot.*;

public class Herocy extends World
{
String[][] Spielfeld=new String[21][11];
String[] Zeile=new String[11];
int anzahlHelden=3;
Held Held1,Held2,Held3;
Heiler H;Fee F;Markt M;Kiosk K;
public Herocy()
{
super(20,11,40); // Spielfeld 20x10 Felder; Jedes Feld 40x40 Pixel
Zeile[1]= "                   F";
Zeile[2]= "                    ";
Zeile[3]= "XXXXXXXXXXXXXXX  XXX";
Zeile[4]= "                    ";
Zeile[5]= "                    ";
Zeile[6]= "                    ";
Zeile[7]= "                 H M";
Zeile[8]= "             XXXXXXX";
Zeile[9]= "          XXXXXXXXXX";
Zeile[10]="XXXXXXXXXXXXXXXXXXXX";

for(int i=1;i<=10;i++)
{
    for(int a=0;a<20;a++)
    {
        String Symbol=Zeile[i].substring(a,a+1);
        Spielfeld[a+1][i]=Symbol;
        if(Symbol.equals("X"))
        {
            Hindernis H=new Hindernis();
            addObject(H,a,i);
        } // if
        if(Symbol.equals("F"))
        {
            F=new Fee();
            addObject(F,a,i);
        } // if
        if(Symbol.equals("M"))
        {
            M=new Markt();
            addObject(M,a,i);
        } // if
        if(Symbol.equals("H"))
        {
            H=new Heiler();
            addObject(H,a,i);
        } // if
        if(Zeile[i].substring(a,a+1).equals("K"))
        {
            K=new Kiosk();
            addObject(K,a,i);
        } // if
    } // for a
} // for i
HeldenInitialisieren();
//Greenfoot.playSound("music.wav");
super.setBackground("background.png");

} // Konstruktor
public void HeldenInitialisieren()
{
Held1=new Held(1,"Herocy");
addObject(Held1,3,9);
Held2=new Held(2,"cyGuy");
addObject(Held2,1,9);
} // HeldenInitialisiere

} // class Herocy
