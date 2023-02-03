import GLOOP.*;
public class Sekundenzeiger
{
    private GLZylinder sekunden;
     Sekundenzeiger(double pX,double pY)
    {
        sekunden= new GLZylinder(pX,pY+170/2,-10, 10,170);
        sekunden.drehe(90,0,0); 
        
        
       
    }
    public void Sekundendrehe(){sekunden.drehe(0,0,6);
    }
}
