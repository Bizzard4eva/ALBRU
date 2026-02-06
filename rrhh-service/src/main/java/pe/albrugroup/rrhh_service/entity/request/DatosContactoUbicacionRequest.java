package pe.albrugroup.rrhh_service.entity.request;

import lombok.*;
import pe.albrugroup.rrhh_service.entity.enums.Distrito;

@Builder @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class DatosContactoUbicacionRequest {

    // CONTACTO
    private String celularPersonal;
    private String celularCorporativo;
    private String correo;
    // UBICACION
    private Distrito distrito;
    private String direccion;
}
