package com.fiap.cp2.fichatecnica;

import jakarta.validation.constraints.NotBlank;

public record DadosFichaTecnica(
        @NotBlank
        String genero,

        @NotBlank
        String direcao,

        @NotBlank
        String elenco,

        @NotBlank
        String roteiro,

        String classificacaoIndic,

        @NotBlank
        String producao
) {
}
