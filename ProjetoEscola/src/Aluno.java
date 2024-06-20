public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private double valorPagar;

    Curso c1 = new Curso();

    public void pagarMensalidade() throws InterruptedException {
        double v = this.valorPagar - c1.getValMensalidade1();
        System.out.println("Pagando mensalidade ("+this.nome+")");
    Thread.sleep(2000);
        if (v == 0) {
            System.out.println("Mensalidade paga!");
        }else{
            System.out.println("Erro: Quantidade inválida!");
        }
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
