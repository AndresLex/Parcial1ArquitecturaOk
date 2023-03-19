package Principal;

import java.util.ArrayList;

public class LineaTelefonica {
    private ArrayList<Integer> duracionLlamada;
    private double costoTotalLlamadas;

    public LineaTelefonica() {
        this.duracionLlamada = new ArrayList<>();
        this.costoTotalLlamadas = 0;
    }

    public void  registrarLlamada(int duracion, int precio) {
        this.duracionLlamada.add(duracion);
        this.costoTotalLlamadas += (duracion * precio);
    }

    public int calcularDuracionTotal() {
        int duracionTotal = 0;
        for (Integer duracion: duracionLlamada) {
            duracionTotal += duracion;
        }
        return  duracionTotal;
    }
    public String mostrarInformacion() {
        return "\tNúmero de llamadas realizadas: "+this.duracionLlamada.size()+"\n" +
               "\tDuración total de llamadas: "+this.calcularDuracionTotal()+" minutos\n" +
               "\tCosto total de las "+this.duracionLlamada.size()+" llamadas: "+Math.round(this.costoTotalLlamadas*100.0)/100.0+" pesos";
    }

    public static String mostrarConsolidado(LineaTelefonica local, LineaTelefonica distancia, LineaTelefonica celular) {
        double costoTotal = local.costoTotalLlamadas+distancia.costoTotalLlamadas+celular.costoTotalLlamadas;
        int llamadasRalizadas = local.duracionLlamada.size()+distancia.duracionLlamada.size()+celular.duracionLlamada.size();
        int duracionTotal = local.calcularDuracionTotal()+distancia.calcularDuracionTotal()+celular.calcularDuracionTotal();
        double costoPromedio = costoTotal/duracionTotal;

        return "\tCosto total de las tres líneas: "+costoTotal+" pesos\n"+
               "\tNúmero total de llamadas realizadas: "+llamadasRalizadas+"\n"+
               "\tDuración total de llamadas: "+duracionTotal+" minutos\n"+
               "\tCosto promedio por minuto: "+Math.round(costoPromedio*100.0)/100.0+" pesos\n"+
               "\tTotal de minutos: \n\t\tLocal: "+local.duracionLlamada.toString()+
               "\n\t\tLarga Distancia: "+distancia.duracionLlamada.toString()+
               "\n\t\tCelular: "+celular.duracionLlamada.toString();
    }

    public void reiniciar() {
        this.costoTotalLlamadas = 0;
        this.duracionLlamada.clear();
    }

}
