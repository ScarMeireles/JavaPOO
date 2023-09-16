package br.newtonpaiva;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Conta(){}

    public Conta(Integer numero){
        this.numero = numero;
        this.saldo = 100.00;
    }

    public Double sacar(Double valor) {
        return saldo -= valor;
    }

    public Double depositar(Double valor) {
        return saldo += valor;
    }




    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}
