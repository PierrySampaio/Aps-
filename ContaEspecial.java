public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
   
     //get e set
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "Conta Especial:";
        
        s += "; " + super.toString();
        s += " limite adicional: " + limite;
        return s;
    }
  
    
}
