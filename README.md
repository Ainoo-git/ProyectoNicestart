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

## 1. Características Principales

1.1. **Diseño UI/UX**
- Material Design 3
- ConstraintLayout para diseño responsivo
- Pantalla de inicio animada con Lottie
- Gradientes personalizados e iconos vectoriales
- Soporte para tema claro/oscuro

1.2. **Autenticación**
- Login con integración de iconos
- Registro completo de usuario
- Alternar visibilidad de contraseña
- Validación de formularios en tiempo real
- Transiciones suaves entre pantallas

---

## 2. Pantallas de la Aplicación

| Nº | Pantalla | Imagen | Descripción |
|----|----------|-------|------------|
| 2.1 | Pantalla de Inicio | <img src="https://github.com/user-attachments/assets/e3e629ba-e597-4ea9-8f48-e42587b59fbc" width="120"> | Bienvenida profesional |
| 2.2 | Pantalla de Login | <img src="https://github.com/user-attachments/assets/4e57211b-3978-4275-8d52-50fc483c5b2a" width="120"> | Interfaz segura de login |
| 2.3 | Pantalla de Registro | <img src="https://github.com/user-attachments/assets/90550a50-6d60-4c60-9a9d-ca0d76652710" width="120"> | Registro de usuario sencillo |
| 2.4 | Perfil de Usuario | <img src="https://github.com/user-attachments/assets/680d08b4-7aea-4a6b-9f51-3964e444b5dc" width="120"> | Gestión de perfil personal |
| 2.5 | Navegación | <img src="https://github.com/user-attachments/assets/1c48d988-50f6-46db-b443-463369b42df6" width="120"> | Menú intuitivo |
| 2.6 | Icono de la App | <img src="https://github.com/user-attachments/assets/70b39898-7126-468c-a760-3fec15458285" width="120"> | Icono oficial de la app |

---

## 3. Animación Lottie

3.1. **Detalles**
- Logotipo animado al iniciar la aplicación
- Integrado mediante `LottieAnimationView`
- Archivo: `res/raw/icono.json`
- Rama especial: `RamaLottie`

<figure>
  <img src="https://github.com/user-attachments/assets/d140ca96-5fbd-4206-80ee-f50cc4f00f68" width="200">
  <figcaption>Mini preview Lottie</figcaption>
</figure>

---

## 4. Estructura del Proyecto
NiceStart/
├── AndroidManifest.xml
├── java/com.example.nicestart/
│ ├── MainActivity.java
│ ├── Login.java
│ ├── Signup.java
│ ├── Principal.java
│ ├── Profile.java
│ └── ScrollingActivity.java
├── res/
│ ├── layout/
│ ├── menu/
│ ├── drawable/
│ ├── mipmap/
│ ├── values/
│ ├── anim/
│ ├── color/
│ └── xml/
└── Gradle Scripts/

---

## 5. Tecnologías Utilizadas

| Nº | Tecnología          | Uso en el Proyecto                      |
|----|--------------------|---------------------------------------|
| 5.1 | Android Studio      | Desarrollo y construcción             |
| 5.2 | Material Components | Componentes UI modernos               |
| 5.3 | ConstraintLayout    | Diseño responsivo y flexible           |
| 5.4 | Lottie              | Animaciones de splash screen           |
| 5.5 | Vector Drawables    | Íconos y elementos visuales            |
| 5.6 | Gradle              | Gestión de dependencias y build        |

---

## 6. Funcionalidades por Pantalla

6.1. **Pantalla Principal (Splash)**
- Animación Lottie del logotipo
- Diseño profesional de bienvenida
- Carga inicial de la app

6.2. **Pantalla de Login**
- Campos de usuario y contraseña con íconos
- Botón de login con validación
- Enlace a registro
- Diseño responsive

6.3. **Pantalla de Registro**
- Formulario completo: nombre, email, contraseña
- Validación en tiempo real
- Botón de registro funcional
- Diseño limpio y moderno

6.4. **Perfil de Usuario**
- Visualización de información
- Avatar personalizable
- Gestión de datos personales

---

## 7. Características Técnicas

7.1. **Arquitectura**
- Actividades separadas por funcionalidad
- Layouts optimizados para orientaciones
- Recursos separados por tipo y densidad

7.2. **Diseño Visual**
- Paleta de colores (`colors.xml`)
- Estilos reutilizables (`styles.xml`)
- Temas claro/oscuro
- Iconografía Material Design

7.3. **Navegación**
- Menú inferior (`bottom_navigation_menu.xml`)
- Barra de aplicación (`menu_appbar.xml`)
- Transiciones entre actividades

---

## 8. Licencia

Este proyecto está licenciado bajo **Creative Commons Atribución-CompartirIgual 4.0 Internacional**.  
[![CC BY-SA 4.0](https://i.creativecommons.org/l/by-sa/4.0/88x31.png)](https://creativecommons.org/licenses/by-sa/4.0/)

