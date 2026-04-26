import Model.*;
import System.*;

import java.util.ArrayList;

public class Main {

    //Medoto exibirPersonagens();
    public static void exibirPersonagens(ArrayList<Personagem> personagens){
        for (Personagem p : personagens){
            p.exibirStatus();
        }
    }

    public static void main(String[] agrs){

        //Criação dos personagens;
        Guerreiro p1 = new Guerreiro("Gundyr");
        Mago p2 = new Mago("Azrael");
        Arqueiro p3 = new Arqueiro("Ziro");

        //Teste de habilidades do arqueiro;
        p3.atacar(p1);
        p3.atacar(p2);
        p3.atacar(p2);
        p3.atacar(p2);

        p3.recarregarFlechas(-5);
        p3.recarregarFlechas(5);

        p3.usarHabilidadeEspecial(p1);
        p3.usarHabilidadeEspecial(p1);
        p3.usarHabilidadeEspecial(p1);
        p3.usarHabilidadeEspecial(p1);
        p3.usarHabilidadeEspecial(p1);
        p3.usarHabilidadeEspecial(p1);
        p3.usarHabilidadeEspecial(p1);

        p3.exibirStatus();

        //Testes de habilidade do guerreiro;
        p1.atacar(p3);
        p1.atacar(p3);

        p1.usarHabilidadeEspecial(p3);

        //Teste de habilidade do Mago;

        p2.atacar(p1);
        p2.atacar(p1);

        p2.usarHabilidadeEspecial(p1);
        p2.usarHabilidadeEspecial(p1);
        p2.usarHabilidadeEspecial(p1);
        p2.usarHabilidadeEspecial(p1);

        p2.exibirStatus();
        p2.regenererMana(80);
        p2.exibirStatus();

        //Batalha individual entre um arqueiro e um mago;
        Arqueiro a1 = new Arqueiro("Ralof");
        Mago m1 = new Mago("Astrid");

        Arena arena = new Arena();

        arena.batalhar(a1, m1);

        //Teste do torneio;
        //Criação dos personagens do torneio;
        Guerreiro g9 = new Guerreiro("Zof");
        Guerreiro g10 = new Guerreiro("Baul");
        Arqueiro a9 = new Arqueiro("Moreaul");
        Arqueiro a10 = new Arqueiro("Sygard");

        ArrayList<Personagem> participantes = new ArrayList<>();
        participantes.add(g9);
        participantes.add(g10);
        participantes.add(a9);
        participantes.add(a10);

        arena.torneio(participantes);

    }
}
