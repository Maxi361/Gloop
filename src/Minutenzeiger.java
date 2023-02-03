import GLOOP.*;

class Minutenzeiger
{
    private GLZylinder minuten;
    Minutenzeiger(double pX,double pY)
    {
        minuten= new GLZylinder(pX,pY+170/2,-10, 10,170);

    }


        public void Minutendrehe(){
        minuten.drehe(0,0,6);
    }

}
