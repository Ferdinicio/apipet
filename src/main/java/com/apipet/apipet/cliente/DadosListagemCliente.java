package com.apipet.apipet.cliente;

public record DadosListagemCliente(String nome, String email, String telefone) {

    public DadosListagemCliente(Cliente cliente) {
        this(cliente.getNome(), cliente.getEmail(), cliente.getTelefone());
    }

}
