   public class Main {
       public static void main(String[] args) {
           int numeroIf = -10;
           //Si el numero es inferior a 0, es negativo
           if (numeroIf < 0) {
               System.out.println("La variable numeroIf " + numeroIf + " es negativo");
           }
           //Si el numero es superior a 0, es positivo
           else if (numeroIf > 0) {
               System.out.println("La variable numeroIf " + numeroIf + " es positivo");
           }
           //En cualquier otro caso (el único caso que queda es 0), será 0
           else {
               System.out.println("La variable numeroIf es 0");
           }
       // un while donde se va sumando
           int numerowhile = 2;
    while (numerowhile < 10) {
        System.out.println(numerowhile);
        numerowhile = numerowhile + 1;
    }
// aqui se ejecuta primero la accion y despues sigue
        int numeroWhile2 = 2;
           do {
               System.out.println(numeroWhile2);
               numeroWhile2 = numeroWhile2 +1;
           }
           while (numeroWhile2 <= 2);{
       }
// esto debo revisarlo
    for (int numeroFor = 0; numeroFor <= 3; numeroFor ++)
               System.out.println(numeroFor);
// permite buscar  entre varias opciones
       var estacion = "invierno";
           switch (estacion) {
               case "verano":
                   System.out.println("A salir a pasear");
                   break;
               case "invierno":
                   System.out.println("Vamos a abrigarnos");
                   break;
               case "primavera":
                   System.out.println("Que hermosa la naturaleza");
                   break;
               case "otoño":
                   System.out.println("Se caen las hojas");
                   break;
               default:
                   System.out.println("Default he dicho");
           }


   }

   }
