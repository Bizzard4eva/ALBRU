package pe.albrugroup.rrhh_service.entity;

import jakarta.persistence.*;
import lombok.*;
import pe.albrugroup.rrhh_service.entity.enums.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
public class Empleado {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // RELACIONES
    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Contrato> contratos = new ArrayList<>();
    @OneToMany(mappedBy = "empleado", fetch = FetchType.LAZY)
    @Builder.Default
    private List<Pago> pagos = new ArrayList<>();
    // DATOS PERSONALES
    private String nombres;
    private String apellidos;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento", nullable = false)
    private Documento tipoDocumento;
    @Column(name = "numero_documento", unique = true, nullable = false)
    private String numeroDocumento;
    @Enumerated(EnumType.STRING)
    private Nacionalidad nacionalidad;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_civil", nullable = false)
    private EstadoCivil estadoCivil;
    private boolean tieneHijos;
    // CONTACTO
    @Column(name = "celular_personal", nullable = false)
    private String celularPersonal;
    @Column(name = "celular_corporativo", nullable = true)
    private String celularCorporativo;
    private String correo;
    // UBICACION
    @Enumerated(EnumType.STRING)
    private Distrito distrito;
    private String direccion;
    // INFORMACION FINANCIERA
    @Enumerated(EnumType.STRING)
    private Banco banco;
    @Column(name = "cuenta_bancaria", nullable = false)
    private String cuentaBancaria;
    @Column(name = "cuenta_interbancaria", nullable = false)
    private String cuentaInterbancaria;
    // ESTADO OPERATIVO
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_operativo", nullable = false)
    private EstadoOperativo estadoOperativo;
}
