# Práctica 2: Máquina virtual / Lab 2: Virtual Machine

## Instrucciones / Instructions

### Código inicial / Starter code

El enlace a la tarea en el campus virtual os llevará a una tarea de Classroom50. Una vez iniciada sesión en GitHub, se os pedirá que aceptéis la tarea. En ese momento, Classroom50 creará automáticamente un repositorio privado para cada alumno (por ejemplo, `ds-acebal-2026-27/ds-2026-27-lab-02-username`, donde `02` es el número de la sesión de prácticas correspondiente y `username` vuestro nombre de usuario en GitHub).

---

The assignment link in the virtual campus will take you to a Classroom50 assignment. Once you have signed in to GitHub, you will be asked to accept the assignment. At that point, Classroom50 will automatically create a private repository for each student (for example, `ds-acebal-2026-27/ds-2026-27-lab-02-username`, where `02` is the corresponding lab session number and `username` is your GitHub username).

### Clonar el repositorio / Cloning the repository locally

A continuación, clonaréis dicho repositorio en vuestra máquina. Para el ejemplo anterior:

```bash
git clone https://github.com/ds-acebal-2026-27/ds-2026-27-lab-02-username.git
cd ds-2026-27-lab-02-username
```

> [!IMPORTANT]
> No olvidéis cambiar `username` por vuestro usuario de GitHub.

---

Next, clone this repository to your local machine. Using the example above:

```bash
git clone https://github.com/ds-acebal-2026-27/ds-2026-27-lab-02-username.git
cd ds-2026-27-lab-02-username
```

> [!IMPORTANT]
> Remember to replace `username` with your GitHub username.

### Importar el proyecto / Importing the project in your IDE

Para importar el proyecto, en Visual Studio Code e IntelliJ IDEA basta con abrir la carpeta raíz del proyecto (la que contiene el fichero `pom.xml`) y el entorno lo reconocerá automáticamente como un proyecto Maven. Si utilizáis Eclipse, aseguraos de importarlo mediante la opción de __Maven__ y no la típica de Java: `File → Import → Maven → Existing Maven Projects`.

---

To import the project, in Visual Studio Code or IntelliJ IDEA, you just need to open the project root folder (the one containing the `pom.xml` file), and the IDE will automatically detect it as a Maven project. If you use Eclipse, make sure to import it using the __Maven__ option rather than the usual Java import: `File → Import → Maven → Existing Maven Projects`.

### Ejecutar el proyecto / Running the project

Además de las opciones habituales de vuestro entorno de desarrollo, podéis emplear las instrucciones típicas de Maven para compilar y ejecutar el proyecto (y lo mismo si hubiera pruebas unitarias):

```bash
# Compila el proyecto
mvn compile

# Ejecuta la clase principal definida en el fichero pom.xml mediante el plugin exec
mvn exec:java

# Ejecuta las pruebas, si las hubiera
mvn test
```

> [!NOTE]  
> Usaremos el convenio de que la clase principal se llame siempre `Main` y esté siempre en un paquete `main` directamente bajo `es.uniovi.eii.ds`, por lo que no cambiará de unas prácticas a otras.

---

Besides the usual options provided by your IDE, you can use the standard Maven commands to compile and run the project, as well as to run any unit tests:

```bash
# Compile the project
mvn compile

# Run the main class defined in the pom.xml via the exec plugin
mvn exec:java

# Run the tests, if any
mvn test
```

> [!NOTE]
> We follow the convention that the main class is always named `Main` and is located in a `main` package directly under `es.uniovi.eii.ds`. This does not change across labs.

### Entrega de la práctica / Submitting the assignment

Recordad que, salvo que se indique lo contrario, la práctica deberá entregarse antes de la siguiente clase de laboratorio. Para ello, deberéis hacer un _commit_ final y sincronizar los cambios con GitHub:

```bash
git add .
git commit -m "Final submission"
git push origin main
```

---

Remember that, unless stated otherwise, the assignment must be submitted before the next lab session. To do this, you should make a final commit and push your changes to GitHub:

```bash
git add .
git commit -m "Final submission"
git push origin main
```

## Solución / Solution

Al comienzo de la siguiente clase de prácticas, y una vez que se haya explicado en el laboratorio, podréis acceder al repositorio con la solución aquí:

➡️ <https://github.com/ds-acebal/lab-02-solution.git>

Se recomienda encarecidamente que lo clonéis en vuestra máquina y dediquéis unos minutos a compararlo con vuestra solución antes de pasar a la siguiente práctica.

---

At the beginning of the next lab session, once it has been explained in class, you can access the solution repository here:

➡️ <https://github.com/ds-acebal/lab-02-solution.git>

We strongly recommend that you clone it to your machine and spend a few minutes comparing it with your own solution before moving on to the next assignment.
