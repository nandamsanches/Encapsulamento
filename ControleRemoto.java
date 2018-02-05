package encapsulamento;

public class ControleRemoto implements Controlador {
    //Atributos
    private int volume;
    private boolean ligando;
    private boolean tocando;
    //Métodos Especiais
    //construtor
    public ControleRemoto(){
        this.volume = 50;
        this.ligando = false;
        this.tocando = false;
        
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigando() {
        return ligando;
    }

    public void setLigando(boolean ligando) {
        this.ligando = ligando;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    //Métodos Abstratos
    //aqui vai implementar, no outro nao precisa (previsto, mas não implementado)

    @Override
    public void ligar() {
        this.setLigando(true);
    }

    @Override
    public void desligar() {
        this.setLigando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?"+this.getLigando());
        System.out.println("Está tocando?"+this.getTocando());
        System.out.println("Volume: " +this.getVolume());
        for (int i = 0; i<=this.getVolume(); i+=10){
            System.out.println("[]");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void play() {
        if (this.getLigando() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    //sobreescrever
    public void pause() {
        if (this.getLigando() && this.getTocando()){
            this.setTocando (false);
        }
    }
    
    
    
}
