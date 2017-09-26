package Curva;

import java.util.ArrayList;
import Vetor.Vet2;


public class Curva2D {

    public Vet2 P0, P1, P2, P3;
    
    ArrayList<Vet2> lista = new ArrayList<>();
    
    public Curva2D(Vet2 P0, Vet2 P1, Vet2 P2, Vet2 P3) {
        this.P0 = P0;
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
    }
    
    public void construirCurva(int qtdSegmentos){
        float var_t = 1/qtdSegmentos;
        for (float t = 0; t <= 1; t = t + var_t) {
            Vet2 ponto = new Vet2();
            ponto.x = (float) ((float)(Math.pow(1 - t, 3)) * P0.x + (((3 * Math.pow(1 - t, 2)) * t) * P1.x) + (3 * (1 - t) * (Math.pow(t, 2) * P2.x)) + (Math.pow(t, 3) * P3.x));
            ponto.y = (float) ((float)(Math.pow(1 - t, 3)) * P0.y + (((3 * Math.pow(1 - t, 2)) * t) * P1.y) + (3 * (1 - t) * (Math.pow(t, 2) * P2.y)) + (Math.pow(t, 3) * P3.y));
        }
    }
    
    public ArrayList<Vet2> getPontos(){
        return lista;
    }
}
