# Proyecto-relaciones-DDBB
Relación entre las Entidades

@OneToOne (Direccion - Empleado)
Cada Empleado tiene una única Direccion, y cada Direccion pertenece a un único Empleado.

@ManyToOne (Empleado - Departamento)
Cada Empleado pertenece a un único Departamento, pero un Departamento puede tener muchos Empleados.

@OneToMany (Departamento - Empleado)
Un Departamento puede tener muchos Empleados, pero un Empleado solo puede pertenecer a un único Departamento.

@ManyToMany (Empleado - Proyecto)
Un Empleado puede trabajar en múltiples Proyectos, y un Proyecto puede tener múltiples Empleados trabajando en él.
