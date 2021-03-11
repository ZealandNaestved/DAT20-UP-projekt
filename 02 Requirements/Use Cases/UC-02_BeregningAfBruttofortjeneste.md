# UC-02 Beregning af bruttofortjeneste


UseCase navn | Beregning af bruttofortjeneste | 
-------------| -------------------------------| 
Scope        | Hoekcel                       
Primary Actor| HØK Studerende    
Level        | User Goal
Beskrivelse  | Systemet skal kunne udregne bruttofortjeneste baseret på omsætning og vareforbrug, og præsentere denne værdi til HØK Studerende. 
Stakeholders and Interests | HØK-studerende (Ønsker at finde frem til bruttofortjeneste).  
Preconditions | UseCase-01 Beregning af Omsætning. Vareforbrug skal være kendt.  
Succes Guarantee | Bruttofortjeneste skal være beregnet og præsenteret. 
Main Succece Scenario |   1. HØK Studerende angiver Omsætning. <br> 2. HØK Studerende angiver vareforbrug. <br> 3. Systemet udregner bruttofortjenesten.<br> 4. Systemet præsentere bruttofortjenesten.<br>   
Extensions |1.a HØK Studerende angiver negativt tal i omsætning. <br> 1. Systemet oplyser at omsætning ikke må være negativ. og beder om et nyt tal. <br> Processen forsætter fra pkt 1. <br> <br> 2.a HØK Studerende angiver negativt tal i vareforbrug. <br> 1. Systemet oplyser at vareforbrug ikke må være negativt. og beder om et nyt tal. <br> Processen forsætter fra pkt 2. <br> <br> 1.b HØK Studerende angiver non numeriske tegn i omsætning. <br> 1. Systemet oplyser at omsætning skal beskrives med tal. og beder om et nyt indput.<br> Processen forsætter fra pkt 1. <br> <br> 2.b HØK Studerende angiver non numeriske tegn i Vareforbrug. <br> 1. Systemet oplyser at vareforbrug skal beskrives med tal. og beder om et nyt indput.<br> Processen forsætter fra pkt 2. <br> <br>
Special Requirements | -- 
Technology & Data Variations List | Mulighed for at angive indput i 1.000kr. og 1 kr.  
Frequency of Occurrence | Use casene forekommer ved alle udregninger af resultat budget. 
Miscellaneous | -- 











 



