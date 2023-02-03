import GLOOP.GLZylinder;

class Stundenzeiger
{
    private GLZylinder stunden;
    Stundenzeiger(double pX,double pY)
    {
        stunden= new GLZylinder(pX,pY+170/2,-10, 10,170);


        stunden.drehe(90,0,0);



    }

}