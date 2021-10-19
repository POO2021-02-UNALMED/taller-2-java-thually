package test;

public class Asiento {
    public String color;
    public int precio;
    public int registro;
    
    public void cambiarColor(String color){
        switch(color){
            case "rojo": break;
            case "verde": break;
            case "amarillo": break;
            case "negro": break;
            case "banco": break;
            default: return;
        }
        this.color = color;
    }
}
