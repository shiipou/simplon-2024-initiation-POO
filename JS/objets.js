class Voiture {
    marque;
    couleur;

    constructor(marque, couleur) {
        this.marque = marque;
        this.couleur = couleur;
    }

    start() {
        console.log(`La voiture ${this.marque} démarre.`)
    }
    stop() {
        console.log(`La voiture ${this.marque} s'arrête.`)
    }

    /**
     * 
     * @param {Voiture} autreVoiture 
     */
    crash(autreVoiture) {
        console.log(`La ${this.marque} crash avec la ${autreVoiture.marque}.`)
    }
}

const voitureT = new Voiture("Toyata", "Rouge");
const voitureF = new Voiture("Farrery", "Rouge");

console.log(voitureT);

voitureT.start();

voitureF.crash(voitureT);

voitureT.stop();
