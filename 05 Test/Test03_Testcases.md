# Testene er baseret på kundemøde 2 (03-03-21)

## Test relevant for uønsket input

Der testes for uønsked input som bogstaver, tomme felter og tegn. Der testes også for accept af tal. Der testes ikke for negative tal da de bliver konverteret.

| Test beskrivelse                     | Test trin                                            | Test data | Data type | Forventet resultat |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |
| Der skal godkendes tal               | Checker om input felterne udelukkende indeholder tal | 1942      | String    | True               |
| Der skal ikke godkendes tegn         | Checker om input felterne udelukkende indeholder tal | &"/(%&)   | String    | False              |
| Der skal ikke godkendes bogstaver    | Checker om input felterne udelukkende indeholder tal | ABCdef    | String    | False              |
| Der skal ikke godkendes tomme felter | Checker om input felterne udelukkende indeholder tal |           | String    | False              |

<br>

## Test relevant for visualisering

Der testes for korrekt formatering i forbindelse med visualiseringen af resultatopgørelsen.

| Test beskrivelse                                 | Test trin                                           | Test data | Data type | Forventet resultat | Resultat | Gennemført |
| ------------------------------------------------ | --------------------------------------------------- | --------- | --------- | ------------------ | -------- | ---------- |
| 4 decimal tal skal omskrives korrekt med punktum | Check om punktum er sat korrekt på et 4 decimal tal | 4100      | String    | 4.100              | 4.100    | PASS       |
| Tal skal omskrives korrekt                       | Check om punktum er sat korrekt på et 4 decimal tal | 4100      | String    | 4.100              | 40.10    | FAIL       |
