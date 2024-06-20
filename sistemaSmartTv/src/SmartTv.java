public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 0;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        if (ligada == true){
            if (volume < 100 && volume >= 0){
                volume++;
            }else{
                volume = 100;
            }
        }else{
            System.out.println("A TV está desligada!");
        }
    }
    public void diminuirVolume(){
       if (ligada == true){
           if (volume <= 100 && volume > 0){
               volume--;
           }else{
               volume = 0;
           }
       }else {
           System.out.println("A TV está desligada!");
       }
    }

    public void escolherCanal(int novoCanal){
       if (ligada == true){
           if (novoCanal >= 1 && novoCanal <= 999){
               canal = novoCanal;
           }else{
               canal = 1;
           }
       }else {
           System.out.println("A TV está desligada!");
       }
    }
    public void avancarCanal(){
        if (ligada == true){
            if (canal >= 1 && canal < 999){
                canal++;
            }else {
                canal = 999;
            }
        }else {
            System.out.println("A TV está desligada!");
        }
    }
    public void diminuirCanal(){
        if (ligada == true){
            if (canal > 1 && canal <= 999){
                canal--;
            }else {
                canal = 1;
            }
        }else {
            System.out.println("A TV está desligada!");
        }
    }

}
