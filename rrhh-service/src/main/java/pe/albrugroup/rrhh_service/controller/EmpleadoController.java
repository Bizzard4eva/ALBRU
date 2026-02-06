package pe.albrugroup.rrhh_service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.albrugroup.rrhh_service.entity.request.DatosContactoUbicacionRequest;
import pe.albrugroup.rrhh_service.entity.request.DatosFinancierosRequest;
import pe.albrugroup.rrhh_service.entity.request.DatosPersonalesRequest;
import pe.albrugroup.rrhh_service.entity.request.RegistrarEmpleadoRequest;
import pe.albrugroup.rrhh_service.entity.response.EmpleadoResponse;
import pe.albrugroup.rrhh_service.usecase.IEmpleado;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/empleados")
public class EmpleadoController {

    private final IEmpleado empleadoService;

    @GetMapping
    public ResponseEntity<List<EmpleadoResponse>> listarEmpleados() {
        return ResponseEntity.ok(empleadoService.getEmpleados());
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoResponse> getEmpleadoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(empleadoService.getEmpleado(id));
    }
    @PostMapping
    public ResponseEntity<EmpleadoResponse> registrarEmpleado(@RequestBody RegistrarEmpleadoRequest request) {
        var empleado = empleadoService.registrarEmpleado(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(empleado);
    }
    @PatchMapping("/{id}/datos-personales")
    public ResponseEntity<EmpleadoResponse> actulizarDatosPersonales(@RequestBody DatosPersonalesRequest request,
                                                                     @PathVariable Long id) {
        var empleado = empleadoService.actualizarDatosPersonales(id, request);
        return ResponseEntity.ok(empleado);
    }
    @PatchMapping("/{id}/datos-contacto-ubicacion")
    public ResponseEntity<EmpleadoResponse> actulizarDatosContactoUbicacion(@RequestBody DatosContactoUbicacionRequest request,
                                                                            @PathVariable Long id) {
        var empleado = empleadoService.actualizarContactoUbicacion(id, request);
        return ResponseEntity.ok(empleado);
    }
    @PatchMapping("/{id}/datos-financieros")
    public ResponseEntity<EmpleadoResponse> actualizarDatosFinancieros(@RequestBody DatosFinancierosRequest request,
                                                                       @PathVariable Long id) {
        var empleado = empleadoService.actualizarDatosFinancieros(id, request);
        return ResponseEntity.ok(empleado);
    }
    @PatchMapping("/{id}/cesar-empleado")
    public ResponseEntity<Void> cambiarEstadoOperativo(@PathVariable Long id) {
        empleadoService.cambiarEstadoOperativo(id);
        return ResponseEntity.noContent().build();
    }

}
