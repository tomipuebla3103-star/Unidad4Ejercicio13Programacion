//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    AlertaTormenta tormenta = new AlertaTormenta();

    AlertaCalor calor = new AlertaCalor();

    AlertaViento viento = new AlertaViento();

    SistemaMonitoreo sistema = new SistemaMonitoreo();

    System.out.println("REPORTE METEOROLOGICO");
    System.out.println("----------------------");

    sistema.generarAlerta(tormenta, 85);

    sistema.generarAlerta(calor, 38);

    sistema.generarAlerta(viento, 95);

    System.out.println("----------------------");
    System.out.println("FIN DEL REPORTE");
}
