public class Main {
    public static void main(String[] args) {
        // dichiaro studente come oggetto
        Studente studente1 = new Studente("Mario", "Rossi", 123);

        // metodi setter per impostare le proprietà
        studente1.setNome("Mario");
        studente1.setCognome("Rossi");
        studente1.setIdentificativo(123);

        // stampa valori proprietà
        System.out.println(studente1);
    }
}