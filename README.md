# 🌱 Projeto Spring Boot - Sistemas Corporativos

Este é um projeto simples desenvolvido como parte da disciplina **Sistemas Corporativos**, com o objetivo de introduzir os conceitos básicos do **Spring Boot** e da criação de **endpoints REST**.

---

## 🚀 Tecnologias Utilizadas
- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Maven**

---

## 📁 Estrutura do Projeto
O projeto possui dois endpoints principais implementados em um **Controller** simples:

### `/hello-world`
- **Método:** `GET`
- **Descrição:** Retorna uma mensagem de saudação padrão.
- **Exemplo de resposta:**
  ```json
  {
    "message": "Hello, World!"
  }

  ```

### `/message`
- **Método:** `GET`
- **Descrição:** Retorna uma mensagem personalizada com nome passado no service
- **Exemplo de resposta:**
  ```json
  {
    "message": "Olá, aluna(o)Karen Dantas!"
  }

  ```

## ⚙️ Como Executar o Projeto
#### Pré-requisitos

1. Ter o Java JDK 17+ instalado
2. Ter o Maven configurado no ambiente

Passos para execução

- Clone este repositório:
```
git clone https://github.com/seu-usuario/seu-repositorio.git
```

- Acesse o diretório do projeto:
  
```
cd nome-do-projeto
```

- Execute o projeto com:
```
mvn spring-boot:run
```

- Acesse no navegador:
```
http://localhost:8080/hello
http://localhost:8080/message
```
