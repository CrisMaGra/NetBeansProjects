package lavadora;

public class Lavadora {

    private int kilos = 0, llenadoCompleto = 0, tipoRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;

    public Lavadora(int kilos, int tipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = tipoRopa;
    }

    private void Llenado() {
        if (kilos <= 12) {
            llenadoCompleto = 1;
            System.out.println("LLenando...");
            System.out.println("LLenado completo.");
        } else {
            System.out.println("La carga de ropa es muy pesada, reduja la carga.");
        }
    }

    private void Lavado() {
        Llenado();
        if (llenadoCompleto == 1) {
            if (tipoRopa == 1) {
                System.out.println("Ropa blanca / Lavado suave.");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else if (tipoRopa == 2) {
                System.out.println("Ropa color / Lavado intenso.");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            } else {
                System.out.println("El tipo de ropa no esta disponible.");
                System.out.println("Se lavara como ropa de color / Lavado intenso.");
                lavadoCompleto = 1;
            }
        }
    }
    private void Secado(){
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }
    public void CicloFinalizado(){
        Secado();
        if(secadoCompleto == 1){
            System.out.println("Tu ropa está lista...");
        }
    }
    
    public int getTipoRopa(){
        return tipoRopa;
    }
    public void setTipoRopa(int tipoRopa){
        this.tipoRopa = tipoRopa;
    }
    
}
