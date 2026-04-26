package Model;

public class Arqueiro extends Personagem{
    private int flechas;

    //Construtor;
    public Arqueiro(String nome) {
        super(nome, 100, 50,28, 12);
        setFlechas(30);
    }

    //Getter e setter das flechas;
    public int getFlechas() {
        return flechas;
    }

    public void setFlechas(int flechas) {
        this.flechas = flechas;
    }

    //Implementação dos métodos abstratos da classe pai Personagem;
    @Override
    public void exibirStatus() {
        System.out.println("==================ARQUEIRO " + this.nome + "==================");
        System.out.println("Vida. " + this.vida + "/" + this.vidaMaxima);
        System.out.println("Mana. " + this.mana  + "/" + manaMaxima);
        System.out.println("Ataque. " + this.ataque);
        System.out.println("Defesa. " + this.defesa);
        System.out.println("Flechas. " + this.flechas);
        System.out.println("==============================================================");
    }

    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0){
            System.out.println(getNome() + " Dispara uma flecha certeira!");

            int dano = (int) (this.ataque * 1.3);
            this.flechas -= 1;
            alvo.receberDano(dano);

            if(!alvo.estaVivo()){
                System.out.println("O inimigo morreu. XP +50");
                ganharXp(50);
            }
        }else{
            System.out.println("Você não tem flechas!");
            return;
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {

        if (flechas > 4){
            System.out.println(getNome() + " Dispara cinco flechas flamejantes!");

            int dano = this.ataque * 2;
            this.mana -= 15;
            this.flechas -= 5;
            alvo.receberDano(dano);

            if(!alvo.estaVivo()){
                System.out.println("O inimigo morreu. XP +50");
                ganharXp(50);
            }
        }else{
            System.out.println("Você não tem flechas!");
            return;
        }
    }

    @Override
    public String getTipo() {
        return "Arqueiro";
    }

    //Método recarregarFlechar() esclusivo da classe Arqueiro;
    public void recarregarFlechas(int quantidadeFlechas){
        if(quantidadeFlechas <= 0){
            System.out.println("Adicione uma quantidade de flechas válida!");
            return;
        }
        this.flechas += quantidadeFlechas;
        System.out.println(quantidadeFlechas + " Flechas adicionadas ao inventário!");
        System.out.println("Quantidade total de flechas: " + this.flechas);
    }
}
