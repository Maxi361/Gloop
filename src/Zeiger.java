import GLOOP.*;
public class Zeiger{   
    private GLZylinder sekunden,minuten,stunden; 

    public void weiter(double pX,double pY){
        sekunden= new GLZylinder(pX,pY,-10, 210,100);
    }

}
