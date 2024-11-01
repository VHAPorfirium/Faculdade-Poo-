package Exercicio8.Exercicio1C;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private Date data;
    private boolean isTerminada;
    private Date hora;
    private List<LinhaDetalheVenda> linhasDetalhe = new ArrayList<>();
    private Pagamento pagamento;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isTerminada() {
        return isTerminada;
    }

    public void setTerminada(boolean terminada) {
        isTerminada = terminada;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public List<LinhaDetalheVenda> getLinhasDetalhe() {
        return linhasDetalhe;
    }

    public void setLinhasDetalhe(List<LinhaDetalheVenda> linhasDetalhe) {
        this.linhasDetalhe = linhasDetalhe;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void termina() {
    }

    public void criaLinhaDetalhe() {
    }

    public void facaPagamento() {
    }

    public void total(){

    }
}
