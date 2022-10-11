package com.shakir.userauth.email;

public interface EmailSender {
    void send(String to, String email);
}
