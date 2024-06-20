public class Bolsista extends Aluno{
    private double bolsa = c1.valMensalidade1 - 200;
    private double valorPagarBolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada!");
    }

    @Override
    public void pagarMensalidade()throws InterruptedException {
        double v = this.valorPagarBolsa - bolsa;
        System.out.println("Pagando mensalidade ("+this.nome+")");
        Thread.sleep(2000);
        if (v == 0) {
            System.out.println("Mensalidade paga!");
        }else{
            System.out.println("Erro: Quantidade inválida!");
        }
    }

    public double getValorPagarBolsa() {
        return valorPagarBolsa;
    }

    public void setValorPagarBolsa(double valorPagarBolsa) {
        this.valorPagarBolsa = valorPagarBolsa;
    }


}
