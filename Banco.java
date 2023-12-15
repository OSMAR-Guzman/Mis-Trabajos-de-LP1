/**
 * InnerBanco
 */

 public class Banco {
    private Cliente cliente1, cliente2, cliente3;
    //constructor
    public Banco () {
        cliente1 = new Cliente("Pablo");
        cliente2 = new Cliente("sofia");
        cliente3 = new Cliente("juan");
    }
    
    public void operar() {
        cliente1.depositar(50000);
        cliente2.depositar(150000);
        cliente3.depositar(250000);
        cliente3.extraer(100000);
    }
    public void mostartotales(){
        System.out.println("Total del cliente, "+cliente1.retornarnombre()+" = "+cliente1.retornarMonto());
                System.out.println("Total del cliente, "+cliente2.retornarnombre()+" = "+cliente2.retornarMonto());
                        System.out.println("Total del cliente, "+cliente3.retornarnombre()+" = "+cliente3.retornarMonto());
    }
    public void mostrartotalbanco(){
        int Total = cliente1.retornarMonto()+ cliente2.retornarMonto()+cliente3.retornarMonto();
        System.out.println("Total del Banco: " + Total);
    }
    public static void main(String[] args) {
        Banco banco = new Banco();
        banco.operar();
        banco.mostartotales();

    }
}
