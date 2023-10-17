
package fatec.poo.model;

/**
 *
 * @author euuuuuuuuuu
 */
public class Pessoa {
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }
    
    public String getDataNascimento() {
        return dataNascimento;
    }

}

