/**
 *
 * @author FranCILDO Alves
 * 
 */
public class App {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco();
        cb1.abrirConta("CC");
        System.out.println(cb1.getSaldo());
        cb1.fecharConta();

    }
    
}


