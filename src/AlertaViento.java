public class AlertaViento extends AlertaClimatica{
    @Override
    public void emitirAdvertencia(double magnitudMedida) {

        if (magnitudMedida >= 90) {
            System.out.println("VIENTO ZONDA: Riesgo alto.");

        } else if (magnitudMedida >= 60) {
            System.out.println("VIENTO ZONDA: Riesgo moderado.");

        } else {
            System.out.println("VIENTO ZONDA: Riesgo bajo.");
        }
    }
}
