# Test Scenarier for Use-Case 09: Export til Excel


| **Test** | **Input** | **Forventet output** | **Pass/Fail** |
| ------------- | --------------- | ----------------- | ------- |
| 1 | Omsætning: 1000<br>Vareforbrug: 100<br>Markedsføringsomkostninger: 100<br>Øvrige kapacitetsomkostninger: 100<br>Afskrivninger: 100<br>Renteomkostninger: 100 |Omsætning: 1000<br>Vareforbrug: 100<br>Bruttofortjeneste: 900<br>Markedsføringsomkostninger: 100<br>Markedsføringsbidrag: 800<br>Øvrige kapacitetsomkostninger: 100<br>Indtjeningsbidrag: 700<br>Afskrivninger: 100<br>Resultat før renter: 600<br>Renteomkostninger: 100<br>Resultat: 500 | Passed |
| 2 | Bruttofortjeneste: 900<br>Markedsføringsbidrag: 800<br>Indtjeningsbidrag: 700<br>Resultat før renter: 600<br> | Omsætning: 0<br>Vareforbrug: 0<br>Bruttofortjeneste: 900<br>Markedsføringsomkostninger: 0<br>Markedsføringsbidrag: 800<br>Øvrige kapacitetsomkostninger: 0<br>Indtjeningsbidrag: 700<br>Afskrivninger: 0<br>Resultat før renter: 600<br>Renteomkostninger: 0<br>Resultat: 600 | Failed:<br>Den kopierer "resultat før renter"<br> og indskriver det i "afskrivninger",<br> under eksport til Excel |
| 3 | Intet input | Omsætning: 0<br>Vareforbrug: 0<br>Bruttofortjeneste: 0<br>Markedsføringsomkostninger: 0<br>Markedsføringsbidrag: 0<br>Øvrige kapacitetsomkostninger: 0<br>Indtjeningsbidrag: 0<br>Afskrivninger: 0<br>Resultat før renter: 0<br>Renteomkostninger: 0<br>Resultat: 0 | Passed |

