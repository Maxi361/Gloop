import GLOOP.*;
public class Uhr{
    private Ziffernblatt dasZiffernblatt;   
    private Sekundenzeiger sekunde;
    private Minutenzeiger minute;
    private Stundenzeiger stunde;
    private GLTafel tafel;

    //private Zeiger sekunden, minuten, stunden;
    //[...]

     Uhr(double pX, double pY,double ZeigeranpassungStunden,double ZeigeranpassungMinuten,double ZeigeranpassungSekunden,String stadt){
        dasZiffernblatt = new Ziffernblatt(pX,pY);
        sekunde = new Sekundenzeiger(pX,pY,ZeigeranpassungSekunden);
        minute = new Minutenzeiger(pX,pY,ZeigeranpassungMinuten);
        stunde = new Stundenzeiger(pX,pY,ZeigeranpassungStunden);
        tafel = new GLTafel(pX,pY+400,0,400,200);
        tafel.setzeText(stadt,100);
    }

    public void weiter(){
         minute.minutendrehe();
         sekunde.sekundendrehe();
         stunde.stundendrehe();
         
    }   
}
