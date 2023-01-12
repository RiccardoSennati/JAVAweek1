package classes;

public class Esercizio2 {

	
	public static void main(String[] args) {

        Sim s1 = new Sim("+39 333 1234567");
        Chiamate chiamata1 = new Chiamate("+39 333 1212123", 13);

        s1.getListaChiamate()[0] = chiamata1;
        chiamata1 = new Chiamate("+39 1111111", 3);
        s1.getListaChiamate()[1] = chiamata1;

        System.out.println("--------------------------------------------------------------------");

        s1.stampaDati();

        System.out.println("--------------------------------------------------------------------");
    }
	
}
