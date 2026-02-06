package pe.albrugroup.rrhh_service.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import pe.albrugroup.rrhh_service.entity.Contrato;
import pe.albrugroup.rrhh_service.entity.request.RegistrarContratoRequest;
import pe.albrugroup.rrhh_service.entity.response.ContratoResponse;

@Mapper(componentModel = "spring")
public interface ContratoMapper {

    Contrato toEntity(RegistrarContratoRequest request);
    @Mapping(source = "empleado.id", target = "idEmpleado")
    ContratoResponse toResponse(Contrato entity);
}
