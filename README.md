# Caso - Tienda Online (e-shop)
###### Estudiantes: David Baez - Emilio Jaramillo
***
### Objetivo:

Desarrollar un diagrama de clases UML para un sistema de compras en línea, representando los elementos del dominio del problema y las relaciones entre ellos.

### Contexto:

El sistema de compras en línea debe modelar los siguientes elementos:

1. **Cliente**: Cada cliente está vinculado a una cuenta específica y puede registrarse como usuario web para realizar compras en línea. Un cliente puede hacer compras sin ser usuario web, a través de otros medios como teléfono o pedidos por catálogo.

2. **Cuenta**: Cada cuenta está asociada con un cliente. Una cuenta también incluye los pedidos realizados por el cliente. Además, una cuenta está asociada a un carrito de compras y a varios métodos de pago.

3. **Usuario Web**: El cliente puede registrarse como usuario web. El usuario puede estar en uno de los siguientes estados: `Nuevo`, `Activo`, `Bloqueado Temporalmente`, o `Prohibido`. El usuario web está vinculado a un carrito de compras.

4. **Carrito de Compras**: Cada cuenta tiene un único carrito de compras asociado. El carrito puede contener varios productos de diferentes familias de productos.

5. **Pedido**: Un cliente puede tener varios pedidos, aunque también es posible que no tenga ninguno. Cada pedido tiene un estado que puede ser `Nuevo`, `Creado`, `Despachado`, `Recibido` o `Cerrado`. Los pedidos están relacionados con familias de productos y con métodos de pago.

6. **Producto y Familia de Productos**: Cada producto puede estar asociado a una o varias familias de productos, o a ninguna.

7. **Medio de Pago**: Un pedido puede tener asociado uno o varios medios de pago. Cada medio de pago está relacionado con una única cuenta.
