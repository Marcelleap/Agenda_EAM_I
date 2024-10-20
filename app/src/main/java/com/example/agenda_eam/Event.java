package com.example.agenda_eam;

public class Event {

        private String date;          // Data do evento
        private String time;          // Hora do evento
        private String description;    // Descrição do evento
        private int priority;          // Prioridade do evento
        private boolean notification;   // Notificação ativada

        // Construtor
        public Event(String date, String time, String description, int priority, boolean notification) {
            this.date = date;
            this.time = time;
            this.description = description;
            this.priority = priority;
            this.notification = notification;
        }

        // Getters
        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public String getDescription() {
            return description;
        }

        public int getPriority() {
            return priority;
        }

        public boolean isNotification() {
            return notification;
        }

        // Setters
        public void setDate(String date) {
            this.date = date;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public void setNotification(boolean notification) {
            this.notification = notification;
        }
}
