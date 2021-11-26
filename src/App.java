/**
 *
 * @author FranCILDO Alves
 * 
 */
public class App {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.abrirConta("CP");
        cb1.depositar(1000);
        cb1.depositar(68);
        System.out.println(cb1.getSaldo());
        
        //cb1.fecharConta();

    }
    
}


