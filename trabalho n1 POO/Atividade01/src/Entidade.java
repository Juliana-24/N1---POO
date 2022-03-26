public class Entidade {
    
    String nome;
    String idade;
    String cpf;
    String endereco;

    String dados() {
        return nome + idade + cpf + endereco;
    }
    
}