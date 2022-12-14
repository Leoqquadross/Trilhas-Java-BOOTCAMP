package personagem-builder;
public class LadraoBuilder implements Builder {


    private String nome;
    private int inteligencia;
    private TipoPersonagem tipo;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;


    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public TipoPersonagem getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(TipoPersonagem tipo) {
        this.tipo = tipo;
    }

    public int getForca() {
        return forca;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVigor() {
        return vigor;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public int getResistencia() {
        return resistencia;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getDestreza() {
        return destreza;
    }

    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public Ladrao build () {

        return new Ladrao(nome, inteligencia, forca, vigor, resistencia, destreza);
    }
}
