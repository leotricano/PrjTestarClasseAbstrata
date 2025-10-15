<p align="center">
  <img src="https://i.imgur.com/kYn0h0s.png" alt="Java Logo" width="120"/>
</p>

<h1 align="center">PrjTestarClasseAbstrata</h1>

<p align="center">
  Um exercício de Programação Orientada a Objetos com Java, focado em classes abstratas, herança e polimorfismo, desenvolvido para o curso de Back-End do Senac.
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Linguagem-Java-blue?style=for-the-badge&logo=java" alt="Linguagem Java">
  <img src="https://img.shields.io/badge/Curso-Senac-yellow?style=for-the-badge" alt="Curso Senac">
  <img src="https://img.shields.io/badge/Status-Concluído-green?style=for-the-badge" alt="Status Concluído">
</p>

---

## 📝 Sobre o Projeto

O objetivo deste projeto é simular o comportamento de diferentes tipos de navios utilizando uma classe abstrata `Navio` como base. A partir dela, são criadas duas classes concretas: `NavioPassageiro` e `NavioPesqueiro`. Cada uma herda os comportamentos comuns e implementa funcionalidades específicas ao seu contexto.

A classe principal, `TestarClasseAbstrata`, instancia objetos de cada tipo e executa seus métodos para demonstrar os conceitos de POO em ação.

## 🚀 Conceitos Aplicados

Este exercício solidifica os seguintes pilares da Programação Orientada a Objetos:

* **🎨 Abstração:** Uso da classe `Navio.java` para definir um modelo comum com métodos que devem ser obrigatoriamente implementados por suas subclasses.
* **🔗 Herança:** As classes `NavioPassageiro` e `NavioPesqueiro` herdam atributos e comportamentos da superclasse `Navio`.
* **🎭 Polimorfismo:** Sobrescrita dos métodos (`partir()`, `atracar()`, etc.) em cada subclasse para que executem ações específicas.
* **📦 Encapsulamento:** Atributos protegidos com o modificador `private` e acessados de forma controlada através de métodos públicos.
* **🏷️ Enumerações (Enums):** Utilização do `TipoPesca.java` para representar um conjunto fixo e seguro de constantes.

---

## 📂 Estrutura do Projeto

O projeto foi organizado em pacotes para uma melhor separação de responsabilidades e clareza do código.


PrjTestarClasseAbstrata/
└── src/
└── br/
└── senac/
├── classes/
│   └── TestarClasseAbstrata.java      # ▶️ Ponto de entrada da aplicação
├── classes/abstratas/
│   └── Navio.java                     # 🏛️ Superclasse abstrata
├── classes/concretas/
│   ├── NavioPassageiro.java           # 🛳️ Subclasse para navios de passageiros
│   └── NavioPesqueiro.java            # 🎣 Subclasse para navios de pesca
└── classes/tipoPesca/
└── TipoPesca.java                 # 🐠 Enum para os tipos de pesca

---

## ▶️ Como Executar

Para rodar este projeto e ver a simulação em ação, siga os passos abaixo:

1.  **Clone o Repositório:**
    ```bash
    git clone https://[URL-DO-SEU-REPOSITORIO].git
    ```
2.  **Abra na sua IDE:**
    * Importe o projeto em sua IDE Java de preferência (Eclipse, IntelliJ IDEA, VS Code).
3.  **Execute o Ponto de Entrada:**
    * Localize o arquivo `TestarClasseAbstrata.java` no pacote `br.senac.classes`.
    * Execute o método `main()` para iniciar a simulação. O resultado será exibido no console.

---
<p align="center">
  <em>Desenvolvido como atividade do curso de Java Back-End do Senac.</em>
</p>


