public class Main {
    public static void main(String[] args) {

        SmartTv smartTv1 = new SmartTv();

        smartTv1.ligar();

        smartTv1.aumentarVolume();
        smartTv1.aumentarVolume();
        smartTv1.diminuirVolume();

        smartTv1.avancarCanal();
        smartTv1.avancarCanal();
        smartTv1.diminuirCanal();

        smartTv1.escolherCanal(220);

        System.out.println("Status da TV: " + smartTv1.ligada);
        System.out.println("Canal Atual: " + smartTv1.canal);
        System.out.println("Volume Atual: " + smartTv1.volume);
    }
}