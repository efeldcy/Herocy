import greenfoot.*;
public class Herocy extends World
{
String[][] Spielfeld=new String[16][11];
String[] Zeile=new String[11];
int anzahlHelden=3;
Held Held1,Held2,Held3;
Heiler H;Fee F;Markt M;Kiosk K;
public Herocy()
{    
super(20,12,40); // Spielfeld 20x10 Felder; Jedes Feld 40x40 Pixel
Zeile[1]= "XXXXXXXXXXXXXXX";
Zeile[2]= "XF          X X";
Zeile[3]= "X XX X    X XXX";
Zeile[4]= "X XX X    X   X";
Zeile[5]= "X XX  XMXXXKX X";
Zeile[6]= "X             X";
Zeile[7]= "X XXXX XXX XXXX";
Zeile[8]= "X X  X XXX X XX";
Zeile[9]= "X    H        X";
Zeile[10]="XXXXXXXXXXXXXXX";
for(int i=1;i<=10;i++)
{
    for(int a=0;a<15;a++)
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
} // Konstruktor
public void HeldenInitialisieren()
{
Held1=new Held(1,"Superwoman");
addObject(Held1,6,2);
Held2=new Held(2,"Flash");
addObject(Held2,8,2);
Held3=new Held(3,"Zeus");
addObject(Held3,7,4);
} // HeldenInitialisiere
} // class Herocy