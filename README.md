# Guía de la App NiceStart

NiceStart es una aplicación móvil creada con **Android Studio**, usando **Material Components** y **ConstraintLayout**.  
Su objetivo es mostrar una interfaz moderna de **login y registro**, con pantallas de bienvenida y presentación (splash), y un diseño visual atractivo.

---

## Descripción de los layouts e imágenes

### 1. Pantalla Principal
<img width="328" height="593" alt="image" src="https://github.com/user-attachments/assets/e3e629ba-e597-4ea9-8f48-e42587b59fbc" />


**Funcionalidad:**  
- Se muestra al abrir la aplicación.  
- Contiene el **logotipo** de la app y el nombre **NiceStart**.  
- Diseñada para dar una primera impresión profesional mientras carga la app.

### 2. Pantalla Login
<img width="305" height="603" alt="image" src="https://github.com/user-attachments/assets/4e57211b-3978-4275-8d52-50fc483c5b2a" />


**Funcionalidad:**  
- Permite al usuario ingresar su **nombre de usuario** y **contraseña**.  
- Contiene los campos: `Username` y `Password` con íconos al inicio para mejorar la experiencia visual.  
- Incluye un botón **LOGIN** que valida las credenciales y un botón **SIGN UP** para ir a la pantalla de registro.  
- Todo está alineado y centrado usando `ConstraintLayout` y `Guidelines`.

---

### 3. Pantalla de Registro (Signup)
<img width="312" height="603" alt="image" src="https://github.com/user-attachments/assets/90550a50-6d60-4c60-9a9d-ca0d76652710" />


**Funcionalidad:**  
- Permite al usuario crear una nueva cuenta ingresando datos como nombre, correo y contraseña.  
- Campos con `TextInputLayout` y `TextInputEditText` para una interfaz limpia y fácil de usar.  
- Botón **SIGN UP** para guardar la información y volver al login o abrir la pantalla principal.  

---

### 4. Icono de la App
![App Icon](https://github.com/user-attachments/assets/70b39898-7126-468c-a760-3fec15458285)

**Funcionalidad:**  
 - Mantiene coherencia visual con los colores y estilo de la interfaz.
   
---
### 5. Perfil del usuario 
<img width="272" height="486" alt="image" src="https://github.com/user-attachments/assets/680d08b4-7aea-4a6b-9f51-3964e444b5dc" />


**Funcionalidad:**  
 - Esta imagen representa el perfil del usuario dentro de la aplicación.
 - Se puede utilizar como foto de cuenta o avatar personal, permitiendo identificar al usuario de forma visual.
 - En futuras versiones, podría vincularse con la cuenta creada en el registro y mostrarse en la pantalla principal o en el área de perfil.

---
### 7.Barra de Aplicación
<img width="244" height="477" alt="image" src="https://github.com/user-attachments/assets/1c48d988-50f6-46db-b443-463369b42df6" />
<img width="246" height="480" alt="image" src="https://github.com/user-attachments/assets/bc7d0c53-89d1-4978-b542-a813fd217331" />


**Funcionalidad:**
 - Este menú representa la navegación principal de la aplicación.
 - Permite acceder rápidamente a las secciones clave como Bottom app bar, Bottom navigation y Signout.
 - Proporciona una experiencia de usuario fluida mediante transiciones entre pantallas.
   
Este proyecto está bajo la licencia [Creative Commons BY-SA 4.0](https://creativecommons.org/licenses/by-sa/4.0/)

