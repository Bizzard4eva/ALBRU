package pe.albrugroup.rrhh_service.entity.request;

import lombok.*;
import pe.albrugroup.rrhh_service.entity.enums.Modalidad;
import pe.albrugroup.rrhh_service.entity.enums.PuestoTrabajo;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class RegistrarContratoRequest {

    // PUESTO DE TRABAJO
    private PuestoTrabajo puestoTrabajo;
    private Modalidad modalidad;
    private BigDecimal sueldoBase;
    // VIGENCIA
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
}
