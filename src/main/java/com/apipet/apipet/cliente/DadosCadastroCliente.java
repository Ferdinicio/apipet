package com.apipet.apipet.cliente;

import com.apipet.apipet.endereco.DadosEndereco;

public record DadosCadastroCliente(String nome, String email, String telefone, DadosEndereco endereco) {
}
