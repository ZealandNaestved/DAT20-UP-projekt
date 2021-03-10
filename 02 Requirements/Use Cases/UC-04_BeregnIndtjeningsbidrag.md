# Formel Use Case UC - 04 Beregn Indtjeningsbidrag


UseCase navn | Beregning af bruttofortjeneste | 
-------------| -------------------------------| 
Scope        | Hoekcel                       
Primary Actor| HØK Studerende    
Level        | User Goal
Beskrivelse  | Systemet skal kunne udregne indtjeningsbidrag baseret på markedsføringsbidrag og Kontante omkostninger, og præsentere denne værdi til HØK Studerende. 
Stakeholders and Interests | HØK-studerende (Ønsker at finde frem til indtjeningsbidrag).  
Preconditions | 1. UseCase-01 Beregning af Omsætning. <br> 2. Vareforbrug skal være kendt. <br> 3. UseCase-02 Beregning af bruttofortjeneste <br> 4. Salgsfremmende Omkostninger <br> 5. UseCase-03 beregning af markedsføringsbidrag <br> 6. Kontante Omkostninger  
Succes Guarantee | Indtjeningsbidrag skal være beregnet og præsenteret. 
Main Succece Scenario |   1. Systemet beregner markedsføringsbidraget. <br> 2. HØK Studerende angiver kontante omkostninger. <br> 3. Systemet udregner indtjeningsbidrag.<br> 4. Systemet præsenterer indtjeningsbidrag.<br>   
Extensions |2.a HØK Studerende angiver negativt tal i kontante omkostninger. <br> 1. Systemet oplyser at kontante omkostninger ikke må være negativ. og beder om et nyt tal. <br> Processen forsætter fra pkt 2. <br> <br> 2.b HØK Studerende angiver non numeriske tegn i kontante omkostninger. <br> 1. Systemet oplyser at kontante omkostninger skal beskrives med tal. og beder om et nyt indput.<br> Processen forsætter fra pkt 2. <br> <br>
Special Requirements | -- 
Technology & Data Variations List | Mulighed for at angive indput i 1.000kr. og 1 kr.  
Frequency of Occurrence | Use casene forekommer ved alle udregninger af resultat budget. 
Miscellaneous | -- 


