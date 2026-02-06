package pe.albrugroup.rrhh_service.entity.request;

import lombok.*;
import pe.albrugroup.rrhh_service.entity.enums.*;

import java.time.LocalDate;

@Builder @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class RegistrarEmpleadoRequest {

    // DATOS PERSONALES
    private String nombres;
    private String apellidos;
    private Documento tipoDocumento;
    private String numeroDocumento;
    private Nacionalidad nacionalidad;
    private LocalDate fechaNacimiento;
    private EstadoCivil estadoCivil;
    private boolean tieneHijos;
    // CONTACTO
    private String celularPersonal;
    private String celularCorporativo;
    private String correo;
    // UBICACION
    private Distrito distrito;
    private String direccion;
    // INFORMACION FINANCIERA
    private Banco banco;
    private String cuentaBancaria;
    private String cuentaInterbancaria;
}
