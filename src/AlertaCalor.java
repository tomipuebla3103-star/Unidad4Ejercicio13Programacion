public class AlertaCalor extends AlertaClimatica{

    @Override
    public void emitirAdvertencia(double magnitudMedida) {

        if (magnitudMedida >= 40) {
            System.out.println("CALOR: Riesgo alto por temperaturas extremas.");

        } else if (magnitudMedida >= 35) {
            System.out.println("CALOR: Riesgo moderado.");

        } else {
            System.out.println("CALOR: Riesgo bajo.");
        }
    }
}
