# Intro-to-Java-for-testing

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

# c. Find the Maximum Element in a List of Integers:
```

```

# c. Find the Maximum Element in a List of Integers:
```

```
## Ecercise 1:
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

## Ecercise 2:
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
