# 📖 LogcatButton - Avaliador de Livros

Uma aplicação Android desenvolvida com **Jetpack Compose** que utiliza a metáfora de uma crítica literária para demonstrar o funcionamento dos diferentes níveis de severidade do **Logcat**.

O projeto permite que o usuário insira o nome de um livro e atribua uma nota. Cada avaliação dispara um evento de log específico, facilitando a organização e filtragem de dados no console de diagnóstico do Android Studio.

---

##  Demonstração da Interface

<img width="474" height="916" alt="Captura de tela 2026-04-01 211207" src="https://github.com/user-attachments/assets/85f976ab-c833-4033-8275-93260e3a6fc5" />

---

##  Atos Técnicos (Funcionalidades)

O projeto foca na semântica dos botões e na resposta imediata para o desenvolvedor separar rotinas de falha crítica:

* **Input Dinâmico:** Campo de texto (`TextField`) para identificar a obra (livro).
* **Quatro Níveis de Diagnóstico:**
    * 🔴 **Nota 1 (Error):** Utiliza `Log.e` para falhas críticas ou avaliações negativas.
    * 🟠 **Nota 2 (Warning):** Utiliza `Log.w` para alertas ou avaliações regulares.
    * 🟢 **Nota 3 (Debug):** Utiliza `Log.d` para rotinas de depuração ou avaliações boas.
    * 🔵 **Nota 4 (Info):** Utiliza `Log.i` para informações gerais ou avaliações perfeitas.

---

##  Tecnologias Utilizadas

* **Linguagem:** [Kotlin](https://kotlinlang.org/)
* **UI Framework:** [Jetpack Compose](https://developer.android.com/jetpack/compose)
* **Design System:** Material Design 3 (M3)
* **Ferramenta de Log:** Android Logcat

---

##  Como Executar o Projeto

1. **Clone este repositório:**
   ```bash
   git clone https://github.com/sofismoura/LogcatButton.git
