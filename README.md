# API de Busca de Jogos (2023)

## Descrição do Projeto

### Objetivo
- Este projeto tem como objetivo criar uma API que busca os jogos mais famosos lançados em 2023, tranzendo uma lista contendo várias informações sobre cada jogo.

## Tecnologia Empregada

### Linguagem de Programação
- A linguagem de programação utilizada foi o Java. O motivo de escolha se deu pois é uma linguagem orientada a objeto, o qual era um dos requisitos, e também pois é uma linguagem de simples desenvolvimento de APIs

### Frameworks e Bibliotecas
- Springboot 
  - O Springboot foi utilizado para programar e hospedar localmente o servidor que receberiam as requisições do usuário. Assim como também foi utulizado as bibliotecas 
- Postman: Utilizado para realizar os métodos GET,SET,DELETE e PUT

### Armazenamento de Dados
- Armazenamento local, utilizado apenas para testes.

## Descrição da Arquitetura

### Arquitetura Geral
A aplicação segue uma arquitetura baseada em microsserviços para garantir escalabilidade e modularidade.


### Fluxo de Dados
Os dados fluem desde a requisição até a base onde estão salvos os registros, os quais retornam o que foi pesquisado pelo usuário.

## Funcionalidade

### Busca de Jogos
- `GET /games`: Retorna uma lista de jogos lançados em 2023.

## Documentação

### Endpoints
- `/jogos`: Listagem de jogos
  
## Inovação e Criatividade

###Recursos Inovadores

- Criatividade na Implementação

