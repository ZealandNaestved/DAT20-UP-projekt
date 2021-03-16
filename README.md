# DAT20-UP-projekt


## Fælles projekt for os datamatiker på dette 3 ugers projekt.
Projektet formår, at simplificere fremtidige og nuværende økonomers arbejde i forhold til at kunne udregne specifikke værdier på effektiv vis. Ofte set er udregningen et tidskrævende arbejde, men det endelige program vil kunne hurtiggøre arbejdet i fremtiden. 

Til udviklere, som er interesseret i produktet, forneden vil i se hvor alt information gemmer sig. 

<details><summary><strong>01 Business Modeling</strong></summary> <p>
  
Indeholder artefakter, der straks er relateret til virksomheds-aspektet:
  
- Vision document = VD
- FURPS+ = FURPS
- Use Case Model = UCM
- Analysis Model = AM
- Target- Organization Assessment = TOA
- Business Rules = BR
- Supplementary Business Specifications = SBS
- Business Glossary = BG
- Business Architecture Document = BAC
 
</p>
</details>


<details><summary><strong>02 Requirements</strong></summary> <p> 
  
Indeholder artefakter, der straks er relateret til requirements:

- Use Cases = UC
- Use Case diagrammer = UCD
- Class diagrammer = CD   
- Aktivitets diagrammer = AD
- Domæne modeller = DM
- System diagrammer = SD
- System Sekvens diagrammer = SSD
- Requirements Management Plan = RMP

</p>
</details>

<details><summary><strong>03 Design</strong></summary> <p>
  
Indeholder artefakter, der straks er relateret til designet af produktet:

- Class Diagrammer = CD
- Design Model = DEM
- Software Architecture Document = SAD 

</p>
</details>

<details><summary><strong>04 Implementation</strong></summary> <p>
  
Alt som indebærer implementation af projektet. Det er afgrænset til kode-relateret arbejde:
- Model Mappe
- Persistence Mappe
- View Mappe

Filnavne i koden skal være på engelsk og skrives med camelCase.

</p>
</details>

<details><summary><strong>05 Test</strong></summary> <p>
  
Indeholder artefakter, der straks er relateret til test af produktet:
  
- Checklister til Review
- Test-kode (undermappe med navn test, hvor koden ligger henne) 
- Test-cases/TestData
- Test-Log
  
</p> 
</details>

<details><summary><strong>06 Deployment</strong></summary> <p>
  
Indeholder artefakter, der straks er relateret til deployment af produktet: 
  
- .exe software 
- Installations artefakter : scripts, tools, filer, guides, licensing information 
- Udgivelses Noter, beskrivelse af release for slut brugeren
- Support Materiale, bruger manual
- Trænings Materiale

</p>
</details>


<details><summary><strong>07 Configuration & CM</strong></summary> <p>
  
Indeholder artefakter, der straks er relateret til Configuration & CM: 

- Configuration management plan
- Change requests 

</p>
</details>


<details><summary><strong>08 Project Management</strong></summary> <p>
  
Alt som projektet indebærer af administrative opgaver som tidsregistrering, iterationsplaner, kundemøder og lignende:

- Iterationsplan(er) = IP
- Kundemøder = KM

</p>
</details>

<details><summary><strong>09 Environment</strong></summary> <p>

Environment - denne mappe indebærer alt procedure-relateret materiale. Navngivningen er baseret på dens navn/formål, men yderligere information kan findes i den pågældende .md fil:

- Development case = DC

</p>
</details>


## Vejledning til programmet


Vi er blevet til rådighed til at lave et program, dette program skal kunne hjælpe en årgang af handelsøkonomer med at udregne et resultat budget og skulle fungere som en udskiftning til deres normale arbejds miljø, microsoft Excel.



