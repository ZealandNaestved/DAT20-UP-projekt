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
