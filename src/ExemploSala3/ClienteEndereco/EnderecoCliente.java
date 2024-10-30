package ExemploSala3.ClienteEndereco;

public class EnderecoCliente {
    public String Rua;
    public int Numero;
    public String bairro;
    public String complemento;
    public String cidade;
    public String estado;

    public EnderecoCliente() {

    }

    public EnderecoCliente(String rua, int numero, String bairro, String complemento, String cidade, String estado) {
        this.Rua = rua;
        this.Numero = numero;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return Rua;
    }
    public void setRua(String rua) {
        Rua = rua;
    }

    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Rua: " + getRua() + "\nNumero: " + getNumero() + "\nBairro: " + getBairro() + "\nComplemento: " + getComplemento() + "\nCidade: " + getCidade() + "\nEstado: " + getEstado();
    }
}
