package pe.albrugroup.rrhh_service.entity.request;

import lombok.*;
import pe.albrugroup.rrhh_service.entity.enums.Banco;

@Builder @Getter @Setter
@AllArgsConstructor @NoArgsConstructor
public class DatosFinancierosRequest {

    // INFORMACION FINANCIERA
    private Banco banco;
    private String cuentaBancaria;
    private String cuentaInterbancaria;
}
