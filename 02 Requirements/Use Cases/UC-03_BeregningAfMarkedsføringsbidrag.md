# Formel Use Case UC - 03 beregn markedsføringsbidrag


UseCase navn | UC-03 beregning af markedsføringsbidrag | 
-------------| -------------------------------| 
Scope        | Hoekcel                       
Primary Actor| HØK Studerende    
Level        | User Goal
Beskrivelse  | Systemet skal kunne udregne markedsføringsbidrag baseet på Bruttofortjeneste og Salgsfremmende omkostninger, og præsentere markedsføringsbidrag værdi til HØK Studerende. 
Stakeholders and Interests | HØK-studerende (Ønsker at finde frem til markedsføringsbidrag).  
Preconditions | 1. UseCase-01 Beregning af Omsætning. <br> 2. Vareforbrug skal være kendt. <br> 3. UseCase-02 Beregning af bruttofortjeneste <br> 4. Salgsfremmende Omkostninger 
Succes Guarantee | markedsføringsbidrag skal være beregnet og præsenteret. 
Main Succece Scenario |   1. Systemet beregner Bruttofortjeneste. <br> 2. HØK Studerende angiver Salgsfremmende omkostninger . <br> 3. Systemet udregner markedsføringsbidrag.<br> 4. Systemet præsenterer markedsføringsbidrag.<br>   
Extensions |2.a HØK Studerende angiver negativt tal i kontante omkostninger. <br> 1. Systemet oplyser at kontante omkostninger ikke må være negativ. og beder om et nyt tal. <br> Processen forsætter fra pkt 2. <br> <br> 2.b HØK Studerende angiver non numeriske tegn i kontante omkostninger. <br> 1. Systemet oplyser at kontante omkostninger skal beskrives med tal. og beder om et nyt indput.<br> Processen forsætter fra pkt 2. <br> <br>
Special Requirements | -- 
Technology & Data Variations List | Mulighed for at angive indput i 1.000kr. og 1 kr.  
Frequency of Occurrence | Use casene forekommer ved alle udregninger af resultat budget. 
Miscellaneous | -- 


