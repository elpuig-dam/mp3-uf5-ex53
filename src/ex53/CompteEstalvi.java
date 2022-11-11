package exceptions.ex53;

import java.util.ArrayList;
import java.util.List;

public class CompteEstalvi {
    private String numCompte;
    private double saldo;
    //Llista d'usuaris co-propietaris del compte
    private List<Client> llista_usuaris;

    public CompteEstalvi(String numCompte) {
        this.numCompte = numCompte;
        llista_usuaris = new ArrayList<>();
        saldo = 0;
    }

    /**
        Afegeix un usuari d'aquest compte
        @param client
        @return quantitat d'usuaris que té el compte

     **/
    public int addUser(Client client) {
        llista_usuaris.add(client);
        return llista_usuaris.size();
    }

    /**
     Elimina un usuari d'aquest compte
     @param dni
     @return quantitat d'usuaris que té el compte
     @throws BankAccountException
     **/
    public int removeUser(String dni) {
        //TODO
    }

    /**
     * Afegeix m diners al saldo
     * @param amount
     */
    public void ingressar(double amount) {
        //TODO
    }

    /**
     * Treu m diners del compte si n'hi han suficient
     * @param amount
     * @throws BankAccountException
     */
    public void treure(double amount)  {
        //TODO treu sum de diners del saldo
    }

    public String getNumCompte() {
        return numCompte;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Client> getLlista_usuaris() {
        return llista_usuaris;
    }
}
