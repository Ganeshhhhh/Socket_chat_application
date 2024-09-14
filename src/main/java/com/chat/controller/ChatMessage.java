package com.chat.controller;

public class ChatMessage {
    private MessageType type;
    private String content;
    private String sender;

    // Default constructor
    public ChatMessage() {
    }

    // Private constructor to enforce the use of the builder
    private ChatMessage(Builder builder) {
        this.type = builder.type;
        this.content = builder.content;
        this.sender = builder.sender;
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    // Static inner Builder class
    public static class Builder {
        private MessageType type;
        private String content;
        private String sender;

        public Builder() {}

        public Builder type(MessageType type) {
            this.type = type;
            return this;
        }

        public Builder content(String content) {
            this.content = content;
            return this;
        }

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public ChatMessage build() {
            return new ChatMessage(this);
        }
    }
}
