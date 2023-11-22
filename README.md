# API de Busca de Jogos (2023)

## Descrição do Projeto

### Objetivo
- Este projeto tem como objetivo criar uma API que busca os jogos mais famosos lançados em 2023, tranzendo uma lista contendo várias informações sobre cada jogo.

## Tecnologia Empregada

### Linguagem de Programação
- A linguagem de programação utilizada foi o Java. A escolha dessa linguagem se deu por ela ser orientada a objeto, o qual era um dos requisitos, e também pois é uma linguagem de simples desenvolvimento de APIs.

### Frameworks e Bibliotecas
- Springboot 
  - O Springboot foi utilizado para programar e hospedar localmente o servidor que receberiam as requisições do usuário. As dependências utilizadas no projeto podem ser observadas no arquivo `pom.xml` presente na pasta do projeto.
- Postman: Utilizado para realizar as requisições ao servidor local através dos métodos: GET,SET,DELETE e PUT.

### Armazenamento de Dados
- Armazenamento local, utilizado apenas para testes.

## Base de dados
- A base utilizada no projeto está disponível no arquivo `Games.Json`.
  - Nessa base, é possível visualizar o objeto `Games` e seus atributos, são eles:
    - #### ID: Identificação única autogerada pelo código - int;
    - #### Nome: Nome do jogo - string;
    - #### Data de lançamento: Data de lançamento do jogo - string (como será usuada apenas para exibição, foi escolhido o tipo string para esse atributo);
    - #### Desenvolverdor: Empresa que desenvolveu o jogo - string;
    - #### Duração: Duração média para finalização do jogo - int;
    - #### Nota: Nota do Metacritic - int;

## Descrição da Arquitetura

### Arquitetura Geral
A aplicação segue uma arquitetura baseada em microsserviços para garantir escalabilidade e modularidade.

### Fluxo de Dados
Os dados fluem desde a requisição até a base onde estão salvos os registros, os quais retornam o que foi pesquisado pelo usuário.

<img width="799" alt="Desenho3" src="https://github.com/hendo007/Projeto-3-POO/assets/82677913/d191a138-9688-4ae9-97fc-d39e56808a70">

## Funcionalidade

### Busca de Jogos
- `GET /games`: Retorna uma lista de jogos lançados em 2023.
- `PUT /games`: Alterna um registro já existente na base, passando seu id.
- `SET /games`: Insere um novo registro na base de dados.
- `DELETE /games`: Deleta um registro da base de dados.
  
## Inovação e Criatividade

###Recursos Inovadores

- Criatividade na Implementação.
- Criatividade do tema.
- Tratamento de exceções (é possível mapear as exceções e inserir no código disponível no repositório)

