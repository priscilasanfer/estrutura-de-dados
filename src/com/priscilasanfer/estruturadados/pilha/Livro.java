package com.priscilasanfer.estruturadados.pilha;

import java.util.Objects;

public class Livro {
    private String nome, isbn, anoDeLancamento, autor;

    public Livro(String nome, String isbn, String anoDeLancamento, String autor) {
        this.nome = nome;
        this.isbn = isbn;
        this.anoDeLancamento = anoDeLancamento;
        this.autor = autor;
    }

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(String anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anoDeLancamento='" + anoDeLancamento + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) &&
                isbn.equals(livro.isbn) &&
                anoDeLancamento.equals(livro.anoDeLancamento) &&
                autor.equals(livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, isbn, anoDeLancamento, autor);
    }
}
