import GLOOP.*;
public class Sekundenzeiger
{
    private GLZylinder sekunden;
    double drehpunktZeigerSekundeX;
    double drehpunktZeigerSekundeY;
     Sekundenzeiger(double pX,double pY,double ZeigeranpassungSekunden)
    {
        sekunden= new GLZylinder(pX,pY+170/2,-5, 3,170);
        sekunden.drehe(90,0,0);
        sekunden.drehe(0,0,ZeigeranpassungSekunden,pX,pY,0);

        drehpunktZeigerSekundeX = pX;
        drehpunktZeigerSekundeY = pY;
        
        
       
    }
    public void sekundendrehe(){
         sekunden.drehe(0,0,-6,drehpunktZeigerSekundeX,drehpunktZeigerSekundeY,0);
    }
}
