package ExemploSala1;

public class ExemploSala1 {

    private String nome;
    private  float nota1;
    private  float nota2;
    private  float nota3;

    public ExemploSala1(String nome, float nota1, float nota2, float nota3) {
        
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public float calcularMedia() {

        return (nota1 + nota2 + nota3) / 3;

    }



}
