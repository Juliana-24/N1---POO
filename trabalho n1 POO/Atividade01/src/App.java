public class App {
    public static void main(String[] args) throws Exception {

        MeuTenis calcado = new MeuTenis();

        System.out.println("A cor do meu tênis é " + calcado.cor + ", a marca do meu tênis é " + calcado.marca + ", o preço do meu tênis é " + calcado.preco + ", o tamanho do meu tênis é " + calcado.tamanho );
        
        calcado.comprar();
        calcado.troca();
        calcado.devolver();

        Entidade cliente = new Entidade();

        cliente.nome = "Cliente: Juliana, ";
        cliente.idade = "Idade: 20 anos, ";
        cliente.cpf = "CPF: 061.610.201-14, ";
        cliente.endereco = "Endereço: sinop-mt ";

        System.out.println(cliente.dados());

        Loja rev = new Loja();

        rev.nome = "Lojas Maranata, ";
        rev.endereco = "Local: Rio de Janeiro, ";
        rev.vendedor = "Vendedor: Mateus ";
        rev.cnpj = "CNPJ: 18.123.123/00001-96, ";
         
        System.out.println(rev.dadosloj());


        Caixa rec = new Caixa();

        rec.devpgto = "Devolução de pagamento efetuada! -  ";
        rec.banco = "Banco: Banco do Brasil - ";
        rec.conta = "Conta: C/ Corrente - ";
        rec.bandeira ="Bandeira: Visa  ";

        System.out.println(rec.recibo());

        
    }
}
