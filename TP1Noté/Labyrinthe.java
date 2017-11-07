public class Labyrinthe{

    private static final int LMURET = 8;
    private static final int HMURET = 4;

    // prend en paramètre hauteur et largeur(en nombre de cases) et initialise le tableau de caractères.
    public Labyrinthe(int h, int w){

    }
    int h, w;

    // prend en paramètre un autre Labyrinthe et le "recopie" dans celui qui est créé.
    public Labyrinthe(Labyrinthe l){

    }

    // prenant en paramètre hauteur et largeur et qui crée un tel tableau, et le remplit de caractères espace (' ').
    public void creeTableau(inthauteur, intlargeur){

    }

    // qui remplit le tableau de caractères espace (' ').
    public void effaceTableau(){

    }

    // dessine un mur d'enceinte complètement fermé.
    public void dessineMurdEnceinte(){

    }

    // prend en paramètre la position verticale j (en nombre de cases) de l'ouverture de droite et la crée en effaçant
    // la portion du mur d'enceinte correspondante.
    public void dessineOuverture(int j){

    }

    // reçoit en paramètre la position i et j de la case oùon veut dessiner un muret vertical (sur son bord gauche)
    public void dessineMuretVertical(int i, int j){

    }

    // reçoit en paramètre la position i et j de la case oùon veut dessiner un muret horizontal (sur son bord haut)
    public void dessineMuretHorizontal(int i, int j){

    }

    // reçoit en paramètre la position i et j d'une case. Retourne true si sur le bord gauche de cette case,
    // apparaît un muret ou un mur d'enceinte
    public void aMuretAGauche(int i, int j){

    }

    // reçoit en paramètre la position i et j d'une case. Retourne true si sur le bord droit de cette case,
    // apparaît un muret ou un mur d'enceinte
    public void aMuretADroite(int i, int j){

    }

    // reçoit en paramètre la position i et j d'une case. Retourne true si sur le bord en haut de cette case,
    // apparaît un muret ou un mur d'enceinte
    public void aMuretEnHaut(int i, int j){

    }

    // reçoit en paramètre la position i et j d'une case. Retourne true si sur le bord en bas de cette case,
    // apparaît un muret ou un mur d'enceinte
    public void aMuretEnBas(int i, int j){

    }

    // reçoit en paramètre la position i et j d'une case. Retourne true si sur le bord à gauche de cette case,
    // c’est l’entrée du labyrinthe
    public void aEntreeAGauche(int i, int j){

    }

    // reçoit en paramètre la position i et j d'une case. Retourne true si sur le bord à droite de cette case,
    // apparaît la sortie
    public void aSortieADroite(int i, int j){

    }

    // prendra en paramètre un objet de type Personnage (voir ci-dessous), et le dessinera (avec un caractère '@')
    // au centre de la case correspondant à sa position
    public void dessinePersonnage(Personnage p){

    }

    // prendra en paramètre un objet de type Personnage (voir ci-dessous), et effacera (en y mettant un caractère ' ')
    // le centre de la case correspondant à sa position
    public void effacePersonnage(Personnage p){

    }

    // affiche *200* lignes vides pour évacuer vers le haut ce qui était auparavant visible sur le terminal.
    public static void effaceEcran(){

    }

    // affiche le tableau de caractères àl'écran (suggestion, construisez une String contenant votre tableau puis affichez-la)
    public void affiche(){

    }

    // une méthode qui prend en paramètre la "densite" et construit des murets aléatoirement (voir indication sur
    // comment procéder plus bas), et pratique une ouverture (au hasard) sur le mur d'enceinte de droite.
    public void construitLabyrintheAleatoire(double densite){

    }

}