import java.util.Scanner;
import java.util.Random;
public class ruleta {
    public static void main(String[] args) throws Exception {
        int vidap1 = 100;
        int vidap2 = 100;
        int cargada = 1; // 1= descarga 2=cargada
        int balas = 0;
        int turno = 1;  
        int elec = 0;
        int bal1 = 0;
        int bal2 = 0;
        int bal3 = 0;
        int bal4 =0;
        int bal5 =0;
        int bal6=0;
        int dur = 0;
        int energiap1 =0;
        int energiap2 =0;
        int cargas = 0;
        int COLDH1 = 3;
        int coldh1p1 = COLDH1;
        int coldh1p2 = COLDH1;
        int dañoescopeta = 20;
        int durh1p1 = 0;
        int durh1p2 = 0;
        int h1p1=0;
        int h1p2=0;
        int MANAH1 = 25;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        Random rand = new Random();
        

        System.out.println("Ruleta rusa alpha v0.4.3 Creado por CarlosHC");
        System.out.println("Escoja duracion de Partida. [1] partida corta (100 ps)/ [2] Partida Larga (200 ps)");
        dur = sc.nextInt();
        
        if(dur == 2){
            vidap1 = 200;
            vidap2 = 200;
        }
        while(vidap1 > 0 && vidap2 > 0){
//Sistema de recarga           
            
            balas = 1;
            bal1 = random.nextInt(2) + 1; // Genera un número entre 1 y 2
            bal2 = random.nextInt(2) + 1; // Genera un número entre 1 y 2
            bal3 = random.nextInt(2) + 1; // Genera un número entre 1 y 2
            bal4 = random.nextInt(2) + 1; // Genera un número entre 1 y 2
            bal5 = random.nextInt(2) + 1; // Genera un número entre 1 y 2
            bal6 = random.nextInt(2) + 1; // Genera un número entre 1 y 2
            balas = random.nextInt(5) + 2;
            
            if(balas == 6){
            cargas = (bal1-1+bal2-1+bal3-1+bal4-1 +bal5-1+bal6-1);
            }
            if(balas == 5){
                cargas = (bal1-1+bal2-1+bal3-1+bal4-1 +bal5-1);
                }
            if(balas == 4){
                cargas = (bal1-1+bal2-1+bal3-1+bal4-1);
                }
            if(balas == 3){
                cargas = (bal1-1+bal2-1+bal3-1);
               }
            if(balas == 2){
               cargas = (bal1-1+bal2-1);
            }
            System.out.print("----------->Hay " + balas);
            System.out.print( " balas, de las cuales " +cargas);
            System.out.println(" SON MORTALES <-------------"); 
            //Codigo para comprobacion del funcionamiento del juego(Comprobar las balas cargadas etc)
            //System.out.print("turno"+ turno );
            //System.out.print("eleccion" + elec );
            //System.out.print("vida" + vidap1);
            //System.out.print( "vida"+ vidap2);
            
            //System.out.print("" + bal1);
            //System.out.print(" " + bal2);
            //System.out.print(" " + bal3);
            //System.out.print(" " + bal4);
            //System.out.print(" " + bal5);
            //System.out.print(" " + bal6);
            //System.out.print(" " + cargada);

//Inicio de ronda
                
            while(true){    
            
                
                if(turno == 1){


                    if(vidap2 < 0){
                        System.out.println("Jugador 1 gana, final de partida");
                        break;
                    }
                    
                    if(vidap1 < 0){
                        System.out.println("Jugador 2 gana, final de partida");
                        break;
                    }
                    if(vidap2 == 0){
                        break;
                    }
            
                    if(vidap1 == 0){
                        break;
                    }
                    
                    if(balas == 0){
                        System.out.println("Cargador finalizado, cambiando cargador");
                        break;
                    }
                    if(balas == 1){
                        cargada = bal1;
                    }
                    if(balas == 2){
                        cargada = bal2;
                    }
                    if(balas == 3){
                        cargada = bal3;
                    }
                    if(balas == 4){
                        cargada = bal4;
                    }
                    
                    if(balas == 5){
                        cargada = bal5;
                    }

                    if(balas == 6){
                        cargada = bal6;
                    }
                    
                    System.out.println("Jugador 1 vida:" + vidap1);
                    System.out.println(" Energia:" + energiap1);
                    System.out.println("Jugador 2 vida:" + vidap2);
                    System.out.println(" Energia:" + energiap2);            
                    System.out.println("--->Turno del Jugador 1<--- :");
                    System.out.println("Arma:[1]Apuntar a tu cabeza.[2]Apuntar al rival (Consume accion).");
                    System.out.println("Habilidades:[3]MAS DAÑO (25 energia)- Enfriamiento:" +coldh1p1);  

                    elec = sc.nextInt();
                    if ( elec == 1) {
                        System.out.println("Apuntas a tu cabeza con la pistola y apretas el gatillo...");
                        energiap1 = (energiap1 + 10);//Regeneracion de energia por ronda
                        energiap2 = (energiap2 + 5);
                    
                        try {
                            // Espera 3000 milisegundos (3 segundos)
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if ( cargada == 2){
                            System.out.println(" ----------->LA BALA IMPACTA!!!, pierdes" +dañoescopeta);
                            vidap1 = (vidap1 - dañoescopeta);
                            turno = 1;
                            balas = (balas - 1);
                        }
                        if ( cargada == 1){
                            System.out.println(" ----------->TE HAS SALVADO!!! ");
                            turno = 1;
                            balas = (balas - 1);
                        }
                        if (coldh1p2 > 0) {
                            coldh1p2 = (coldh1p2 -1);    
                        }
                        if (coldh1p1 > 0) {
                            coldh1p1 = (coldh1p1 -1);    
                        }
            
            
                    }
                    if ( elec == 2) {
                        energiap1 = (energiap1 + 10);//Regeneracion de energia por ronda
                        energiap2 = (energiap2 + 5);
                    
                        System.out.println("Apuntas a tu oponente con la pistola y apretas el gatillo...");
                        try {
                            // Espera 3000 milisegundos (3 segundos)
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if ( cargada == 2){
                            System.out.println(" ----------->LA BALA IMPACTA!!!, pierde "+dañoescopeta);
                            vidap2 = (vidap2 - dañoescopeta);
                            turno = 2;
                            balas = (balas - 1);
                            
                        }
                        if ( cargada == 1){
                            System.out.println("-----------> TE HAS SALVADO!!! ");
                            turno = 2;
                            balas = (balas - 1);
            
                        }
                        if (coldh1p2 > 0) {
                            coldh1p2 = (coldh1p2 -1);    
                        }
                        if (coldh1p1 > 0) {
                            coldh1p1 = (coldh1p1 -1);    
                        }
                    }  
                    
                    if (elec == 3){
                        if(energiap1 >= MANAH1){
                            if(coldh1p1 == 0){
                                System.out.println("----------->Aumento del arma activo durante 3 turnos");
                                dañoescopeta = (dañoescopeta + 15);
                                energiap1 = (energiap1 - MANAH1);
                                h1p1=1;
                                durh1p1 = 2;
                                coldh1p1 = 4;
                            }else{
                                System.out.println("En enfriamiento, espere a que llegue a 0");
                            }
                        }else{
                            System.out.println("Energia insuficiente");
                        }
                    }

                }      
                if(turno == 2){ //turno j2
                
                    if(h1p1 == 1){

                        if (durh1p1 == 0 ) {
                            h1p1=0;
                            System.out.println("El aumento de daño ha finalizado");
                            dañoescopeta = (dañoescopeta - 15); 
                        }else{
                            durh1p1 = (durh1p1 - 1);
                        }
                    }
                    if(h1p2 == 1){

                        if (durh1p2 == 0 ) {
                            h1p2=0;
                            System.out.println("El aumento de daño ha finalizado");
                            dañoescopeta = (dañoescopeta - 15); 
                        }else{
                            durh1p2 = (durh1p2 - 1);
                        }
                    }


                    if(vidap2 < 0){
                        System.out.println("Jugador 1 gana, final de partida" );
                        break;
                    }
                    
                    if(vidap1 < 0){
                        System.out.println("Jugador 2 gana, final de partida");
                        break;
                    }
                    if(vidap2 == 0){
                        break;
                    }
            
                    if(vidap1 == 0){
                        break;
                    }
                    
                    if(balas == 0){
                        System.out.println("Cargador finalizado, cambiando cargador");
                        break;
                    }
                    if(balas == 1){
                        cargada = bal1;
                    }
                    if(balas == 2){
                        cargada = bal2;
                    }
                    if(balas == 3){
                        cargada = bal3;
                    }
                    if(balas == 4){
                        cargada = bal4;
                    }

                    if(balas == 5){
                        cargada = bal5;
                    }

                    if(balas == 6){
                        cargada = bal6;
                    }
                    System.out.println("Jugador 1 vida:" + vidap1);
                    System.out.println(" Energia:" + energiap1);
                    System.out.println("Jugador 2 vida:" + vidap2);
                    System.out.println(" Energia:" + energiap2);          
                    System.out.println("--->Turno del Jugador 2<---:");
                    System.out.println("Arma: [1]Apuntar a tu cabeza. [2]Apuntar al rival (Consume accion).");
                    System.out.println("Habilidades:[3] MAS DAÑO (25 energia)- Enfriamiento:" +coldh1p2);  
                    elec = sc.nextInt();
                    if ( elec == 1) {
                        energiap1 = (energiap1 + 5);//Regeneracion de energia por ronda
                        energiap2 = (energiap2 + 10);
                        System.out.println("Apuntas a tu cabeza con la pistola y apretas el gatillo...");
                        try {
                            // Espera 3000 milisegundos (3 segundos)
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if ( cargada == 2){
                            System.out.println(" -----------> LA BALA IMPACTA!!!, pierdes "+dañoescopeta);
                            vidap2 = (vidap2 - dañoescopeta);
                            turno = 2;
                            balas = (balas - 1);
                           
                        }
                        if ( cargada == 1){
                            System.out.println("-----------> TE HAS SALVADO!!! ");
                            turno = 2;
                            balas = (balas - 1);
                           
                        }
                        if (coldh1p2 > 0) {
                            coldh1p2 = (coldh1p2 -1);    
                        }
                        if (coldh1p1 > 0) {
                            coldh1p1 = (coldh1p1 -1);    
                        }
                    }
                    if ( elec == 2) {
                        energiap1 = (energiap1 + 5);//Regeneracion de energia por ronda
                        energiap2 = (energiap2 + 10);
                        System.out.println("Apuntas a tu oponente con la pistola y apretas el gatillo...");
                        try {
                            // Espera 3000 milisegundos (3 segundos)
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        if ( cargada == 2){
                            System.out.println("-----------> LA BALA IMPACTA!!!, pierdes " +dañoescopeta);
                            vidap1 = (vidap1 - dañoescopeta);
                            turno = 1;
                            balas = (balas - 1);
                        }
                        if ( cargada == 1){
                            System.out.println("-----------> TE HAS SALVADO!!! ");
                            turno = 1;
                            balas = (balas - 1);
                        }
                        if (coldh1p2 > 0) {
                            coldh1p2 = (coldh1p2 -1);    
                        }
                        if (coldh1p1 > 0) {
                            coldh1p1 = (coldh1p1 -1);    
                        }
                    }


                    if(elec == 3){
                    if(energiap2 >= MANAH1){
                        if(coldh1p2 == 0){
                            System.out.println("Aumento del arma activo durante 3 turnos");
                            dañoescopeta = (dañoescopeta + 15);
                            h1p2=1;
                            energiap2 = (energiap2 - MANAH1);
                            durh1p2 = 2;
                            coldh1p2 = 4;

                        }else{
                            System.out.println("En enfriamiento, espere a que llegue a 0");
                        }
                    }else{
                        System.out.println("Energia insuficiente");
                    }
                    }
                 }

                
                
            }

        
    
        }
        
        }
    }



        
        
    







    





       
        



    











