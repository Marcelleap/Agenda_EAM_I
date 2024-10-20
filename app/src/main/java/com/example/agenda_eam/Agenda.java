package com.example.agenda_eam;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Event> events; // Lista de eventos
    private int eventCount;           // Contador de eventos

    // Construtor
    public Agenda() {
        this.events = new ArrayList<>();
        this.eventCount = 0; // Inicializa o contador
    }

    // Método para criar um evento
    public void createEvent(String date, String time, String description, int priority, boolean notification) {
        Event newEvent = new Event(date, time, description, priority, notification);
        events.add(newEvent);
        eventCount++; // Incrementa o contador
    }

    // Método para remover um evento
    public void removeEvent(int index) {
        if (index >= 0 && index < eventCount) {
            events.remove(index);
            eventCount--; // Decrementa o contador
        } else {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
    }

    // Método para obter um evento
    public Event getEvent(int index) {
        if (index >= 0 && index < eventCount) {
            return events.get(index);
        } else {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
    }

    // Método para atualizar um evento
    public void updateEvent(int index, String date, String time, String description, int priority, boolean notification) {
        if (index >= 0 && index < eventCount) {
            Event updatedEvent = new Event(date, time, description, priority, notification);
            events.set(index, updatedEvent);
        } else {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
    }

    // Método para ler todos os eventos
    public ArrayList<Event> readEvents() {
        return events;
    }

    // Método para obter o contador de eventos
    public int getEventCount() {
        return eventCount;
    }
}
