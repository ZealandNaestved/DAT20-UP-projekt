
# Implementering af udviklingsmiljø (Intellij)

*Herunder vil der være en guide til hvordan du sætter dit udviklingsmiljø op så du er klar og parat til at kode og…*


- Klon repo


- Download Java JDK og JavaFX SDK
Hvis du ikke allerede har dem downloaded


- Klik ind på Project Structure (File -> Project Structure) og klik på “libraries”, klik på det lille plus (+) og find din JavaFX SDK og marker “lib” filen inde i mappen og klik “ok”.


- Ekstra step: Klik på Project -> Packages


- Klik Edit Configurations (Run -> Edit Configuration), tryk derefter på Modify options, og vælg “add VM options”, kopier nedenstående linje ind i feltet beskrevet som “vm options”, og erstat “[STI]” med stien til din downloadede javafx lib mappe. Tryk derefter på “OK”

--module-path
"[STI]\javafx-sdk-11.0.2\lib"
--add-modules
javafx.controls,javafx.fxml


- Ekstra step: Åben Main.java for at tjekke om der opstår fejl.


    - Hvis den fejler, tjek om Intellij har importet JavaFX korrect.