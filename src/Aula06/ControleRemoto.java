package Aula06;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    //Métodos (Get & Ser)
    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return this.tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Sobrescrevendo Métodos
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("========= MENU =========");
        //Ligado
        try {
            String status = "";
            if (this.isLigado()) {
                status = "Ligado";
            } else {
                status = "Desligado";
            }
            System.out.println("STATUS ........: " + status);
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

        //Tocando
        try {
            String tocando = "";
            if (this.isTocando()) {
                tocando = "Sim";
            } else {
                tocando = "Não";
            }
            System.out.println("ESTÁ TOCANDO ..: " + tocando);
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
        
        //Volume
        try {
            System.out.print("VOLUME ........: " + getVolume());
            for (int j = 0; j <= this.getVolume(); j+=5) {
                System.out.println("|");
            }
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu Fechado");
    }
    
    @Override
    public void aumentarVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void diminuirVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }        
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }
    
}
