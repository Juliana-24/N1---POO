public class Caixa {

    String devpgto;
    String banco;
    String conta;
    String bandeira;

    String recibo() {
        return devpgto + banco + conta + bandeira;
    }
    
}
