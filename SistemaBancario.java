public abstract class SistemaBancario {
    protected String titular;
    protected double saldo;
    protected double chequeEspecial;

    public SistemaBancario(String titular) {
        this.titular = titular;
        this.saldo = 0;
        this.chequeEspecial = 1000;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirDados() {
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
    }

    public abstract void calcularRendimento();
}

class ContaCorrente extends SistemaBancario {
    public ContaCorrente(String titular) {
        super(titular);
    }

    public void usarChequeEspecial() {
        if (this.saldo < 0) {
            this.saldo += this.chequeEspecial;
            System.out.println("Cheque especial utilizado!");
        } else {
            System.out.println("Não é necessário utilizar o cheque especial!");
        }
    }

    @Override
    public void calcularRendimento() {
        // Não há rendimento para conta corrente
    }
}

class ContaPoupanca extends SistemaBancario {
    private double taxaSelic;

    public ContaPoupanca(String titular, double taxaSelic) {
        super(titular);
        this.taxaSelic = taxaSelic;
    }

    @Override
    public void calcularRendimento() {
        if (this.taxaSelic > 8.5) {
            this.saldo += this.saldo * 0.005;
            System.out.println("Rendimento calculado com sucesso!");
        } else {
            this.saldo += this.saldo * (this.taxaSelic * 0.7 / 100);
            System.out.println("Rendimento calculado com sucesso!");
        }
    }
}