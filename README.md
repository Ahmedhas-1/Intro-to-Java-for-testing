# Intro-to-Java-for-testing
## Exercise 1:
> Écrivez un programme appelé CheckPassFail qui afficher "PASS" si la variable entière "mark" est supérieure ou égale à 50 ; ou afficher "FAIL" sinon. Le programme doit toujours afficher "DONE" avant de se terminer.
```
public class CheckPassFail {  // Save as "CheckPassFail.java"
   public static void main(String[] args) {  // Program entry point
      int mark = 49;   // Set the value of "mark" here!
      System.out.println("The mark is " + mark);
 
      // if-else statement
      if ( ...... ) {
         System.out.println( ...... );
      } else {
         System.out.println( ...... );
      }
      System.out.println( ...... );
   }
}
```

## Exercise 2:
> Écrivez un programme appelé Add2Integers qui invite l'utilisateur à entrer deux entiers. Le programme doit lire les deux entiers en tant qu'entier ; calculer leur somme ; et afficher le résultat. Par exemple,
```
Enter first integer: 8
Enter second integer: 9
The sum is: 17
```
```
public class Add2Integers {  // Save as "Add2Integers.java"
   public static void main (String[] args) {
      // Declare variables
      int number1, number2, sum;

      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                     // Read next input as "int"
      
      System.out.print("Enter second integer: ");  // No newline for prompting message
      number2 = in.nextInt(); 
      in.close();  // Close Scanner

      // Compute sum
      sum = ......

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline
   }
}
```
##  Reverse a String:
```
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);
    }
}
```

##  Check if a String is a Palindrome:
```
import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        boolean isPalindrome = input.equalsIgnoreCase(reversed);
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

```



## Convert String to Uppercase:
```
import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String uppercase = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercase);
    }
}

```

##  List Exercises:

# a. Create and Display a List of Integers:
```
import java.util.ArrayList;
import java.util.List;

public class IntList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        System.out.println("List of integers: " + numbers);
    }
}
```

#  b. Find the Sum of all Elements in a List of Integers:
```
import java.util.ArrayList;
import java.util.List;

public class SumOfIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
    }
}

```

# c. Find the Maximum Element in a List of Integers:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MaxInteger {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(9);
        numbers.add(2);
        
        int max = Collections.max(numbers);
        System.out.println("Maximum element: " + max);
    }
}
```

# d. Remove Duplicates from a List of Strings
```
import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        
        List<String> uniqueStrings = new ArrayList<>();
        for (String str : strings) {
            if (!uniqueStrings.contains(str)) {
                uniqueStrings.add(str);
            }
        }
        System.out.println("List with duplicates removed: " + uniqueStrings);
    }
}

```

# e. Sort a List of Strings in Alphabetical Order:
```import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("grape");
        strings.add("kiwi");
        
        Collections.sort(strings);
        System.out.println("Sorted list: " + strings);
    }
}

```


## Exemple de class Animale:
```
public class Animal {
    // Attributs
    String nom;
    int age;
}
```

## Exemple de class Voiture:
```
public class Voiture {
    // Attributs
    String marque;
    String modele;
    int anneeFabrication;

    // Méthode pour démarrer la voiture
    public void demarrer() {
        System.out.println("La voiture démarre !");
    }

    // Méthode pour afficher les détails de la voiture
    public void afficherDetails() {
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Année de fabrication : " + anneeFabrication);
    }
}
```
## Exemple de class CompteBancaire:
```
public class CompteBancaire {
    // Attributs
    private double solde;

    // Méthode pour déposer de l'argent sur le compte
    public void deposerArgent(double montant) {
        solde += montant;
    }

    // Méthode pour retirer de l'argent du compte
    public void retirerArgent(double montant) {
        if (montant <= solde) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué avec succès.");
        } else {
            System.out.println("Solde insuffisant pour effectuer le retrait.");
        }
    }

    // Méthode pour afficher le solde du compte
    public void afficherSolde() {
        System.out.println("Solde du compte : " + solde);
    }
}
```
## Exemple de class Animale:
```
public class Etudiant {
    // Attributs
    private String nom;
    private int age;
    private double moyenne;

    // Constructeur
    public Etudiant(String nom, int age, double moyenne) {
        this.nom = nom;
        this.age = age;
        this.moyenne = moyenne;
    }

    // Getters et Setters pour les attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    // Méthode pour afficher les détails de l'étudiant
    public void afficherDetails() {
        System.out.println("Nom de l'étudiant : " + nom);
        System.out.println("Âge de l'étudiant : " + age);
        System.out.println("Moyenne de l'étudiant : " + moyenne);
    }

    // Méthode pour vérifier si l'étudiant est admis ou non
    public boolean estAdmis() {
        return moyenne >= 10.0;
    }
}

```
## Exemple de class Utilisateur:
```
public class Utilisateur {
    // Attributs
    private String nom;
    private String email;
    private int age;

    // Constructeurs
    public Utilisateur() {
        // Constructeur par défaut
    }

    public Utilisateur(String nom, String email, int age) {
        this.nom = nom;
        this.email = email;
        this.age = age;
    }

    // Getters et Setters pour les attributs
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Méthode pour afficher les détails de l'utilisateur
    public void afficherDetails() {
        System.out.println("Nom de l'utilisateur : " + nom);
        System.out.println("Email de l'utilisateur : " + email);
        System.out.println("Âge de l'utilisateur : " + age);
    }

    // Méthode pour vérifier si l'utilisateur est majeur
    public boolean estMajeur() {
        return age >= 18;
    }
// Méthode pour vérifier si l'email de l'utilisateur est valide
    public boolean estEmailValide() {
        // Vérifier si l'email contient un @ et au moins un point après le @
        return email.contains("@") && email.indexOf(".") > email.indexOf("@");
    }
}
```
## Les exceptions:
>exemple d'utilisation de **try-catch** pour gérer une exception lors de l'utilisation de la classe 'Utilisateur'
```
 String nomUtilisateur = null; // Supposons que le nom de l'utilisateur est null

        try {
            // Tentative de créer un objet Utilisateur avec le nom récupéré
            Utilisateur utilisateur = new Utilisateur(nomUtilisateur, "email@example.com", 25);
            
            // Affichage des détails de l'utilisateur
            utilisateur.afficherDetails();
        } catch (NullPointerException e) {
            // Gestion de l'exception en cas de nom d'utilisateur null
            System.out.println("Erreur : Le nom de l'utilisateur est null.");
            e.printStackTrace();
        }
```

>Voici un autre exemple où nous essayons de définir l'âge d'un utilisateur en tant que chaîne de caractères, ce qui peut entraîner une **NumberFormatException** si la chaîne ne peut pas être convertie en un entier
```
 String ageUtilisateur = "trente"; // Supposons que l'âge de l'utilisateur est une chaîne de caractères

        try {
            // Tentative de créer un objet Utilisateur avec l'âge récupéré
            Utilisateur utilisateur = new Utilisateur("John Doe", "email@example.com", Integer.parseInt(ageUtilisateur));
            
            // Affichage des détails de l'utilisateur
            utilisateur.afficherDetails();
        } catch (NumberFormatException e) {
            // Gestion de l'exception en cas de format d'âge incorrect
            System.out.println("Erreur : Format d'âge incorrect. L'âge doit être un entier.");
            e.printStackTrace();
        }
```

