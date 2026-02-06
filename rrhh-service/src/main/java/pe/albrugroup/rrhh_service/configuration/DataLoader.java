package pe.albrugroup.rrhh_service.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.albrugroup.rrhh_service.entity.Empleado;
import pe.albrugroup.rrhh_service.entity.enums.*;
import pe.albrugroup.rrhh_service.entity.request.RegistrarEmpleadoRequest;
import pe.albrugroup.rrhh_service.repository.EmpleadoRepository;
import pe.albrugroup.rrhh_service.service.EmpleadoService;

import java.time.LocalDate;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataLoader implements CommandLineRunner {

    private final EmpleadoRepository empleadoRepository;
    private final EmpleadoService empleadoService;

    @Override
    public void run(String... args) throws Exception {
        if(empleadoRepository.count() == 0) { crearEmpleados(); }
    }

    private void crearEmpleados() {
        RegistrarEmpleadoRequest e1 = RegistrarEmpleadoRequest.builder()
                .nombres("Julio Edinson")
                .apellidos("Vitterio Bernuy")
                .tipoDocumento(Documento.DNI)
                .numeroDocumento("75413802")
                .nacionalidad(Nacionalidad.PERUANO)
                .fechaNacimiento(LocalDate.of(1999,3,6))
                .estadoCivil(EstadoCivil.SOLTERO)
                .tieneHijos(false)
                .celularPersonal("943763301")
                .celularCorporativo("943763301")
                .correo("jevbxx@gmail.com")
                .distrito(Distrito.SAN_MARTÍN_DE_PORRES)
                .direccion("Fermin Tanguis 079")
                .banco(Banco.BCP)
                .cuentaBancaria("12344677890")
                .cuentaInterbancaria("09876543234343")
                .build();
        RegistrarEmpleadoRequest e2 = e1.toBuilder()
                .nombres("Leslie Khaterine")
                .apellidos("Linare Castellano")
                .numeroDocumento("65413802")
                .celularPersonal("943763302")
                .correo("leslie@gmail.com")
                .tieneHijos(true)
                .build();
        RegistrarEmpleadoRequest e3 = e1.toBuilder()
                .nombres("Grace Kelly")
                .apellidos("Cjuno Palacions")
                .numeroDocumento("55413802")
                .celularPersonal("943763303")
                .correo("grace@gmail.com")
                .tieneHijos(false)
                .build();

        empleadoService.registrarEmpleados(List.of(e1, e2, e3));
    }
}
