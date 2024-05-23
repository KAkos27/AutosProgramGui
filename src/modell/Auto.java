package modell;

public class Auto {

    private static int objektumDb = 0;
    private boolean uzemanyag;
    private boolean beinditva;
    private boolean defekt;
    private int potkerek;

    public Auto() {
        this(true, false);
    }

    public Auto(boolean beinditva) {
        this(false, beinditva);
    }

    public Auto(boolean uzemanyag, boolean beinditva) {
        this(uzemanyag, beinditva, 1);
    }

    public Auto(boolean uzemanyag, boolean beinditva, int potkerek) {
        Auto.objektumDb++;
        this.uzemanyag = uzemanyag;
        this.beinditva = beinditva;
        this.potkerek = potkerek;
        this.defekt = false;
    }

    public void setBeinditva(boolean beinditva) {
        this.beinditva = beinditva;
    }

    public void megyEselyDefektre() throws Exception {
        megyEselyDefektre(.2);
    }

    public void megyEselyDefektre(double esely) throws Exception {
        if (beinditva && uzemanyag && !defekt) {
            if (Math.random() < esely) {
                defektetKap();
            } else {
                megy();
            }
        } else {
            throw new Exception("Nem tud menni az autó");
        }
    }

    public void megy() throws Exception {
        if (beinditva && uzemanyag && !defekt) {
            this.uzemanyag = false;
        } else {
            throw new Exception("Nem tud menni az autó!");
        }
    }

    public void tankol() throws Exception {
        if (!beinditva) {
            this.uzemanyag = true;
        } else {
            throw new Exception("Be van indítva az autó!");
        }
    }

    public void kerekCsere() throws Exception {
        if (defekt && potkerek > 0) {
            this.defekt = false;
            potkerek--;
        } else {
            throw new Exception("Nincs elég pótkerék, vagy nem defektes az autó");
        }
    }

    public void defektetKap() {
        this.defekt = true;
    }

    public boolean isUzemanyag() {
        return uzemanyag;
    }

    public boolean isDefekt() {
        return defekt;
    }

    public int getPotkerek() {
        return potkerek;
    }

    public boolean isBeinditva() {
        return beinditva;
    }
}
