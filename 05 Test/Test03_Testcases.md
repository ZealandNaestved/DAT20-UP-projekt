# Testne matcher hvad jeg fik af information, under mødet 03-03-21

Brugerens input bliver testet, ved at brugeren indtaster data, der ikke passer kan beregnes.
Programmet skal smide en fejlmeddelelse, der fortæller brugeren, at han har gjort den ting forkert (dette kan være at brugeren, skriver bogstaver ind i et input til tal.)

<br>

### Test relevant for forkert input

| Test beskrivelse                     | Test trin                                            | Test data | Data type | Forventet resultat |
| ------------------------------------ | ---------------------------------------------------- | --------- | --------- | ------------------ |
| Der skal godkendes tal               | Checker om input felterne udelukkende indeholder tal | 1942      | String    | True               |
| Der skal ikke godkendes tegn         | Checker om input felterne udelukkende indeholder tal | &"/(%&)   | String    | False              |
| Der skal ikke godkendes bogstaver    | Checker om input felterne udelukkende indeholder tal | ABCdef    | String    | False              |
| Der skal ikke godkendes tomme felter | Checker om input felterne udelukkende indeholder tal |           | String    | False              |

<br>

### Test relevant for konvertering til tusinder

| Test beskrivelse                                 | Test trin                                           | Test data | Data type | Forventet resultat | Resultat | Gennemført |
| ------------------------------------------------ | --------------------------------------------------- | --------- | --------- | ------------------ | -------- | ---------- |
| 4 decimal tal skal omskrives korrekt med punktum | Check om punktum er sat korrekt på et 4 decimal tal | 4100      | String    | 4.100              | 4.100    | PASS       |
| Tal skal omskrives korrekt                       | Check om punktum er sat korrekt på et 4 decimal tal | 4100      | String    | 4.100              | 40.10    | FAIL       |
