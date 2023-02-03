import GLOOP.*;

class Minutenzeiger
{
    private GLZylinder minuten;
    double drehpunktZeigerMinuteX;
    double drehpunktZeigerMinuteY;
    Minutenzeiger(double pX,double pY,double Zeigeranpassung)
    {
        minuten= new GLZylinder(pX,pY+170/4,-10, 10,170/2);
        minuten.drehe(90,0,0);
        minuten.drehe(0,0,Zeigeranpassung,pX,pY,0);

        drehpunktZeigerMinuteX = pX;
        drehpunktZeigerMinuteY = pY;

    }


        public void minutendrehe(){
        minuten.drehe(0,0,-0.1,drehpunktZeigerMinuteX,drehpunktZeigerMinuteY,0);
    }

}
