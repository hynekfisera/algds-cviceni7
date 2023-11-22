public class Pes {
    private String jmeno;
    private String rasa;
    private int vek;
    private String barvaSrsti;
    private String oblibenyPamlsek;
    public Pes() {

    }

    public Pes(String jmeno, String rasa, int vek, String barvaSrsti, String oblibenyPamlsek) {
        this.jmeno = jmeno;
        this.rasa = rasa;
        this.vek = vek;
        this.barvaSrsti = barvaSrsti;
        this.oblibenyPamlsek = oblibenyPamlsek;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public String getBarvaSrsti() {
        return barvaSrsti;
    }

    public void setBarvaSrsti(String barvaSrsti) {
        this.barvaSrsti = barvaSrsti;
    }

    public String getOblibenyPamlsek() {
        return oblibenyPamlsek;
    }

    public void setOblibenyPamlsek(String oblibenyPamlsek) {
        this.oblibenyPamlsek = oblibenyPamlsek;
    }
}
