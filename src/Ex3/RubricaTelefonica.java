package Ex3;

import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {
    private HashMap<String, String> contatti;

    public RubricaTelefonica() {
        contatti = new HashMap<>();
    }

    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.aggiungiContatto("Mario Rossi", "123456789");
        rubrica.aggiungiContatto("Luigi Bianchi", "987654321");

        rubrica.stampaRubrica();

        System.out.println("Numero di Mario Rossi: " + rubrica.cercaNumeroPerNome("Mario Rossi"));
        System.out.println("Nome per numero 987654321: " + rubrica.cercaNomePerNumero("987654321"));

        rubrica.rimuoviContatto("Mario Rossi");
        rubrica.stampaRubrica();
    }

    public void aggiungiContatto(String nome, String telefono) {
        contatti.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " -> " + telefono);
    }

    public void rimuoviContatto(String nome) {
        if (contatti.containsKey(nome)) {
            contatti.remove(nome);
            System.out.println("Contatto rimosso: " + nome);
        } else {
            System.out.println("Contatto non trovato: " + nome);
        }
    }

    public String cercaNomePerNumero(String telefono) {
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public String cercaNumeroPerNome(String nome) {
        return contatti.get(nome);
    }
    
    public void stampaRubrica() {
        if (contatti.isEmpty()) {
            System.out.println("La rubrica è vuota.");
        } else {
            System.out.println("Contatti nella rubrica:");
            for (Map.Entry<String, String> entry : contatti.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
