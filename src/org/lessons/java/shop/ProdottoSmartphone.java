package org.lessons.java.shop;

public class ProdottoSmartphone  {
	public static void main(String[] args) {
        Prodotto smartphone = new Prodotto();
        
        
        
        smartphone.nome = "Redmi Note 13";
        smartphone.descrizione = "Tripla fotocamera da 108 MP | Display AMOLED da 120 Hz | Potenti prestazioni Snapdragon® | "
				+ "Ricarica rapida da 33 W con batteria da 5.000 maH";
        smartphone.prezzo = 699.99;
        smartphone.iva = 22;
        
        // Stampa le informazioni del prodotto
        System.out.println(smartphone.nome + " - " + smartphone.descrizione);

        // Stampa il prezzo base
        System.out.println("Prezzo base: " + smartphone.prezzoBase() + "€");

        // Stampa il prezzo con IVA
        System.out.println("Prezzo con IVA: " + String.format("%.2f", smartphone.calcolaPrezzoConIVA()) + "€");
        
        //System.out.println(nomeEsteso);
        
        System.out.println("Codice prodotto: " + smartphone.codice);
        //System.out.println(Prodotto);
    }

}
