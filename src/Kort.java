public class Kort{

    private char farve; // S,H,R,K

    private int vaerdi; // 0 til 12


//Constructor
    public Kort (char farve, int vaerdi) {
        this.farve = farve;
        this.vaerdi = vaerdi;

    }



    public String toString() {
        String farveString = "";
        String billedkortNavn = "";

        switch (farve) {
            case 'S' : farveString = "Spar ";
            break;
            case 'H' : farveString = "Hjerter ";
            break;
            case 'R' : farveString = "Ruder ";
            break;
            case 'K' : farveString = "Klør ";
        }

        if (vaerdi > 0 && vaerdi < 10) {
            return farveString + vaerdi;
        }
        else {
            switch (vaerdi) {
                case 0 : billedkortNavn = "Es";
                break;
                case 10 : billedkortNavn = "Knægt";
                break;
                case 11 : billedkortNavn = "Dame";
                break;
                case 12 : billedkortNavn = "Konge";
                break;
            }
        }
        return farveString + billedkortNavn;
    }
}