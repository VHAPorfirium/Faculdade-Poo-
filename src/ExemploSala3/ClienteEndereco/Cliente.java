package ExemploSala3.ClienteEndereco;

public class Cliente {
    private String nome;
    private String cpf;

    private EnderecoCliente end;

    public Cliente(String nome ) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarEndereco(EnderecoCliente end) {
        this.end = end;
    }

    @Override
    public String toString() {
        String retorno = "";

        if (end != null) {
            retorno = end.toString();
        } else {
            retorno = "Nenhum endereço cadastrado.";
        }

        return "Nome: " + this.nome + "\nCPF: " + getCpf() + "\nEndereço:\n" + retorno;
    }

}
