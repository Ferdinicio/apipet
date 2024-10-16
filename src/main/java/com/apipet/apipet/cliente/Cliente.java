package com.apipet.apipet.cliente;
import com.apipet.apipet.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String email;
        private String telefone;

        @Embedded
        private Endereco endereco;

        public Cliente(DadosCadastroCliente dados) {
            this.nome = dados.nome();
            this.email = dados.email();
            this.telefone = dados.telefone();
            this.endereco = new Endereco(dados.endereco());
        }
    }

