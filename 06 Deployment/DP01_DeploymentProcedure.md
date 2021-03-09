# Deployment/release/udgivelses plan 

<br/>

### Forudsætninger for at kunne køre programmet
1. Java 15 eller nyere.
2. Mac brugere skal have tilladt at hente programmer fra ukendte udviklere.

<br/>

## Oprettelse af jar filen
<br/>
1. Der skal laves en klasse der kalder Main klassen

![BilledeTilPunkt1](../assets/JarDeployment/BilledeTilPunkt1.png)

<br/>

2. Tryk på File --> Project Structure --> Artifacts

![BilledeTilPunkt2](../assets/JarDeployment/BilledeTilPunkt2.png)

<br/>

3. Tryk på plus-ikonet og vælg JAR --> From modules with dependencies...
![BilledeTilPunkt3](../assets/JarDeployment/BilledeTilPunkt3.png)

<br/>

4. Opret en ny main klasse (Denne klasse skal kalde den anden main klasse)

![BilledeTilPunkt4](../assets/JarDeployment/BilledeTilPunkt4.png)

<br/>

5. Der skal nu tilføjes en javaFX bin folder. Dette gøres ved at trykke på det lille plus og herefter vælges filer

![BilledeTilPunkt5](../assets/JarDeployment/BilledeTilPunkt5.png)

<br/>

6. Alt fra JavaFX bin folderen vælges

<br/>

7. Tryk på Apply og Okay

<br/>

8. Nu kan du bygge programmet ved at trykke på Build og vælge Build Artifacts

![BilledeTilPunkt8](../assets/JarDeployment/BilledeTilPunkt8.png)

<br/>

9. En pop-up menue kommer frem og der vælges build. <br> 
10. Den færdige jar fil er nu klar til deployment og kan åbnes uden nogle ekstra programmer
