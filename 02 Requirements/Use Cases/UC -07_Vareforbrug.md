# UC-07 Beregning af vareforbrug

UseCase navn | Beregn vareforbrug | 
-------------| -------------------------------| 
Scope        | HOEK
Primary Actor| HOEK-studerende
Level        | User-goal
Description  | Systemet skal kunne udregne vareforbruget ved at gange købspris med råvarer for hver varetype. Det samlede vareforbrug skal herefter præsenteres for de HØK-studerende. 
Stakeholders and Interests  | HOEK-studerende
Preconditions  | UC1 og Købspris og råvarer er kendt.
Succes Guarantee  | Vareforbruget bliver beregnet og præsenteret.
Main Succes Scenario  | 1. HØK-studenten angiver købspris. <br>2. HØK-studenten angiver råvarer. <br>3. Trin 1 og 2 gentages indtil alle varer er tilføjet.<br>4. Systemet beregner vareforbruget. <br> 5. Systemet præsenterer vareforbruget.
Extensions  | 1 HØK-studenten angiver non-numeriske tegn i råvarer eller købspris.<br>  1a. Systemet oplyser at råvarer/købspris skal beskrives med tal, og beder om et nyt input.<br> 2. HØK-studenten angiver et negativt tal i råvarer eller købspris.<br>  2a. Systemet oplyser at råvarer/købspris skal beskrives med tal, som ikke må være mindre end 0, og beder om et nyt input.
Special Requirements  | --
Technology and Data Variations List  | Mulighed for at angive enheder i 1kr. og i 1000kr.
Frequency of Occurrence  | Beregningen af vareforbruget vises først ved UC-07.
Miscellaneous  | --
