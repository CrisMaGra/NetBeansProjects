
package area;

public class Rectangulo {
    private int base, altura, area;
    
    public Rectangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public void CalcularArea(){
        area = base * altura;
    }
    
    public void Imprimir(){
        CalcularArea();
        System.out.println("El area es : " + area);
    }
}
