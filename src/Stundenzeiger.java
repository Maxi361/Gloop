import GLOOP.GLZylinder;

class Stundenzeiger
{
    double drehpunktZeigerX;
    double drehpunktZeigerY;
    private GLZylinder stunden;
    Stundenzeiger(double pX,double pY,double ZeigeranpassungStunden)
    {
        stunden= new GLZylinder(pX,pY+170/8,-5, 5,170/8);
        stunden.setzeFarbe(1,0,0);
        stunden.drehe(90,0,0);
        stunden.drehe(0,0,ZeigeranpassungStunden,pX,pY,0);

        drehpunktZeigerX = pX;
        drehpunktZeigerY = pY;


    }

    public void stundendrehe() {
        stunden.drehe(0,0, -0.05, drehpunktZeigerX,drehpunktZeigerY,0);
    }





}