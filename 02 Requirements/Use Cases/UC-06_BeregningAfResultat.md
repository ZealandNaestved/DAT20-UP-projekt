
**UC-06 Beregning Af Resultat**

UseCase navn | Beregn resultat | 
-------------| -------------------------------| 
Scope        | HOEK
Primary Actor| HOEK-studerende
Level        | User-goal
Description  | Det samlede resultat er baseret på en fratrækning af resultat før renter og renteomkostninger, dette resultat skal så illustreres for de HØK-studerende. 
Stakeholders and Interests  | HOEK-studerende
Preconditions  | UC1, UC2, UC3, UC4, UC5, resultatet før renter, renteomkostninger.
Succes Guarantee  | Resultatet bliver beregnet og præsenteret.
Main Succes Scenario  | 1. Systemet præsenterer resultatet før renter. <br> 2. De HØK-studerende angiver renteomkostninger. <br>3. Systemet udregner det endelige resultat.<br> 4. Systemet præsenterer resultatet.  
Extensions  | 1 HØK-studerende angiver non-numeriske tegn i renteomkostninger.<br>  1a. Systemet oplyser at renteomkostninger skal beskrives med tal, og beder om et nyt input.<br> 2. HØK-studerende angiver et negativt tal i renteomkostninger.<br>  2a. Systemet oplyser at renteomkostninger skal beskrives med tal, som ikke må være mindre end 0, og beder om et nyt input.
Special Requirements  | --
Technology and Data Variations List  | Mulighed for at angive enheder i 1kr. og i 1000kr.
Frequency of Occurrence  | Beregningen af resultatet vises først ved UC6.
Miscellaneous  | --
