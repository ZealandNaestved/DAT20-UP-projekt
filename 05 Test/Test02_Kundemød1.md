## Test scenarie 1

**Test scenarie beskrivelse**

> Et input felt bliver glemt og trykker på beregn knappen. Brugeren bliver stoppet af en fejlmeddelelse.

**Test Data**

> Omsætning: "30120"
> Vareforbrug: "2500"
> Salgsfremmende omkostninger: "700"
> Afskrivninger: "5000"
> Renteomkostninger: ""

**Test trin**

> 1. Indtast beregnede omsætning.
> 2. Indtast vareforbrug.
> 3. Indtast salgsfremmende omkostninger.
> 4. Indtast afskrivninger.
> 5. Glemmer at indtaste renteomkostninger.
> 6. Klikker på beregn knappen.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Udfyld venligst alle felter"

**Egentlige resultat**

> TODO

**Resultat**

> TODO

## Test scenarie 2

**Test scenarie beskrivelse**

> Indtaster bogstav i input felt og trykker på beregn knappen. Brugeren bliver stoppet af en fejlmeddelelse.

**Test Data**

> Omsætning: "30120"
> Vareforbrug: "2500"
> Salgsfremmende omkostninger: "700"
> Afskrivninger: "50p00"
> Renteomkostninger: "125"

**Test trin**

> 1. Indtaster beregnede omsætning.
> 2. Indtaster vareforbrug.
> 3. Indtaster salgsfremmende omkostninger.
> 4. Indtaster afskrivninger, men indtaster forkert.
> 5. Indtaster renteomkostninger.
> 6. Klikker på beregn knappen.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Brug venligst kun tal"

**Egentlige resultat**

> TODO

**Resultat**

> TODO

## Test scenarie 3

**Test scenarie beskrivelse**

> Indtaster negative tal. Programmet laver de negative tal til positive tal. Slutresultatet fremviser notifikation ("OBS: tallet er konverteret til et positivt tal") ud for de konverterede tal.

**Test Data**

> Omsætning: "-30120"
> Vareforbrug: "2500"
> Salgsfremmende omkostninger: "-700"
> Afskrivninger: "5000"
> Renteomkostninger: "125"

**Test trin**

> 1. Indtaster beregnede omsætning som negativt tal.
> 2. Indtaster vareforbrug.
> 3. Indtaster salgsfremmende omkostninger som negativt tal.
> 4. Indtaster afskrivninger.
> 5. Indtaster renteomkostninger.
> 6. Klikker på beregn knappen.

**Forventet resultat**

> Brugeren bliver videresendt til resultat scenen. Talene bliver konverteret til positive tal og resultatet beregnes. Resultatet samt beregninger bliver fremvist for brugeren.

**Egentlige resultat**

> TODO

**Resultat**

> TODO
