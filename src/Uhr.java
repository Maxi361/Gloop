import GLOOP.*;
public class Uhr{
    private Ziffernblatt dasZiffernblatt;   
    private Sekundenzeiger sekunde;
    private Minutenzeiger minute;
    private Stundenzeiger stunde;
    private GLTafel tafel;

    //private Zeiger sekunden, minuten, stunden;
    //[...]

     Uhr(double pX, double pY,double Zeigeranpassung,String stadt){
        dasZiffernblatt = new Ziffernblatt(pX,pY);
        sekunde = new Sekundenzeiger(pX,pY,Zeigeranpassung);
        minute = new Minutenzeiger(pX,pY,Zeigeranpassung);
        stunde = new Stundenzeiger(pX,pY,Zeigeranpassung);
        tafel = new GLTafel(pX,pY+400,0,400,200);
        tafel.setzeText(stadt,100);
    }

    public void weiter(){
         minute.minutendrehe();
         sekunde.sekundendrehe();
         stunde.stundendrehe();
         
    }   
}
