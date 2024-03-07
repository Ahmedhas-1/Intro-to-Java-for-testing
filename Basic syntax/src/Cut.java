public class Cut {
    // Attributs
    private String type;
    private int length; // Longueur en centimètres

    // Constructeur
    public Cut(String type, int length) {
        this.type = type;
        this.length = length;
    }

    // Méthodes
    // Méthode pour obtenir le type de coupe
    public String getType() {
        return type;
    }

    // Méthode pour définir le type de coupe
    public void setType(String type) {
        this.type = type;
    }

    // Méthode pour obtenir la longueur de la coupe
    public int getLength() {
        return length;
    }

    // Méthode pour définir la longueur de la coupe
    public void setLength(int length) {
        this.length = length;
    }

    // Méthode pour afficher les détails de la coupe
    public void displayCutDetails() {
        System.out.println("Type de coupe : " + type);
        System.out.println("Longueur de la coupe : " + length + " cm");
    }

    // Méthode pour vérifier si la coupe est assez longue
    public boolean isLongEnough(int requiredLength) {
        return length >= requiredLength;
    }
}
