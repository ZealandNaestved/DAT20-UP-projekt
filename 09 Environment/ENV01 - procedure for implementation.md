
# Implementering af udviklingsmiljø (Intellij)

*Herunder vil der være en guide til hvordan du sætter dit udviklingsmiljø op så du er klar og parat til at kode og…*


- Download Java JDK og [JavaFX SDK](https://gluonhq.com/download/javafx-11-0-2-sdk-windows/)
Hvis du ikke allerede har dem downloaded


- Klon dette repo


- Klik ind på Project Structure (File -> Project Structure) og klik på “libraries”, klik på det lille plus (+) og find din JavaFX SDK og marker “lib” filen inde i mappen og klik “ok”.

Hvis det ønskes at intellij kun skal vise filer som er relevante for implementationen følges næste skridt
- Ekstra step: Klik på Project (lige over projectstrukturvinduet) -> Packages, 

- Klik Edit Configurations (Run -> Edit Configuration),tryk på det lille plus(+) i øverste venstre hjørne, og vælg "Application", i feltet benævnt "Main class" trykkes der shift+enter, hvorefter klassen "Main" vælges, tryk herefter ok. Tryk derefter på Modify options, og vælg “add VM options”, kopier følgende linje ind i feltet beskrevet som “vm options”, ***--module-path
"[STI]\javafx-sdk-11.0.2\lib"
--add-modules
javafx.controls,javafx.fxml***, og erstat “[STI]” med stien til din downloadede javafx lib mappe. Tryk derefter på “OK”. Se eventuelt nedenstående billeder for før og efter dette step. 

<img src="https://user-images.githubusercontent.com/70686136/109497439-57b18e00-7a92-11eb-994b-e12ab1046ba7.png" width="250" height="250"> <img src="https://user-images.githubusercontent.com/70686136/109497635-a3643780-7a92-11eb-9e3e-ef0f31fe10ec.png" width="250" height="250">






- Ekstra step: Åben Main.java for at tjekke om der opstår fejl.


    - Hvis den fejler, tjek om Intellij har importet JavaFX korrect.

