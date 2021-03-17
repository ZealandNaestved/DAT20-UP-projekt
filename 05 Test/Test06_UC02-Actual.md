# Aktuelle outputs sammenlignet med forventet outputs

## Test scenarie 1

**Test scenarie beskrivelse**

> Et input felt bliver glemt. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Omsætning: ""
> Vareforbrug: "2500"

**Test trin**

> 1. Indtast beregnede omsætning.
> 2. Indtast vareforbrug.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Udfyld venligst alle felter"

**Aktuelt resultat**

> Programmet opdateres/beregner løbende og når feltet forbliver tomt tror programmet at man mener "0" og derfor bliver outputtet = -2500.

> Failed (Kind of).




## Test scenarie 2

**Test scenarie beskrivelse**

> Indtaster bogstav i input felt. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Omsætning: "301a20"
> Vareforbrug: "2500"

**Test trin**

> 1. Indtaster beregnede omsætning.
> 2. Indtaster vareforbrug.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Brug venligst kun tal"

**Aktuelt resultat**

> Fejl: "Du kan ikke bruge tegn" - "Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet)."

> Passed




## Test scenarie 3

**Test scenarie beskrivelse**

> Indtaster negative tal. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Omsætning: "-30120"
> Vareforbrug: "2500"

**Test trin**

> 1. Indtaster beregnede omsætning som negativt tal.
> 2. Indtaster vareforbrug.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Omsætning kan kun være positiv"

**Aktuelt resultat**

> Fejl: "Negativ tal kan ikke benyttes" - "Negative tal kan ikke benyttes. Du skal angive et heltal."

> Passed




## Test scenarie 4

**Test scenarie beskrivelse**

> Indtaster "0". Brugeren bliver vist et negativ resultat.

**Test Data**

> Omsætning: "0"
> Vareforbrug: "2500"

**Test trin**

> 1. Indtaster beregnede omsætning som negativt tal.
> 2. Indtaster vareforbrug.

**Forventet resultat**

> "-2500"

**Aktuelt resultat**

> "-2500"

> Passed




## Test scenarie 5

**Test scenarie beskrivelse**

> Indtaster negative tal. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Omsætning: "0100"
> Vareforbrug: "0200"

**Test trin**

> 1. Indtaster beregnede omsætning som negativt tal.
> 2. Indtaster vareforbrug.

**Forventet resultat**

> "-100"

**Aktuelt resultat**

> "-100"

> Passed
