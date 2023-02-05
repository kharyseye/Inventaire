package presentation;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import dao.Produit;
import dao.ProduitImpl;
import dao.SingletonConnection;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * SingletonConnection con = new SingletonConnection(); Connection test =
		 * con.getConnection(); if(test != null) {
		 * System.out.println("connexion etablie"); }else {
		 * System.out.println("echec de la connection"); }
		 */
		
		ProduitImpl dao = new ProduitImpl();

//AJOUTER UN PRODUIT 		
		/*
		 * Produit p1 = dao.addProduit(new Produit("cle usb", 10000, 100)); Produit p2 =
		 * dao.addProduit(new Produit("disque", 30000, 150));
		 * System.out.println(p1.toString()); System.out.println(p2.toString());
		 */
		
//CHERCHER PAR MOT CLE
		List<Produit> produits = dao.produitparmc("%H%");
		for(Produit p:produits) {
			System.out.println(p);
		}
		
		
		
		
		
		
	}

}
