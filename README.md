# Agenda
## Descrição

Este é um aplicativo Android simples de Agenda desenvolvido para a disciplina de EAM I. O objetivo do projeto é criar um gerenciador de eventos pessoais, permitindo que o usuário adicione, edite, remova e visualize seus compromissos e eventos. O projeto é desenvolvido utilizando **Java** e a **plataforma Android**.

## Funcionalidades

- Adicionar eventos com informações como data, hora, descrição, prioridade e notificação.
- Atualizar eventos já cadastrados.
- Excluir eventos da agenda.
- Visualizar a lista de eventos agendados.
- Notificações para eventos importantes.

## Estrutura do Projeto

A estrutura do projeto é composta por uma classe principal chamada `Agenda`, que contém métodos para gerenciar a lista de eventos, e uma classe `Event` que define a estrutura de um evento. O projeto inclui as seguintes funcionalidades principais:

### Classes

- **Agenda.java**
  - `createEvent()`: Cria um novo evento.
  - `removeEvent()`: Remove um evento existente.
  - `updateEvent()`: Atualiza um evento existente.
  - `getEvent()`: Obtém um evento específico por índice.
  - `readEvents()`: Retorna todos os eventos cadastrados.
  
- **Event.java**
  - Contém os detalhes de um evento (data, hora, descrição, prioridade e notificação).
  
## Como Executar o Projeto

### Pré-requisitos

- Android Studio instalado.
- Conhecimento básico de desenvolvimento Android usando Java.
