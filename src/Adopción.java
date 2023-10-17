public class Adopción {
    String specie;
    String race;
    String healthcondition;
    Adopción() {}

    public Adopción(String specie, String race, String healthcondition) {
        this.specie = specie;
        this.race = race;
        this.healthcondition = healthcondition;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        // Validación 1: La cadena no debe ser nula ni estar vacía
        if (specie != null && !specie.isEmpty()) {
            // Validación 2: La cadena debe contener solo letras
            if (specie.matches("^[a-zA-Z]+$")) {
                this.specie = specie;
            } else {
                // La cadena contiene caracteres no permitidos
                System.out.println("Error: La especie debe contener solo letras.");
            }
        } else {
            // La cadena es nula o está vacía
            System.out.println("Error: La especie no puede ser nula o estar vacía.");
        }
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHealthcondition() {
        return healthcondition;
    }

    public void setHealthcondition(String healthcondition) {
        this.healthcondition = healthcondition;
    }
}


