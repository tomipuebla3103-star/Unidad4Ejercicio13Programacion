public class SistemaMonitoreo {
    public void generarAlerta(AlertaClimatica alerta, double magnitudMedida) {

        alerta.emitirAdvertencia(magnitudMedida);

    }
}
