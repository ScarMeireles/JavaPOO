package br.newtonpaiva;

import java.util.Objects;

public class ContaEspecial extends Conta {
private Double limite;

    @Override
    public Double sacar(Double valor) {

        if(getSaldo() - valor < -limite){
            //Retornar erro
            throw new IllegalArgumentException();
        }
        else {
            setSaldo(getSaldo() - limite);
            return getSaldo();
        }
        return super.sacar(valor);
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContaEspecial that)) return false;
        return Objects.equals(limite, that.limite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limite);
    }

    @Override
    public String toString() {
        return "ContaEspecial{" +
                "limite=" + limite +
                '}';
    }
}
