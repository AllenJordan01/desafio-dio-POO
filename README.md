# Projeto Bootcamp Java

Este projeto demonstra um modelo básico de um **Bootcamp**, incluindo **cursos**, **mentorias** e **desenvolvedores (Devs)**.  
Ele utiliza classes simples para representar os principais elementos de um sistema educacional.

## 📌 Estrutura do Projeto

O projeto contém as seguintes classes:

### **1. Bootcamp**
Representa um bootcamp que possui:
- Nome
- Descrição
- Coleção de conteúdos (Cursos e Mentorias)
- Devs inscritos

### **2. Dev**
Representa um desenvolvedor participante do bootcamp.  
Possui:
- Nome
- Conteúdos inscritos
- Conteúdos concluídos  
  Também inclui a lógica de progresso.

### **3. Conteudo**
Classe abstrata que representa um conteúdo genérico.  
É estendida por *Curso* e *Mentoria*.  
Possui:
- Título
- Descrição
- Cálculo do XP

### **4. Curso**
Tipo de conteúdo que possui:
- Carga horária
- XP baseado nas horas do curso.

### **5. Mentoria**
Tipo de conteúdo que possui:
- Data da mentoria
- XP fixo.

## 🚀 Objetivo

O projeto tem como objetivo praticar:
- Programação orientada a objetos (POO)
- Herança
- Polimorfismo
- Abstração
- Encapsulamento

## ▶️ Como executar

1. Importe o projeto em sua IDE Java (IntelliJ, Eclipse, VS Code etc.).
2. Certifique-se de ter o **Java 11+** instalado.
3. Execute a classe principal (`Main` ou equivalente) para simular a inscrição de devs e o progresso no bootcamp.
