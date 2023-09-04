package br.newtonpaiva;

public class HomeScreen {
    public static void main(String[] args) {
        var c01 = new Conta(999);
        System.out.println(c01);
//      c01.setNumero(999);
        c01.depositar(100.90);

        var saldo = c01.sacar(10.90);

        System.out.println(
                String.format("O Saldo atual da conta %d é: %.2f", c01.getNumero(), saldo)
        );

        saldo = c01.depositar(50.00);

        System.out.println(
                String.format("O Saldo atual da conta %d é: %.2f", c01.getNumero(), saldo)
        );
    }
    
}
