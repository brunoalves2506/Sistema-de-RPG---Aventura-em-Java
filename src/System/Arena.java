package System;

import Model.Personagem;

import java.util.ArrayList;

public class Arena {

    public void batalhar(Personagem p1, Personagem p2) {

        System.out.println("A Batalha entre " + p1.getNome() + " e " + p2.getNome() + " vai iniciar!");

        while(true){
            p1.exibirStatus();
            p2.exibirStatus();
            p1.atacar(p2);
            if(!p2.estaVivo()){
                System.out.println(p2.getNome() + " morreu. " + p1.getNome() + "Venceu a batalha.");
                break;
            }else{
                p1.exibirStatus();
                p2.exibirStatus();
                p2.atacar(p1);
                if(!p1.estaVivo()){
                    System.out.println(p1.getNome() + " morreu. " + p2.getNome() + " Venceu a batalha.");
                    break;
                }
            }
        }

    }

    public void torneio(ArrayList<Personagem> participantes){
        System.out.println("======O TORNEIO VAI INICIAR======");
        while(participantes.size()>=2){
            batalhar(participantes.get(0), participantes.get(1));

            if(!participantes.get(0).estaVivo()){
                participantes.remove(0);
            }else{
                participantes.remove(1);
            }
        }
        System.out.println("O vencedor é: " + participantes.get(0).getNome());
        return;
    }

}
