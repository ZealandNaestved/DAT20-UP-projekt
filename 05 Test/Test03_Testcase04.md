## Test scenarie 1

**Test scenarie beskrivelse**

> Et input felt bliver glemt. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Markedsføringsbidrag: "30120"
> Øvrige Kapacitetsomkostninger: ""

**Test trin**

> 1. Indtast Øvrige Kapacitetsomkostninger.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Udfyld venligst alle felter"

## Test scenarie 2

**Test scenarie beskrivelse**

> Indtaster bogstav i input felt. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Markedsføringsbidrag: "301a20"
> Øvrige Kapacitetsomkostninger: "25a00"

**Test trin**

> 1. Indtast Øvrige Kapacitetsomkostninger.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Brug venligst kun tal"

## Test scenarie 3

**Test scenarie beskrivelse**

> Indtaster negative tal. Brugeren bliver vist en fejlmeddelelse.

**Test Data**

> Markedsføringsbidrag: "30120"
> Øvrige Kapacitetsomkostninger: "-2500"

**Test trin**

> 1. Indtast Øvrige Kapacitetsomkostninger.

**Forventet resultat**

> Fejlmeddelelse: "Fejl: Omsætning kan kun være positiv"
