package application;

import entite.Produit;
import metier.MetierProduitImpl;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int sc=0;
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner clavier = new Scanner(System.in);
        System.out.println("1. Afficher la liste des produits.");
        System.out.println("2. Rechercher un produit par son id.");
        System.out.println("3. Ajouter un nouveau produit dans la liste.");
        System.out.println("4. Supprimer un produit par id.");
        System.out.println("5. Quitter ce programme.");

        do {
            System.out.println("Choisissez une option");
            sc=clavier.nextInt();
            switch(sc) {

                case 1:
                    List<Produit> produits=metier.getAll();
                    if(produits.isEmpty()) {
                        System.out.println("Aucun produit");
                    }
                    else {
                        produits.forEach(prod ->{
                            System.out.println(prod.toString());
                        });
                    }
               break;
                case 2:
                    System.out.println("Saisissez l'id du produit ");
                   int produitId=clavier.nextInt();
                   Produit leproduit=  metier.findById(produitId);
                   if(leproduit != null) {
                       System.out.println(leproduit);
                   }else {
                       System.out.println("Produit n'existe pas");
                   }
                    break;
                case 3:
                    System.out.println("Saisissez l'id du produit ");
                    int Id=clavier.nextInt();
                    System.out.println("Saisissez le nom du produit ");
                    String nomProduit=clavier.next();
                    System.out.println("Saisissez la marque du produit ");
                    String marqueProduit=clavier.next();
                    System.out.println("Saisissez prix du produit ");
                    int prixProduit=clavier.nextInt();
                    System.out.println("Saisissez la description du produit ");
                    String descriptionProduit=clavier.next();
                    System.out.println("Saisissez la nombre en stock du produit ");
                    int nobreStock=clavier.nextInt();

                    Produit produit = new Produit();
                    produit.setId(Id);
                    produit.setNom(nomProduit);
                    produit.setPrix(prixProduit);
                    produit.setDescription(descriptionProduit);
                    produit.setMarque(marqueProduit);
                    produit.setNbre_en_stock(nobreStock);
                    metier.add(produit);

                    break;
                case 4:
                    System.out.println("Saisissez l'id du produit ");
                    int prodId=clavier.nextInt();
                    Produit produitASup=  metier.findById(prodId);
                    if(produitASup != null) {
                        metier.delete(produitASup.getId());
                    }
                    else
                    {
                        System.out.println("Le produit n'existe pas ");
                    }
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    clavier.close();
                    return;
                default:
                    System.out.println("Choix invalide.");
            }

        } while(sc !=0 );
    }
}
