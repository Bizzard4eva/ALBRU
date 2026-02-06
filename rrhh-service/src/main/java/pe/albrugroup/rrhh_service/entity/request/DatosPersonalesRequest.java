package pe.albrugroup.rrhh_service.entity.request;

import lombok.*;
import pe.albrugroup.rrhh_service.entity.enums.Documento;
import pe.albrugroup.rrhh_service.entity.enums.EstadoCivil;
import pe.albrugroup.rrhh_service.entity.enums.Nacionalidad;

import java.time.LocalDate;

@Builder @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class DatosPersonalesRequest {

    // DATOS PERSONALES
    private String nombres;
    private String apellidos;
    private Documento tipoDocumento;
    private String numeroDocumento;
    private Nacionalidad nacionalidad;
    private LocalDate fechaNacimiento;
    private EstadoCivil estadoCivil;
    private boolean tieneHijos;
}
