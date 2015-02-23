package TreCarteApp;

import java.util.Random;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author bel22721
 */

public class FXMLDocumentController {

    @FXML
    private Label domanda, percentuale, risultato;
    @FXML
    private Button primacarta, secondacarta, terzacarta, Start;
    private String nomeCartaI, nomeCartaII, nomeCartaIII;
    private int punteggioVinto = 0, punteggioPerso = 0, numeroPartita = 0;

    @FXML
    public void changeTxtButton() {
        Start.setText("Rifai");
        primacarta.setText("Carta I");
        secondacarta.setText("Carta I");
        terzacarta.setText("Carta III");
    }

    public void setButtonDisable(boolean b) {
        primacarta.setDisable(b);
        secondacarta.setDisable(b);
        terzacarta.setDisable(b);
    }

    public int calcolaPercentuale() {
        numeroPartita = punteggioVinto + punteggioPerso;
        int percentualeVinto = (punteggioVinto * 100) / numeroPartita;
        return percentualeVinto;
    }

    @FXML
    public void cancella() {
        changeTxtButton();
        domanda.setText("Dove è l'Asso ?");
        setButtonDisable(false);
        Random random = new Random();
        int r = random.nextInt(3);
        if (r == 0) {
            nomeCartaI = "Cavallo";
            nomeCartaI = "Fante";
            nomeCartaII = "Asso";
        }
        if (r == 1) {
            nomeCartaI = "Asso";
            nomeCartaII = "Fante";
            nomeCartaIII = "Cavallo";
        }
        if (r == 2) {
            nomeCartaI = "Asso";
            nomeCartaII = "Fante";
            nomeCartaIII = "Cavallo";
        }
    }

    @FXML
    public void movimentoI() {
        if (nomeCartaI.equalsIgnoreCase("Asso")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai trovato la carta: " + nomeCartaI);
        }
        primacarta.setText(nomeCartaI);
        secondacarta.setText(nomeCartaII);
        terzacarta.setText(nomeCartaIII);
        percentuale.setText("Vinto: " + punteggioVinto + " Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    public void movimentoII() {
        if (nomeCartaII.equalsIgnoreCase("Asso")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");

        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai trovato la carta: " + nomeCartaII);
        }
        primacarta.setText(nomeCartaI);
        secondacarta.setText(nomeCartaII);
        terzacarta.setText(nomeCartaIII);
        percentuale.setText("Vinto: " + punteggioVinto + " Perso: " + punteggioPerso + " Percentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

    @FXML
    public void movimentoIII() {
        if (nomeCartaIII.equalsIgnoreCase("Asso")) {
            punteggioVinto++;
            risultato.setText("Hai vinto!");
        } else {
            punteggioPerso++;
            risultato.setText("Hai perso! Hai trovato la carta: " + nomeCartaIII);
        }
        primacarta.setText(nomeCartaI);
        secondacarta.setText(nomeCartaII);
        terzacarta.setText(nomeCartaIII);
        percentuale.setText("Vinto: " + punteggioVinto + "\tPerso: " + punteggioPerso + " \tPercentuale: " + calcolaPercentuale() + "%");
        setButtonDisable(true);
    }

}
