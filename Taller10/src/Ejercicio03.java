/***
 * El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:

Registre los nombres de cada estudiante de dicho paralelo.
Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
Obtenga el promedio del curso, del paralelo C.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 * @author Dava
 */
public class Ejercicio03 {
    public static void main(String[] args) {
        String[] nombres = new String[28];
        double[] acd = new double[28];
        double[] ape = new double[28];
        double[] aa = new double[28];
        double[] promedios = new double[28];
        double promedioCurso = 0;
        double mayorPromedio = 0;
        double menorPromedio = 10;
        String mejorEstudiante = "";
        String peorEstudiante = "";

        for (int i = 0; i < 28; i++) {
            nombres[i] = "Estudiante " + (i + 1);
            acd[i] = Math.random() * 10;
            ape[i] = Math.random() * 10;
            aa[i] = Math.random() * 10;
            promedios[i] = (acd[i] * 0.35) + (ape[i] * 0.35) + (aa[i] * 0.30);
            promedioCurso += promedios[i];

            if (promedios[i] > mayorPromedio) {
                mayorPromedio = promedios[i];
                mejorEstudiante = nombres[i];
            }
            if (promedios[i] < menorPromedio) {
                menorPromedio = promedios[i];
                peorEstudiante = nombres[i];
            }
        }

        promedioCurso /= 28;

        System.out.println("Promedio del curso: " + promedioCurso);
        System.out.println("\nEstudiantes con promedio por encima del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }

        System.out.println("\nEstudiantes con promedio por debajo del curso:");
        for (int i = 0; i < 28; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }

        System.out.println("\nEstudiante con mayor promedio:");
        System.out.println(mejorEstudiante + " - Promedio: " + mayorPromedio);

        System.out.println("\nEstudiante con menor promedio:");
        System.out.println(peorEstudiante + " - Promedio: " + menorPromedio);
    }
}

/***
 * Promedio del curso: 5.018683543452985

Estudiantes con promedio por encima del curso:
Estudiante 1 - Promedio: 5.342404572620032
Estudiante 2 - Promedio: 7.921254602491887
Estudiante 5 - Promedio: 5.049146860193123
Estudiante 7 - Promedio: 5.597617132002623
Estudiante 9 - Promedio: 5.034009748623151
Estudiante 10 - Promedio: 6.766707926058773
Estudiante 15 - Promedio: 5.674424444765062
Estudiante 18 - Promedio: 7.473512459459315
Estudiante 21 - Promedio: 5.466950495834003
Estudiante 22 - Promedio: 6.068321878672617
Estudiante 23 - Promedio: 5.417391367938502
Estudiante 26 - Promedio: 5.312343484801586
Estudiante 27 - Promedio: 5.658274112348439

Estudiantes con promedio por debajo del curso:
Estudiante 3 - Promedio: 4.5646976347817025
Estudiante 4 - Promedio: 5.010606120784362
Estudiante 6 - Promedio: 3.5001564713542317
Estudiante 8 - Promedio: 4.017572832503848
Estudiante 11 - Promedio: 4.986518791766443
Estudiante 12 - Promedio: 2.8034450574065275
Estudiante 13 - Promedio: 4.32807295893649
Estudiante 14 - Promedio: 4.923416212994978
Estudiante 16 - Promedio: 4.1358788924911
Estudiante 17 - Promedio: 4.726330765187233
Estudiante 19 - Promedio: 4.423328038343543
Estudiante 20 - Promedio: 3.8548958679611696
Estudiante 24 - Promedio: 4.156986825028119
Estudiante 25 - Promedio: 4.4472625148798794
Estudiante 28 - Promedio: 3.8616111464548633

Estudiante con mayor promedio:
Estudiante 2 - Promedio: 7.921254602491887

Estudiante con menor promedio:
Estudiante 12 - Promedio: 2.8034450574065275
 */
