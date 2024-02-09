import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
     
        int nombre_secret = 42;
        
       
        Scanner scanner = new Scanner(System.in);
        
     
        System.out.println("Enter un nombre :");
    
        int nombre_utilisateur = scanner.nextInt();
      
        if (nombre_utilisateur > nombre_secret) {
            System.out.println("Le numéro que vous avez saisi est supérieur au numéro secret.");
        } else if (nombre_utilisateur < nombre_secret) {
            System.out.println("Le numéro que vous avez saisi est inférieur au numéro secret.");
        } else {
            System.out.println("Bravo, vous avez gagné le jeu !");
        }
        
        scanner.close();
    }
}
