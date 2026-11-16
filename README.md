<img width="506" height="196" alt="image" src="https://github.com/user-attachments/assets/7126383d-1ebe-4217-a4c7-544795a33c76" />

Sistema de Alertas Meteorológicas Dinámicas

 Descripción

Este proyecto consiste en desarrollar un sistema de alertas meteorológicas en Java, aplicando conceptos de Programación Orientada a Objetos (POO), especialmente el polimorfismo, la herencia y la abstracción.

El sistema permite generar advertencias sobre diferentes fenómenos climáticos, como tormentas eléctricas, olas de calor y viento zonda, utilizando una estructura común y aplicando distintos niveles de riesgo según las condiciones meteorológicas.

 Objetivo

Implementar un sistema de monitoreo capaz de gestionar diferentes tipos de alertas climáticas mediante un método común, delegando en cada alerta la responsabilidad de evaluar la magnitud medida y determinar el nivel de riesgo.

 Clases utilizadas

AlertaClimatica: Clase abstracta que declara el método emitirAdvertencia(double magnitudMedida).

AlertaTormenta: Representa las alertas por tormentas eléctricas y determina el nivel de riesgo según la magnitud registrada.

AlertaCalor: Representa las alertas por olas de calor y establece sus propios umbrales de temperatura.

AlertaViento: Representa las alertas por viento zonda y define sus propios niveles de riesgo según la intensidad del viento.

SistemaMonitoreo: Clase encargada de recibir objetos de tipo AlertaClimatica y ejecutar las advertencias de manera polimórfica.

Main: Contiene el método principal, instancia las diferentes alertas y demuestra el funcionamiento del sistema.

 Conceptos aplicados

Programación Orientada a Objetos (POO).

Herencia.

Polimorfismo.

Clases abstractas.

Sobrescritura de métodos (@Override).

Encapsulamiento.

Desacoplamiento entre clases.

Validaciones condicionales.

Comparación de valores mediante umbrales.

 Funcionamiento

Se define la clase abstracta AlertaClimatica con el método emitirAdvertencia().

Se crean las clases AlertaTormenta, AlertaCalor y AlertaViento, cada una con sus propios criterios para evaluar las condiciones climáticas.

Se establecen diferentes umbrales para determinar los niveles de riesgo de cada fenómeno.

La clase SistemaMonitoreo recibe objetos de tipo AlertaClimatica para gestionar las advertencias.

Desde el método main se crean diferentes alertas y se envían las magnitudes medidas.

Cada alerta evalúa los valores recibidos y determina el nivel de riesgo mediante su propia implementación.

Finalmente, se muestran por consola los reportes y las advertencias correspondientes.

Tecnologías utilizadas

Lenguaje: Java.

Entorno de desarrollo: IntelliJ IDEA.

Paradigma: Programación Orientada a Objetos.

 Resultado esperado

Al ejecutar el programa, el sistema podrá procesar diferentes fenómenos meteorológicos utilizando una estructura común. Cada tipo de alerta evaluará las magnitudes recibidas según sus propios umbrales y mostrará por consola el nivel de riesgo y la advertencia correspondiente.
