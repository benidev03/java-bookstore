
public class JavaBookStore {

	public static void main(String[] args) {
		
		
		
		//creazione e inizializzazione variabili
		
		String titolo = "Programmazione di base e avanzata con Java";
		String edizione = "Mylab. Con Contenuto digitale per download e accesso on line";
		int annoPubblicazione = 2018;
		String autore = "Walter Savitch";
		int voti = 314;
		String descrizione = "Un manuale di programmazione che presenta tutti i contenuti di un corso base.";
		float prezzo = 56.00f;
		int numEdizione = 2;
		String editore = "Pearson";
		float sconto = 5.00f;//sconto del 5%
		boolean disponibile = true;
		
		//Qualche calcolo semplice
		
		float prezzoRisparmiato = (prezzo * sconto)/100;
		float prezzoScontato = prezzo - prezzoRisparmiato;

		System.out.println("INFORMAZIONI DEL LIBRO");
		System.out.println();
		System.out.println("Titolo del libro : "+titolo);
		System.out.println("Edizione : "+edizione);
		System.out.println("Anno pubblicazione : "+annoPubblicazione);
		System.out.println("Autore : "+autore);
		System.out.println("Voti : "+voti);
		System.out.println("Descrizione : "+descrizione);
		System.out.println("Prezzo: "+prezzo);
		System.out.println("Numero Edizione : "+numEdizione);
		System.out.println("Editore : "+editore);
		System.out.println("Autore : "+sconto+"%");
		System.out.println("Disponibile : "+disponibile);
		System.out.println();
		System.out.println("Prezzo Risparmiato: "+prezzoRisparmiato);
		System.out.println("Prezzo Scontato: "+prezzoScontato);
		
	}

}
