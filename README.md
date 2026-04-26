# 🎮 Legends of Java - Sistema de RPG

## 📋 Descrição do Projeto

O **Legends of Java** é um sistema de RPG desenvolvido em Java com o objetivo de aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**. O projeto simula personagens com diferentes classes que podem batalhar, evoluir e utilizar habilidades especiais.

Este projeto foi desenvolvido como exercício prático para consolidar conhecimentos em:

* Classes e Objetos
* Encapsulamento
* Herança
* Polimorfismo
* Classes Abstratas
* Métodos Abstratos
* Sobrescrita de Métodos

---

## 🏗️ Estrutura do Projeto

```
src/
└── br/
    └── com/
        └── rpg/
            ├── modelo/
            │   ├── Personagem.java
            │   ├── Guerreiro.java
            │   ├── Mago.java
            │   └── Arqueiro.java
            ├── sistema/
            │   └── Arena.java
            └── principal/
                └── JogoRPG.java
```

---

## 🧙 Classes do Sistema

### 🔹 Personagem (Classe Abstrata)

Classe base que define atributos e comportamentos comuns a todos os personagens.

**Atributos principais:**

* nome, nível, vida, mana
* ataque, defesa
* experiência

**Métodos importantes:**

* `exibirStatus()`
* `receberDano(int dano)`
* `curar(int quantidade)`
* `ganharExperiencia(int exp)`
* `subirNivel()`
* `estaVivo()`

**Métodos abstratos:**

* `atacar(Personagem alvo)`
* `usarHabilidadeEspecial(Personagem alvo)`
* `getTipo()`

---

### ⚔️ Guerreiro

Personagem focado em força e resistência.

* Alto HP e defesa
* Ataques físicos fortes
* Habilidade: **Investida Furiosa**

---

### 🔮 Mago

Especialista em dano mágico.

* Alto mana
* Baixa defesa
* Habilidade: **Meteoro Arcano**
* Método exclusivo: `regenerarMana()`

---

### 🏹 Arqueiro

Personagem equilibrado com ataques à distância.

* Usa flechas como recurso
* Habilidade: **Chuva de Flechas**
* Método exclusivo: `recarregarFlechas()`

---

## ⚔️ Sistema de Batalha

### Classe Arena

#### 🔹 batalhar(Personagem p1, Personagem p2)

* Simula combate entre dois personagens
* Executa turnos alternados
* Declara o vencedor

#### 🔹 torneio(ArrayList<Personagem> participantes)

* Sistema eliminatório
* Remove perdedores
* Cura vencedores
* Declara o campeão final

---

## 🎮 Funcionalidades

✅ Sistema completo de combate
✅ Habilidades especiais únicas
✅ Sistema de experiência e level up
✅ Gerenciamento de recursos (vida, mana, flechas)
✅ Polimorfismo com lista de personagens
✅ Torneio entre múltiplos jogadores

---

## 🚀 Como Executar

### ✔️ Pré-requisitos

* Java JDK 8 ou superior
* IDE (Eclipse, IntelliJ, VS Code) ou terminal

### ✔️ Passos

1. Clone o repositório:

```
git clone <seu-repositorio>
```

2. Acesse a pasta do projeto:

```
cd LegendsOfJava
```

3. Compile os arquivos:

```
javac br/com/rpg/principal/JogoRPG.java
```

4. Execute o programa:

```
java br.com.rpg.principal.JogoRPG
```

---

## 🧪 Demonstrações Implementadas

* Criação de personagens
* Exibição de status
* Uso de habilidades especiais
* Sistema de experiência e evolução
* Batalha individual
* Torneio final

---

## 💡 Conceitos Aplicados

### 🔸 Herança

Reutilização de código através da classe `Personagem`.

### 🔸 Polimorfismo

Uso de `ArrayList<Personagem>` para manipular diferentes tipos de personagens.

### 🔸 Encapsulamento

Proteção dos atributos com modificadores de acesso.

### 🔸 Abstração

Definição de comportamentos comuns e obrigatórios.

## 📌 Melhorias Futuras

* Interface gráfica (JavaFX ou Swing)
* Sistema de inventário
* Novas classes (Paladino, Assassino, etc.)
* Sistema de habilidades evolutivas
* Multiplayer

---

## 👨‍💻 Autor

Desenvolvido por:
* Bruno Alves Ribeiro de Souza - 42276047
* Gustavo do Carmo Germano - 47880287
* Lucas Felix Romero - 41969286
* Victor Gabriel Alves - 45620105
* 

---

## 📄 Licença

Este projeto é apenas para fins educacionais.

---

## ⚔️ Mensagem Final

> "Que seus métodos sejam eficientes e seus bugs sejam derrotados como inimigos em batalha!"

---
