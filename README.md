# 🎀 NiceStart 

<div align="center">

[![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)](https://developer.android.com/)  
[![Android Studio](https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)](https://developer.android.com/studio)  
[![Material Design](https://img.shields.io/badge/Material--Design-0081CB?style=for-the-badge&logo=material-design&logoColor=white)](https://material.io/)  
[![Kotlin](https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white)](https://kotlinlang.org/)  
[![Licencia](https://img.shields.io/badge/Licencia-CC%20BY--SA%204.0-lightgrey.svg)](https://creativecommons.org/licenses/by-sa/4.0/)  

</div>

Aplicación móvil, creada con Android Studio usando Material Components, ConstraintLayout y Lottie para login, registro, perfil etc...

---

## ✨ 1. Características Principales

###  1.1 Diseño UI/UX
- Material Design 3  
- Layouts responsivos con Edge-to-Edge  
- Pantalla de inicio animada (fadeIn + Glide)  
- Gradientes personalizados e iconos vectoriales  
- Soporte para tema claro/oscuro  

###  1.2 Autenticación y Navegación
- Login y Signup con navegación directa  
- Campos de usuario, contraseña y email  
- Botones con colores y estilos personalizados  
- Toolbar en perfil con flecha atrás  

---

##  2. Pantallas de la Aplicación

| Pantalla | Imagen | Descripción |
|----------|-------|------------|
| Uso de la app | https://github.com/user-attachments/assets/f2cec306-ac57-4ecd-9ce9-e71670e55cff|  |
| Splash / Principal | ![Splash](https://github.com/user-attachments/assets/d140ca96-5fbd-4206-80ee-f50cc4f00f68) | Animación de logo y fondo, abre Login tras 5s, se encuentra implementada en la RamaLottie |
| Icono app |<img width="314" height="75" alt="image" src="https://github.com/user-attachments/assets/f5d113f6-c05f-4685-9004-3d4c1bd00b9c" /> | icono de la aplicación |
| Login | <img width="356" height="636" alt="Captura de pantalla 2025-12-08 133550" src="https://github.com/user-attachments/assets/85d98e3a-d0fd-475a-a11f-067378910b1f"/> | Login con campos y botones de navegación |
| Registro (Signup) |<img width="360" height="641" alt="Captura de pantalla 2025-12-08 133638" src="https://github.com/user-attachments/assets/e8bce2c0-d00d-4620-9728-0f355fefa935" />| Registro de usuario con Username, Password y Email |
| Perfil de Usuario | ![Profile](https://github.com/user-attachments/assets/680d08b4-7aea-4a6b-9f51-3964e444b5dc) | Visualización de avatar, nombre y descripción |
| MainActivity |<img width="353" height="643" alt="Captura de pantalla 2025-12-08 134054" src="https://github.com/user-attachments/assets/5effe96c-d212-4728-af78-89c556d17ebb" />| WebView con SwipeRefreshLayout y menú contextual |
|BottomAppBar |<img width="275" height="486" alt="image" src="https://github.com/user-attachments/assets/5d1c2019-27aa-4fbc-98b0-18ca03d71e51" />|SwipeRefreshLayout con WebView y BottomAppBar|

---

##  3. Funcionalidades por Pantalla

###  3.1 Splash / Principal
- Animación del logo con fadeIn  
- Fondo cargado con Glide  
- Después de 5 segundos, abre la pantalla de Login  

###  3.2 Login
- Campos de Username y Password con iconos  
- Botón **LOGIN** abre MainActivity  
- Botón **SIGN UP** abre Signup  
- Diseño responsivo y moderno  

###  3.3 Registro (Signup)
- Campos de Username, Password y Email  
- Botón **CREATE ACCOUNT** abre Login  
- Botón **LOGIN** vuelve al Login  
- Estilo Material y layout responsivo  

###  3.4 MainActivity
- WebView con imagen aleatoria  
- SwipeRefreshLayout con mensaje de actualización  
- Menú contextual y appbar con opciones:  
  - Copiar ítem (Toast)  
  - Descargar ítem (Toast)  
  - Salir / ir al Login  
  - Abrir Perfil  
  - AlertDialog con opciones de navegación  

###  3.5 Perfil
- Avatar circular personalizable  
- Nombre y descripción  
- Toolbar con flecha atrás  
- Colores y diseño limpio

###  3.6 Locales(Cambio de idioma) 
- Cambio de idioma según la preferencia

###  3.6 Funcionalidad de alternancia entre modo claro y modo oscuro.
- Cambio de tema: claro / oscuro
  
---

##  4. Estructura del Proyecto

NiceStart/
├── AndroidManifest.xml
├── java/com.example.nicestart/
│ ├── MainActivity.java
│ ├── Login.java
│ ├── Signup.java
│ ├── Principal.java
│ └── Profile.java
├── res/
│ ├── layout/
│ ├── menu/
│ ├── drawable/
│ ├── anim/
│ ├── color/
│ └── values/
└── Gradle Scripts/



---

##  5. Tecnologías Utilizadas

| Tecnología          | Uso en el Proyecto                    |
|--------------------|---------------------------------------|
| Android Studio      | Desarrollo y construcción             |
| Material Components | Componentes UI modernos               |
| ConstraintLayout    | Layouts responsivos y flexibles       |
| Glide               | Carga de imágenes en Splash           |
| SwipeRefreshLayout  | Actualización de WebView              |
| Gradle              | Gestión de dependencias y build       |

---

##  6. Licencia

Este proyecto está licenciado bajo **Creative Commons Atribución-CompartirIgual 4.0 Internacional**.  
[![CC BY-SA 4.0](https://i.creativecommons.org/l/by-sa/4.0/88x31.png)](https://creativecommons.org/licenses/by-sa/4.0/)
