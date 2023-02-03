import GLOOP.*;
public class Uhr{
    private Ziffernblatt dasZiffernblatt;   
    private Sekundenzeiger sekunde;
    private Minutenzeiger minute;
    private Stundenzeiger stunde;
    //private Zeiger sekunden, minuten, stunden;
    //[...]

     Uhr(double pX, double pY){
        dasZiffernblatt = new Ziffernblatt(pX,pY);         
        sekunde = new Sekundenzeiger(pX,pY);
        minute = new Minutenzeiger(pX,pY);
        stunde = new Stundenzeiger(pX,pY);
    }

    public void weiter(){
         minute.Minutendrehe;
         
    }   
}
