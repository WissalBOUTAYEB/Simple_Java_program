import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     
        int nombre_secret = 42;
        
       
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Enter un nombre :");
    
        int nombre_utilisateur = scanner.nextInt();
      
        if (nombre_utilisateur > nombre_secret) {
            System.out.println("Le num�ro que vous avez saisi est sup�rieur au num�ro secret.");
        } else if (nombre_utilisateur < nombre_secret) {
            System.out.println("Le num�ro que vous avez saisi est inf�rieur au num�ro secret.");
        } else {
            System.out.println("Bravo, vous avez gagn� le jeu !");
        }
        
        scanner.close();
    }
}
