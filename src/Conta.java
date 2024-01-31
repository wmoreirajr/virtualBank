public class Conta {
    String name = "William Bernardo";
    String tipoConta = "Corrente";
    double saldo = 2500;

    public double getConsultarSaldo(){
        return this.saldo;
    }

    public void setReceberValor(double valor){
        this.saldo+=valor;
    }

    public boolean setTransferirValor(double valor){
        if(this.saldo>=valor){
            this.saldo -=valor;
            return true;
        } else {
            return false;
        }
    }


}
