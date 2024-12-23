package entite;

public class Produit {
    private int id;
    private String nom;
    private String marque;
    private int prix;
    private String description;
    private int nbre_en_stock;

    public Produit() {
    }

    public Produit(int id, String nom, String marque, int prix, String description, int nbre_en_stock) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        this.nbre_en_stock = nbre_en_stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbre_en_stock() {
        return nbre_en_stock;
    }

    public void setNbre_en_stock(int nbre_en_stock) {
        this.nbre_en_stock = nbre_en_stock;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", description='" + description + '\'' +
                ", nbre_en_stock=" + nbre_en_stock +
                '}';
    }
}
