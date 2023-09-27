package com.fiap.cp2.filme;


import com.fiap.cp2.fichatecnica.DadosFichaTecnica;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastrosFilme(
        @NotBlank
        @NotEmpty
        String titulo,

        @NotBlank
        String atorPrincipal,

        @NotBlank
        @Pattern(regexp = "\\d{2,3}")
        String duracao,

        @NotBlank
        @Pattern(regexp = "\\d{4}")
        String anoLancamento,

        @NotBlank
        String pais,

        @NotBlank
        @NotNull
        Genero genero,
        @NotNull
        @Valid
        DadosFichaTecnica fichaTecnica){
}

