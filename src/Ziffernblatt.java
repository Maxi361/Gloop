import GLOOP.*;
public class Ziffernblatt{
    private GLZylinder rueckwand,narbe;
    private GLTorus umrandung;
    private GLQuader[] aufteiler;

     Ziffernblatt(double pX, double pY){
        rueckwand = new GLZylinder(pX,pY,-5, 210,5);
        rueckwand.setzeFarbe(0.128,0.128,0.128);
        narbe = new GLZylinder (pX,pY,0,10,5);
        umrandung = new GLTorus (pX,pY,0,215,15);
        umrandung.setzeFarbe (0,0,0);


        aufteiler = new GLQuader [13];
        for (int i=0;i< 13;i++){
            aufteiler [i] = new GLQuader(0,0,0,20,40,20);
            aufteiler[i].verschiebe(pX,pY+180,0);
            aufteiler[i].rotiere(30*i,0,0,1,pX,pY,0);

        }
    }  

}
