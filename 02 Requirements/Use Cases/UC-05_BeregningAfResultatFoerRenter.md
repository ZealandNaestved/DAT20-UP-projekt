# UC-05 beregning af resultat før renter

UseCase navn | Beregning af resultat før renter | 
-------------| -------------------------------| 
Scope        | Hoekcel                       
Primary Actor| HØK Studerende    
Level        | User Goal
Beskrivelse  | Systemet skal kunne udregne resultat før renter baseret på indtjeningsbidrag og afskrivninger, og præsentere denne værdi til HØK Studerende. 
Stakeholders and Interests | HØK-studerende (Ønsker at finde frem til resultat før renter).  
Preconditions | UseCase-04 Beregning af indtjeningsbidrag skal være udført og afskrivning skal være kendt. 
Succes Guarantee |resultat før renter skal være beregnet og præsenteret. 
Main Succece Scenario |  1. Systemet præsenterer indtjeningsbidrag<br> 2. HØK Studerende angiver afskrivninger. <br> 3. Systemet udregner resultat før renter.<br> 4. Systemet præsentere resultat før renter.<br>   
Extensions | 1.a HØK Studerende angiver non numeriske tegn i indtjeningsbidrag. <br> 1. Systemet oplyser at vareforbrug skal beskrives med tal. og beder om et nyt indput.<br> Processen forsætter fra pkt 2.<br> <br> 1.b HØK Studerende angiver indtjeningsbidrag.<br>Processen forsætter fra pkt 2 <br><br>2.a HØK Studerende angiver negativt tal i afskrivning. <br> 1. Systemet oplyser at afskrivning ikke må være negativ. og beder om et nyt tal. <br> Processen forsætter fra pkt 3. <br> <br> 2.b HØK Studerende angiver non numeriske tegn i afksrivninger. <br> 1. Systemet oplyser at afskrivninger skal beskrives med tal. og beder om et nyt indput.<br> Processen forsætter fra pkt 3. <br> <br>
Special Requirements | -- 
Technology & Data Variations List | Mulighed for at angive indput i 1.000kr. og 1 kr.  
Frequency of Occurrence | Use casene forekommer ved alle udregninger af resultat budget. 
Miscellaneous | -- 
