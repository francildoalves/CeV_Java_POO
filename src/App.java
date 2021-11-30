import Aula06.ControleRemoto;

/**
 *
 * @author FranCILDO Alves
 * 
 */
public class App {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        ControleRemoto cr = new ControleRemoto();
        cr.ligar();
        cr.aumentarVolume();
        cr.abrirMenu();
        

    }
    
}


