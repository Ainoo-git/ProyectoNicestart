# NiceStart - Aplicación Android Moderna de Login y Registro

<div align="center">
[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)
[![Android Studio](https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)](https://developer.android.com/studio)
[![Material Design](https://img.shields.io/badge/Material--Design-0081CB?style=for-the-badge&logo=material-design&logoColor=white)](https://material.io/)
[![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)
[![Licencia](https://img.shields.io/badge/Licencia-CC%20BY--SA%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by-sa/4.0/)
</div>

Aplicación móvil **moderna y profesional**, creada con Android Studio usando Material Components, ConstraintLayout y Lottie para login, registro y gestión de perfiles.

---

<h2 style="color:#FF69B4;">1. Características Principales</h2>

<h3 style="color:#FF1493;">1.1. Diseño UI/UX</h3>
<ul>
  <li>Material Design 3</li>
  <li>Layouts responsivos con Edge-to-Edge</li>
  <li>Pantalla de inicio animada (fadeIn + Glide)</li>
  <li>Gradientes personalizados e iconos vectoriales</li>
  <li>Soporte para tema claro/oscuro</li>
</ul>

<h3 style="color:#FF1493;">1.2. Autenticación y Navegación</h3>
<ul>
  <li>Login y Signup con navegación directa</li>
  <li>Campos de usuario, contraseña y email</li>
  <li>Botones con colores y estilos personalizados</li>
  <li>Toolbar en perfil con flecha atrás</li>
</ul>

---

<h2 style="color:#FF69B4;">2. Pantallas de la Aplicación</h2>

| Nº | Pantalla | Imagen | Descripción |
|----|----------|-------|------------|
| 2.1 | Splash / Principal | <img src="https://github.com/user-attachments/assets/d140ca96-5fbd-4206-80ee-f50cc4f00f68" width="120"> | Animación de logo y fondo, abre Login tras 5s |
| 2.2 | Pantalla de Login | <img src="https://github.com/user-attachments/assets/4e57211b-3978-4275-8d52-50fc483c5b2a" width="120"> | Login con campos y botones de navegación |
| 2.3 | Pantalla de Registro | <img src="https://github.com/user-attachments/assets/90550a50-6d60-4c60-9a9d-ca0d76652710" width="120"> | Registro de usuario con Username, Password y Email |
| 2.4 | Perfil de Usuario | <img src="https://github.com/user-attachments/assets/680d08b4-7aea-4a6b-9f51-3964e444b5dc" width="120"> | Visualización de avatar, nombre y descripción |
| 2.5 | MainActivity | <img src="https://github.com/user-attachments/assets/1c48d988-50f6-46db-b443-463369b42df6" width="120"> | WebView con SwipeRefreshLayout y menú contextual |

---

<h2 style="color:#FF69B4;">3. Funcionalidades por Pantalla</h2>

<h3 style="color:#FF1493;">3.1. Splash / Principal</h3>
<ul>
  <li>Animación del logo con fadeIn</li>
  <li>Fondo cargado con Glide</li>
  <li>Después de 5 segundos, abre la pantalla de Login</li>
</ul>

<h3 style="color:#FF1493;">3.2. Login</h3>
<ul>
  <li>Campos de Username y Password con iconos</li>
  <li>Botón <b>LOGIN</b> abre MainActivity</li>
  <li>Botón <b>SIGN UP</b> abre Signup</li>
  <li>Diseño responsivo y moderno</li>
</ul>

<h3 style="color:#FF1493;">3.3. Registro (Signup)</h3>
<ul>
  <li>Campos de Username, Password y Email</li>
  <li>Botón <b>CREATE ACCOUNT</b> abre Login</li>
  <li>Botón <b>LOGIN</b> vuelve al Login</li>
  <li>Estilo Material y layout responsivo</li>
</ul>

<h3 style="color:#FF1493;">3.4. MainActivity</h3>
<ul>
  <li>WebView con imagen aleatoria</li>
  <li>SwipeRefreshLayout con mensaje de actualización</li>
  <li>Menú contextual y appbar con opciones:
    <ul>
      <li>Copiar ítem (Toast)</li>
      <li>Descargar ítem (Toast)</li>
      <li>Salir / ir al Login</li>
      <li>Abrir Perfil</li>
      <li>AlertDialog con opciones de navegación</li>
    </ul>
  </li>
</ul>

<h3 style="color:#FF1493;">3.5. Perfil</h3>
<ul>
  <li>Avatar circular personalizable</li>
  <li>Nombre y descripción</li>
  <li>Toolbar con flecha atrás</li>
  <li>Colores y diseño limpio</li>
</ul>

---

<h2 style="color:#FF69B4;">4. Estructura del Proyecto</h2>

NiceStart/
├── AndroidManifest.xml
├── java/com.example.nicestart/
│ ├── MainActivity.java
│ ├── Login.java
│ ├── Signup.java
│ ├── Principal.java
│ ├── Profile.java
├── res/
│ ├── layout/
│ ├── menu/
│ ├── drawable/
│ ├── anim/
│ ├── color/
│ └── values/
└── Gradle Scripts/

yaml
Copiar código

---

<h2 style="color:#FF69B4;">5. Tecnologías Utilizadas</h2>

| Nº | Tecnología          | Uso en el Proyecto                      |
|----|--------------------|---------------------------------------|
| 5.1 | Android Studio      | Desarrollo y construcción             |
| 5.2 | Material Components | Componentes UI modernos               |
| 5.3 | ConstraintLayout    | Layouts responsivos y flexibles       |
| 5.4 | Glide               | Carga de imágenes en Splash           |
| 5.5 | SwipeRefreshLayout  | Actualización de WebView              |
| 5.6 | Gradle              | Gestión de dependencias y build       |

---

<h2 style="color:#FF69B4;">6. Licencia</h2>

Este proyecto está licenciado bajo **Creative Commons Atribución-CompartirIgual 4.0 Internacional**.  
[![CC BY-SA 4.0](https://i.creativecommons.org/l/by-sa/4.0/88x31.png)](https://creativecommons.org/licenses/by-sa/4.0/)
