import java.util.*;

public class Main {
    public static void main(String[] args) {
        ej1();
        ej2();
        ej3();
        ej4();
        ej5();
        ej6();
        ej7();
        ej8();
        ej9();
    }

    public static void ej1() {
        System.out.println("Ejercicio 1 | Array con cadenas");
        String[] frutas = {"Manzana", "Uva", "Melocotón", "Mango", "Platano"};
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }

    public static void ej2() {
        System.out.println("Ejercicio 2 | Array suma números");
        int[] numeros = {5, 6, 7, 8, 9, 10};
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        System.out.println(suma);
    }

    public static void ej3() {
        System.out.println("Ejercicio 3 | Media");
        double suma = 0;
        double[] nums = {3.5, 4, 4.5, 5.5, 6, 6.6};
        for (double numero : nums) {
            suma += numero;
        }
        double media = suma / nums.length;
        System.out.println(media);
    }

    public static void ej4() {
        System.out.println("Ejercicio 4 | Par/Impar");
        int[] numeros = {6, 7, 8, 9, 10};
        int pares = 0;
        int impares = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
    }

    public static void ej5() {
        String[] nombres = {"Paco", "Lucía", "Fernando", "Javier", "Andrés"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        String nombre = sc.nextLine();
        boolean existe = false;

        for (String nombree : nombres) {
            if (nombre.equals(nombree)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("El nombre " + nombre + " existe");
        } else {
            System.out.println("El nombre " + nombre + " no existe");
        }
    }

    public static void ej6() {
        System.out.println("Ejercicio 6 | HashSet Palabra más larga");
        HashSet<String> palabras = new HashSet<>();
        palabras.add("Vino");
        palabras.add("Vodka");
        palabras.add("Ginebra");
        palabras.add("Whisky");
        palabras.add("Ron");

        String palabramaslarga = "";
        for (String palabra : palabras) {
            if (palabra.length() > palabra.length()) {
                palabramaslarga = palabra;
            }
        }
        System.out.println("La palabra más larga es " + palabramaslarga);
    }

    public static void ej7() {
        System.out.println("Ejercicio 7 | HashMap  Nombres y nota media");
        HashMap<String, Double> notas = new HashMap<>();
        notas.put("Alberto", 4.0);
        notas.put("Guillermo", 8.5);
        notas.put("Patricia", 7.0);
        notas.put("Juan", 7.5);
        notas.put("Paco", 5.5);

        String mejorAlumno = "";
        String peorAlumno = "";
        double notaMax = -1, notaMin = 11, sumaNota = 0;
        for (Map.Entry<String, Double> notaa : notas.entrySet()) {
            String alumno = notaa.getKey();
            Double nota = notaa.getValue();

            sumaNota += nota;
            if (nota > notaMax) {
                mejorAlumno = alumno;
                notaMax = nota;
            }
            if (nota < notaMin) {
                peorAlumno = alumno;
                notaMin = nota;
            }
        }
        System.out.println("El mejor alumno es " + mejorAlumno + " por su calificación de " + notaMax);
        System.out.println("El peor alumno es " + peorAlumno + " por su calificación de " + notaMin);
    }

    public static void ej8() {
        System.out.println("Ejercicio 8 | HashMap Productos e IVA");
        HashMap<String, Double> productos = new HashMap<>();
        productos.put("Leche", 1.5);
        productos.put("Aguacate", 3.5);
        productos.put("Cereales", 2.5);
        productos.put("Mermelada", 3.2);
        productos.put("Pan", 0.9);

        final double IVA = 1.21;

        for (Map.Entry<String, Double> producto : productos.entrySet()) {
            double precio = producto.getValue() * IVA;
            System.out.println(precio);
        }
    }

    public static void ej9() {
        System.out.println("Ejercicio 9 | HashMap Mayores y menores de edad");
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Alberto", 15);
        edades.put("Guillermo", 30);
        edades.put("Patricia", 18);
        edades.put("Juan", 25);
        edades.put("Paco", 16);

        int anyoActual = 2026;
        int mayores = 0;
        for (Map.Entry<String, Integer> edad : edades.entrySet()) {
            int edadActual = anyoActual - edad.getValue();
            if (edadActual <= 2008) {
                mayores++;
                System.out.println(edad.getKey() + " " + edadActual);
            }
        }
        System.out.println("Estos son los mayores de edad " + mayores);
    }
}





