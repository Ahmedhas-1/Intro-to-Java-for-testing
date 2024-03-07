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