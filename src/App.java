/**
 *
 * @author FranCILDO Alves
 * 
 */
public class App {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNunConta(111);
        p1.setDono("José");
        p1.abrirConta("CC");
        

        ContaBanco p2 = new ContaBanco();
        p2.setNunConta(222);
        p2.setDono("Maria");
        p2.abrirConta("CP");
        

        p1.depositar(100);
        p2.depositar(500);

        p1.sacar(150);
        p1.fecharConta();
        p2.sacar(1000);

        p1.extrato();
        p2.extrato();

    }
    
}


