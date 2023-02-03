import GLOOP.*;
public class Sekundenzeiger
{
    private GLZylinder sekunden;
    double drehpunktZeigerSekundeX;
    double drehpunktZeigerSekundeY;
     Sekundenzeiger(double pX,double pY,double Zeigeranpassung)
    {
        sekunden= new GLZylinder(pX,pY+170/2,-10, 10,170);
        sekunden.drehe(90,0,0);
        sekunden.drehe(0,0,Zeigeranpassung,pX,pY,0);

        drehpunktZeigerSekundeX = pX;
        drehpunktZeigerSekundeY = pY;
        
        
       
    }
    public void sekundendrehe(){
         sekunden.drehe(0,0,-6,drehpunktZeigerSekundeX,drehpunktZeigerSekundeY,0);
    }
}
