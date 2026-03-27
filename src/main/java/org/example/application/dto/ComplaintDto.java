package org.example.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComplaintDto {
    @NotNull(message = "La identificación del usuario es obligatoria")
    private Long userIdentification;
    @NotNull
    @NotBlank
    @Size(max = 50, message = "Máximo 50 characters permitidos")
    private String complaintType;
    @NotNull
    @NotBlank
    @Pattern(regexp = "^[A-Za-zÁÉÍÓÚáéíóúÑñ\\s]+$", message = "Solo se permiten letras")
    @Size(max = 255, message = "Máximo 255 caracteres permitidos")
    private String detail;
}
