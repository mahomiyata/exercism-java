abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract public String toString();
    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        if(wizard.isVulnerable()) {
            return 10;
        } else {
            return 6;
        }
    }
}

class Wizard extends Fighter {

    boolean isPrepared = false;

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    @Override
    boolean isVulnerable() {
        return !this.isPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        if(this.isPrepared) {
            return 12;
        } else {
            return 3;
        }
    }

    void prepareSpell() {
        this.isPrepared = true;
    }

}
