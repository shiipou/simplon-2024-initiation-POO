package lamborghini;

public class LamborghiniFactory extends Factory {

    @Override
    public Vehicule creerVehicule(VehiculeChoice type) {
        if(!(type instanceof LamborghiniVehiculeChoice)) {
            throw new IllegalArgumentException("Le choix n'est pas un choix pour Lamborghini");
        }

        switch ((LamborghiniVehiculeChoice)type) {
            case REVUELTO:
            case HURACAN:
            case URUS:
                return new Voiture(type.toString());
            case SPARK:
            case STRIKE:
            case SPIRE:
            case CRONO: 
                return new Tracteur(type.toString());
        }

        throw new IllegalArgumentException("Invalid input provided. This must never occure.");
    }
}

