 NiceStart – Aplicación Android










 Introducción

NiceStart es una aplicación móvil desarrollada con Android Studio utilizando Java, Material Components, ConstraintLayout y animaciones con Lottie.
El proyecto muestra una experiencia moderna de login, registro, pantallas iniciales y un sistema visual fluido.

 Diseñada para practicar interfaces reales, navegación y animaciones profesionales.

 Estructura del Proyecto
app/
 ├── java/com/example/nicestart/
 │      ├── MainActivity.java
 │      ├── Login.java
 │      ├── Signup.java
 │      ├── Profile.java
 │      └── MenuOptions.java
 ├── res/
 │      ├── layout/
 │      │      ├── activity_main.xml
 │      │      ├── activity_login.xml
 │      │      ├── activity_signup.xml
 │      │      └── activity_profile.xml
 │      ├── drawable/
 │      ├── mipmap/
 │      ├── raw/
 │      │      └── icono.json   ← animación Lottie
 │      └── values/
 ├── AndroidManifest.xml
 └── README.md

 Interfaces de la App
 1. Pantalla Principal (Splash)
<img width="328" height="593" src="https://github.com/user-attachments/assets/e3e629ba-e597-4ea9-8f48-e42587b59fbc"/>

Características

Pantalla de bienvenida.

Logo de NiceStart centrado.

Da una impresión moderna mientras carga la app.

 2. Pantalla Login
<img width="305" height="603" src="https://github.com/user-attachments/assets/4e57211b-3978-4275-8d52-50fc483c5b2a"/>

Incluye

Campo de Usuario + icono.

Campo de Contraseña + icono.

Botón LOGIN.

Botón SIGN UP para navegar al registro.

Diseño centrado con ConstraintLayout y Guidelines.

 3. Pantalla de Registro
<img width="312" height="603" src="https://github.com/user-attachments/assets/90550a50-6d60-4c60-9a9d-ca0d76652710"/>

Incluye

Nombre, correo, contraseña.

Inputs hechos con TextInputLayout para diseño limpio.

Botón de registro funcional.

 4. Icono de la App
<img width="150" src="https://github.com/user-attachments/assets/70b39898-7126-468c-a760-3fec15458285"/>

Detalles

Estilo coherente con los colores del proyecto.

 5. Perfil del Usuario
<img width="272" height="486" src="https://github.com/user-attachments/assets/680d08b4-7aea-4a6b-9f51-3964e444b5dc"/>

Características

Imagen de perfil del usuario.

Útil como avatar o datos de cuenta.

En futuras versiones puede vincularse con datos reales del registro.

 6. Barra de Aplicación / Navegación
<div style="display:flex; gap:20px;"> <img width="244" height="477" src="https://github.com/user-attachments/assets/1c48d988-50f6-46db-b443-463369b42df6"/> <img width="363" height="634" src="https://github.com/user-attachments/assets/05916a91-80ea-492c-ba70-3db84aa35f4a"/> </div>

Funcionalidad

Acceso a:
- Bottom App Bar
- Bottom Navigation
- Sign Out

Navegación rápida entre pantallas.

 7. Logotipo Animado con Lottie

https://github.com/user-attachments/assets/d140ca96-5fbd-4206-80ee-f50cc4f00f68

Características

Añade profesionalidad al inicio de la app.

El archivo se encuentra en:
res/raw/icono.json

Controlable desde código: bucle, velocidad, eventos.

Disponible en la rama RamaLottie.

 Licencia

Este proyecto está bajo la licencia
Creative Commons BY-SA 4.0
🔗 https://creativecommons.org/licenses/by-sa/4.0/
