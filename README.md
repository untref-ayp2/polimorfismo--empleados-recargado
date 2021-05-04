# Empleados, recargado

Todos los empleados deben cobrar un sueldo por su trabajo, por lo que nos piden implementar el método liquidarSueldo() en la clase Empresa que polimórficamente calcule el sueldo de cada empleado y muestre por pantalla el listado de empleados y el sueldo que le corresponde.

El sueldo de cada empleado se calcula de acuerdo a su categoría.
Todos los empleados de planta permanente tienen un sueldo básico consistente en 1000 unidades retributivas o UR (el valor de la unidad retributiva se actualiza mensualmente). En el caso de los empleados en planta permanente a tiempo completo , al sueldo básico se le suma salario familiar (200 UR por cada hijo y 100 UR por conyugue) y antigüedad (100 UR por año cumplido hasta un tope de 2000 UR). En el caso de los gerentes su sueldo se calcula como el de un empleado a tiempo completo y se le suma un adicional fijo por personal a cargo de 2000 UR.
En el caso de los empleados en planta permanente a tiempo parcial el sueldo se calcula como 1/3 del sueldo básico, más la cantidad de horas trabajadas en el mes a un valor de 10 UR la hora (con un tope de 1000 UR, es decir si 1/3 del básico mas la cant. de horas x 10 UR supera 1000 UR se toma solo 1000 UR), más salario familiar y antigüedad como en el caso de los empleados a tiempo completo.

En el caso de los empleados en planta temporaria, el sueldo se calcula igual que en el caso de empleados en planta permanente pero no cobran el adicional por antigüedad.

Se debe presentar la resolución del problema usando POO, una clase demo con un main donde se muestre la funcionalidad solicitada (crear los empleados con todos los datos necesarios para poder calcular su sueldo, agregarlos a la lista de empleados y liquidarSueldo de todos los empleados), el valor de la UR se debe poder modificar desde el demo, para calcular los sueldos con distintos valores y un conjunto de pruebas de cada una de las clases desarrolladas y el diagrama de clases correspondiente (no hace falta incluir la clase con el demo en el diagrama).
