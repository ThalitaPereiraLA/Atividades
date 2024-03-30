package br.com.caelum.contas.main.modelos;

public class ContaPoupança extends Conta{

    public String getTipo(){
        return super.getTipo() + " Poupança";
    }
}