<details><summary> <strong>Bruger Interface</strong> </summary> <p>
  
  *Her ses vores automatiserede UI, siden at programmet er lavet til at hjælpe med at udregne et resultat budget og
  derfor antager, vi at brugeren har kendskab til de forskellige nøgleord. Nøgleord som er skrevet i fed bliver
  automatisk udregnet, det betyder at så længe du angiver de forhendværende felter, som ikke er i fed vil de fede blive udregnet og udfyldt automatisk.*
  
![](/assets/ReadmeAssets/fullview.png)
 
  </p>
</details>
 
*Ud for felterne "Omsætning", "vareforbrug", "øvrige kapacitets omkostninger" og "afskrivninger (linær eller saldometoden)" er der "+" tegn til at hjælpe med at    sætte disse værdier op på en mere detaljeret vis og til at lægge dem sammen inde i interfacen.*
 
  <details><summary> <strong>Omsætning</strong> </summary> <p>
  
*Hvis det forkommer at man har flere omsætningskilder, så kan vores program facilitere en mere detaljeret opsætning, tilføj flere kilder, giv dem et navn, så sætter interfacen det pænt op og importere summen til den primære bruger interface.*
  
  ![](/assets/ReadmeAssets/omsætning.png)
  
  </p>
  </details>

  <details><summary> <strong>Vareforbrug</strong> </summary> <p>
  
*Her ses UI som bruges til at udregne et detaljeret vareforbrug. Dette UI facilitere udregning af Vareforbrug ved at insætte de værdiger, på sigt skal dette kunne facilitere flere kilder af vareforbrug, ligesom i omsætning. Derefter kan summen impoteres til det primære bruger interface.*

  ![](/assets/ReadmeAssets/vareforbrug.png)
  
  </p>
  </details>
  
  <details><summary> <strong>Øvrige kapacitetsomkostninger</strong> </summary> <p>
  
*I denne tab kan man udregne de øvrige kapacitetsomkostninger, man kan udregne det med forskellige ting, her ser vi at den består af løntimer, emballage, lager og maskiner, som der allerede står skrevet ind fordi de er standard. Er omkostninger ikke angivet, kan man tilføje nye selv og når du har indskrevet alle de omkosntninger der nu skulle være, så kan man klikke "Overfør til resultatopgørelse" for at den udregner og importere summen ind i resultatsopgørelsen.*
  
  ![](/assets/ReadmeAssets/kapacitetsomkostninger.png)
  
  </p>
  </details>
  
  <details><summary> <strong>Afskrivninger (linær eller saldometoden)</strong> </summary> <p>
  
  *Afskrivninger er en repræsentation af de varer som er købt til videresalg.*
  
  ![](/assets/ReadmeAssets/afskrivningerReadme.png)
  
  </p>
  </details>
  
<details><summary> <strong>Kort gennemgang</strong> </summary> <p>
  
*Det første man ligger mærke til, er at der står nogle tomme felter med en "titel" og et felt man kan angive numre i. I dette billede kan vi se, at vi har 3 felter som arbejder sammen, en til omsætning, en til vareforbrug og en til bruttofortjenneste. Bruttofortjennesten bliver beregnet på denne måde **"Omsætning - Vareforbrug"** (Næste billede)*
  
  ![](/assets/ReadmeAssets/emptyDisplay.png)
  
*I det næste billede kan vi se, at en bruger har angivet omsætningen og vareforbruget og så har systemet udregnet og vist/præsenteret bruttofortjenesten. Dette forløb sker flere gange, men med andre felter og titler, såsom **"Bruttofortjenesten - Salgsfremmende Omkostninger = Markedsføringsbidrag"** eller **"Markedsføringsbidrag - Kapacitetsomkostninger = Indtjeningsbidrag"**.*
  
  ![](/assets/ReadmeAssets/displayFunction.png)
  
*I det sidste billede kan vi se resultaet af alle de tidligere/løbende udregninger, der leder op til det endelige resultat.*
  
  ![](/assets/ReadmeAssets/displayResultat.png)
  
  </p>
  </details>



