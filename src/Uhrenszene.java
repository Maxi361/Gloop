import GLOOP.*;

import java.util.Date;

public class Uhrenszene{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;

    private Uhr uhr1, uhr2, uhr3, uhr4, uhr5, uhr6, uhr7;
    private GLTafel tafelNewYork, tafelTokio, tafelBerlin;

    public void Uhrenszene(){
        int stunden = 0;
        int minuten = 0;
        int sekunden = 0;

        kamera = new GLEntwicklerkamera();        
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        kamera.setzePosition(0,500,1600);
        kamera.setzeBlickpunkt(0,470,0);
        Date d = new Date(System.currentTimeMillis());

        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());


        if (d.getHours()>12){
             stunden = d.getHours()-12;
        }
        else {
             stunden = d.getHours();
        }

        minuten = d.getMinutes();
        sekunden = d.getSeconds();

        //Berlin
        uhr1 = new Uhr(0, 0,-(stunden*30),-(minuten*6),-(sekunden*6),"Berlin");

        //Tokio
        uhr2 = new Uhr(470, 0,-(stunden*30+240),-(minuten*6),-(sekunden*6),"Tokio");

        //New York
        uhr3 = new Uhr(-470, 0,-(stunden*30-180),-(minuten*6),-(sekunden*6),"New York");



        uhr4 = new Uhr(-470, 800,-(stunden*30+60),-(minuten*6),-(sekunden*6),"Moskau");
        //uhr5 = new Uhr(470, 470);
        //uhr6 = new Uhr(0, 2*470);
        //uhr7 = new Uhr(0, 470);
        
        
        while (!tastatur.esc()){
            uhr1.weiter(); 
            uhr2.weiter();    
            uhr3.weiter();
            uhr4.weiter();
            Sys.warte(1000);
        }
        Sys.beenden();
    }
}
