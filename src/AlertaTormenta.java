public class AlertaTormenta extends AlertaClimatica{
    @Override
    public void emitirAdvertencia(double magnitudMedida) {

        if (magnitudMedida >= 80) {
            System.out.println("TORNENTA: Riesgo alto de tormenta electrica.");

        } else if (magnitudMedida >= 50) {
            System.out.println("TORMENTA: Riesgo moderado.");

        } else {
            System.out.println("TORMENTA: Riesgo bajo.");
        }
    }
}
