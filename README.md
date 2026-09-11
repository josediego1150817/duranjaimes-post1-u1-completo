Post-contenido — Unidad 1: Fundamentos de Patrones de Diseño y Buenas Prácticas
Descripción
Repositorio del post-contenido de la Unidad 1 de Patrones de Diseño de Software. Contiene dos partes: refactorización SOLID de un God Object y análisis de patrones GoF en Spring Framework.
Parte 1 — Refactorización SOLID
El proyecto Maven refactoriza `OrderProcessor` aplicando:
SRP: separación de cálculo, persistencia, notificación y reporte.
OCP: `DiscountStrategy` permite agregar nuevas estrategias sin modificar las existentes.
DIP: `OrderService` recibe sus dependencias mediante inyección por constructor.
Ejecución
```bash
cd parte-1-refactorizacion-solid
mvn compile
mvn exec:java -Dexec.mainClass="com.patrones.u1.Main"
```
Análisis de violaciones SOLID
Principio	Método/sección afectada	Descripción
SRP	`calculateTotal`, `applyDiscount`, `saveOrder`, `sendEmail`, `printReport`	`OrderProcessor` concentra lógica de negocio, descuentos, persistencia, notificación y presentación, por lo que tiene múltiples razones para cambiar.
OCP	`applyDiscount`	El uso de condiciones sobre `customerType` obliga a modificar la clase cada vez que aparece un nuevo tipo de descuento.
DIP	`OrderProcessor` / dependencias concretas	La clase concentra creación y uso de responsabilidades concretas sin abstraer los puntos de variación. La refactorización separa responsabilidades y utiliza inyección por constructor.
Parte 2 — Análisis de Patrones GoF en Spring
#	Patrón	Categoría	Clase/componente en Spring
1	Singleton	Creacional	`DefaultSingletonBeanRegistry` / scopes de beans
2	Proxy	Estructural	`ProxyFactoryBean`, `JdkDynamicAopProxy`
3	Observer	Comportamiento	`ApplicationEvent`, `ApplicationListener`, `ApplicationEventMulticaster`
Ver `parte-2-analisis-gof-spring/documento-analisis.md`.
Herramientas utilizadas
Java 17
Apache Maven
VS Code
Git
GitHub
Spring Framework como fuente de investigación
Conclusiones
La actividad demuestra cómo SOLID y los patrones GoF pueden utilizarse conjuntamente para construir software mantenible. La Parte 1 reduce las responsabilidades concentradas en un God Object mediante SRP, OCP y DIP. La Parte 2 muestra que Spring utiliza mecanismos equivalentes a patrones GoF para administrar objetos, extender comportamientos y desacoplar componentes. El resultado evidencia que los patrones deben seleccionarse según el problema de diseño y no como soluciones aisladas.
