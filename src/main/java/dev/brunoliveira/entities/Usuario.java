package dev.brunoliveira.entities;

public class Usuario {

    String username;
    String email;


    public Usuario(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (!getUsername().equals(usuario.getUsername())) return false;
        return getEmail() != null ? getEmail().equals(usuario.getEmail()) : usuario.getEmail() == null;
    }

    @Override
    public int hashCode() {
        int result = getUsername().hashCode();
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        return result;
    }
}

