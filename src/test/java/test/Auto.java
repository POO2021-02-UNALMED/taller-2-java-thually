package test;

import java.util.Arrays;

public class Auto {

    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public static int cantidadCreados;

    public int cantidadAsientos() {
        return (int) (asientos == null ? 0 : Arrays.stream(asientos).filter(e -> e != null).count());
    }

    public String verificarIntegridad() {
        String integridad = "Auto original";

        for (Asiento asiento : asientos) {
            if (asiento != null) {
                if (asiento.registro != registro) {
                    integridad = "Las piezas no son originales";
                    break;
                }
            }
        }

        if (motor.registro != registro) {
            integridad = "Las piezas no son originales";
        }
        
        return integridad;
    }
}
