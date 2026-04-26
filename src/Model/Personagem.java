package Model;

//Classe abstrata Personagem;
public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;
    protected int vidaMaxima;
    protected int mana;
    protected int manaMaxima;
    protected int ataque;
    protected int defesa;
    protected int experiencia;

    //Construtor;
    public Personagem(String nome, int vida, int mana, int ataque, int defesa) {
        this.nome = nome;
        setNivel(1);
        setExperiencia(0);

        this.vida = vida;
        this.vidaMaxima = vida;

        this.mana = mana;
        this.manaMaxima = mana;

        this.ataque = ataque;
        this.defesa = defesa;
    }

    //Getters e setters;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getManaMaxima() {
        return manaMaxima;
    }

    public void setManaMaxima(int manaMaxima) {
        this.manaMaxima = manaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    //Metodo exibirStatus();
    public abstract void exibirStatus();

    //Fórmula: dano real = dano - (defesa / 2)
    public boolean receberDano(int dano){
        boolean morreu = false;

        dano = dano - (defesa / 2);
        if (dano < 0){
            dano = 0;
        }

        this.vida = vida - dano;

        if (vida <= 0){
            morreu = true;
            System.out.println("O adversário foi derrotado!");
        }
        return morreu;
    }

    //Função restaurarVida(int vida);
    public void restaurarVida(int valor){
        if (valor <= 0) {
            System.out.println("A vida não pode ser negativa!");
            return;
        }
        this.vida = this.vida + valor;
        if (this.vida >= this.vidaMaxima){
            System.out.println("Vida maxima atingida!");
            this.vida = this.vidaMaxima;
        }
        System.out.println("Vida atual: " + this.vida);
    }

    //Metodo subirDeNivel();
    public void subirDeNivel(){
        this. nivel = this.nivel + 1;
        this.vida = this.vida + 20;
        this.mana = this.mana + 10;
        this.ataque = this.ataque + 5;
        this.defesa = this.defesa + 3;
        System.out.println("O personagem subiu de nível!" + "LVL: " + this.nivel);
        this.experiencia = 0;
    }

    //Metodo ganharXp(int xp);
    public void ganharXp(int xp){
        if (xp <= 0){
            System.out.println("O xp não pode ser menor ou igual a zero!");
            return;
        }
        this.experiencia = experiencia + xp;
        if (this.experiencia >= 100){
            subirDeNivel();
        }
    }

    //Metodo estaVivo();
    public boolean estaVivo(){
        boolean estaVivo = true;
        if (this.vida <= 0){
            estaVivo = false;
        }
        return estaVivo;
    }

    //Metodos Abstratos;
    //Metodo Atacar();
    public abstract void atacar(Personagem alvo);

    //Metodo usarHabilidadeEspecial();
    public abstract void usarHabilidadeEspecial(Personagem alvo);

    //Metodo getTipo();
    public abstract String getTipo();

}


