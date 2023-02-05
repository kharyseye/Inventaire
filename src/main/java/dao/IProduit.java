package dao;

import java.util.List;

public interface IProduit {
	public Produit addProduit(Produit p);
	public List<Produit> produitparmc(String mc);
	public Produit update(Produit p);
	public Produit getProduit(int id);
	public void delete (int id);

}
