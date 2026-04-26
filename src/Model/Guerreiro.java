package Model;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 150, 150, 30);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(this.nome + " Ataque Cortante Deus da Lamina!");

        int dano = (int) (this.ataque * 1.2);

        boolean matou = alvo.receberDano(dano);

        if (matou) {
            System.out.println(this.nome + " derrotou " + alvo.getNome() + "!");
            this.ganharXp(50);
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        String habilidade = "Investida Furiosa";
        int custoMana = 20;

        if (this.mana < custoMana) {
            System.out.println(this.nome + " tentou usar " + habilidade + ", mas não tem mana suficiente!");
            return;
        }

        System.out.println(this.nome + " usa " + habilidade + " e avança como um touro enfurecido!");

        int dano = (int) (this.ataque * 2.5);

        alvo.receberDano(dano);

        this.mana -= custoMana;
    }

    @Override
    public String getTipo() {
        return "Guerreiro";
    }

    @Override
    public void exibirStatus() {
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