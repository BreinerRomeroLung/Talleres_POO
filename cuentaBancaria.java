public class cuentaBancaria {
    int NumeroCuenta;
    int Saldo;
    String TipoCuenta;

    public cuentaBancaria(){
        NumeroCuenta = 23232;
        Saldo =0;
        TipoCuenta="Desconocido";

    }
    public cuentaBancaria(int NumeroCuenta,String TipoCuenta){
        this.NumeroCuenta=NumeroCuenta;
        this.TipoCuenta=TipoCuenta;

    }
    public cuentaBancaria(int NumeroCuenta,int Saldo,String TipoCuenta){
        this.NumeroCuenta=NumeroCuenta;
        this.Saldo=Saldo;
        this.TipoCuenta=TipoCuenta;
    }
}
