package br.com.dio.banco;

public class Main {

    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel de Almeida");

        Conta cc = new ContaCorrente(gabriel);
        Conta poupanca = new ContaPoupanca(gabriel);

        cc.depositar(1000);
        cc.transferir(375, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}

