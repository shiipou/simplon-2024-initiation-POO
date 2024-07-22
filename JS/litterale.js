const voitureT = {
    "marque": "Toyata",
    "couleur": "rouge"
}

const voitureF = {
    "marque": "Ferrary",
    "couleur": "rouge"
}

console.log(voitureT);

/**
 * 
 * @param {{marque: String, couleur: String}} voiture 
 */
function startCar(voiture) {
    console.log(`La voiture ${voiture.marque} démarre.`)
}

/**
 * 
 * @param {{marque: String, couleur: String}} voiture 
 */
function stopCar(voiture) {
    console.log(`La voiture ${voiture.marque} s'arrête.`)
}

/**
 * @param {{marque: String, couleur: String}} voitureEnTort 
 * @param {{marque: String, couleur: String}} voitureVictime 
 */
function crash(voitureEnTort, voitureVictime) {
    console.log(`La ${voitureEnTort.marque} crash avec la ${voitureVictime.marque}.`)
}

startCar(voitureT)

crash(voitureF, voitureT)

stopCar(voitureT)
