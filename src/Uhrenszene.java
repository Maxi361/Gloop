import GLOOP.*;
public class Uhrenszene{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;

    private Uhr uhr1, uhr2, uhr3, uhr4, uhr5, uhr6, uhr7;

    public void Uhrenszene(){
        kamera = new GLEntwicklerkamera();        
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        kamera.setzePosition(0,500,1300);
        kamera.setzeBlickpunkt(0,470,0);
      
        uhr1 = new Uhr(0, 0);
        uhr2 = new Uhr(470, 0);
        uhr3 = new Uhr(-470, 0);
        uhr4 = new Uhr(-470, 470);
        uhr5 = new Uhr(470, 470);
        uhr6 = new Uhr(0, 2*470);
        uhr7 = new Uhr(0, 470);
        
        
        while (!tastatur.esc()){
            uhr1.weiter(); 
            uhr2.weiter();    
            uhr3.weiter();    
            Sys.warte(100);
        }
        Sys.beenden();
    }
}
