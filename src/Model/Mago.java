package Model;

public class Mago extends Personagem{
    public Mago(String nome)
    {
        super(nome, 80, 120, 30, 8);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(getNome() + " Lança uma bola de fogo");
        int custo = 10;
        if (getMana() < custo){
            System.out.println(" Não possui mais mana!!!");
            return;
        }
        int causaDano = (int) (getAtaque() * 1.5);

        setMana(getMana() - custo);

        boolean morto = alvo.receberDano(causaDano);
        int consomeMana = (int) (causaDano - getMana());
        if (morto){
            System.out.println("Alvo derrotado. parabéns acaba de ganhar 50 de experiência");
        }
        ganharXp(50);
        return;
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        String nome = " Meteoro Arcano";
        int custo = 40;
        if (getMana() < custo){
            System.out.println(" Não possui mana o sufuciente");
            return;

        }
        int causaDano = (int) (getAtaque() * 3.0);
        System.out.println(getNome() + " usa " + nome +  " em seu alvo causando " + custo + " de dano!!!");
        setMana(getMana() - custo);

        boolean matou = alvo.receberDano(custo);

        if (matou) {
            ganharXp(50);
        }
    }
    public void regenererMana(int quantidade){
        // getMana extrai o  valor
        int manaAtualizada = quantidade + getManaMaxima();
        if(manaAtualizada > getManaMaxima()) {
            //setMana altera o valor, para ler valor usar get, para alterar setter;
            setMana(getManaMaxima());
            System.out.println("Mana restaurada!!!");
        }else {
            // setter altera o atributo, atualizando o objeto;
            setMana(manaAtualizada);
            System.out.println("Mana regenerada: " + getMana());
        }
    }

    @Override
    public String getTipo() {
        return "Mago ";
    }

    @Override
    public void exibirStatus(){
        System.out.println("=== " + nome + " ===");
        System.out.println("Tipo: " + getTipo());
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Mana: " + mana + "/" + manaMaxima);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("XP: " + experiencia);

    }

}
