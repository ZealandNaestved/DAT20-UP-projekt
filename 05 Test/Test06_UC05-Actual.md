# Testdata til brug i UC05 (Resultat før renter):

I testen antages det at Indtjeningsbidraget er angivet samt, at Resultat før renter findes ved, at trække Afskrivninger fra Indtjeningsbidraget.
Brugeren indtaster selv "Afskrivninger" som her angives som input.


### TestCase01: Tekst
**Input** To millioner

**Output**
Tekst kan ikke benyttes. Du skal angive et heltal.
<br>

**Actual**
Der kommer ingen fejlmeddelse: Failed
<br><br>

### TestCase02: Negative tal
**Input** -40163000

**Output** Negative tal kan ikke benyttes. Du skal angive et heltal.
<br>

**Actual**
"Negative tal kan ikke benyttes. Du skal angive et heltal" - "Negative tal kan ikke benyttes": Passed <br> Note: det er ikke samme fejlmeddelse som kommer i "Omsætning"
<br><br>

### TestCase03: Punktum
**Input** 4.0163.000

**Output** Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).
<br>

**Actual**
Der kommer ingen fejlmeddelse: Failed
<br><br>

### TestCase04: Komma
**Input** 401.630,00

**Output** Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).
<br>

**Actual**
Der kommer ingen fejlmeddelse: Failed
<br><br>

### TestCase05: Negativt tal og komma
**Input** -401630,00

**Output** Negative tal kan ikke benyttes. Du skal angive et heltal.
<br>

**Actual**
Inden at man kan skrive et komma(som man ikke kan), så kommer der allerede en fejlmeddelse om negative tal: Passed(Kind of)
<br><br>

### TestCase06: Tallet nul
Indtjeningsbidraget er 1.000.000, hvilket vises som 1.000 i feltet for Indtjeningsbidrag.<br>
**Input** 0

**Output** 1.000
<br>

**Actual**
"1000": Passed
<br><br>

### TestCase07: Tal mindre end tusind, enere
Indtjeningsbidraget er 1.000.000, hvilket vises som 1.000 i feltet for Indtjeningsbidrag.<br>
**Input** 2

**Output** 1.000
<br>

**Actual**
Kan ikke skrive decimaler: Failed <br> Note: Kan ikke skrive 2 da det ville være et decimal tal pga. beløb angive i 1000kr.
<br><br>

### TestCase08: Tal mindre end tusind, tiere
Indtjeningsbidraget er 1.000.000<br>
**Input** 28

**Output** 1.000
<br>

**Actual**
Kan ikke skrive decimaler: Failed <br> Note: Kan ikke skrive 28 da det ville være et decimal tal pga. beløb angive i 1000kr.
<br><br>


### TestCase09: Tal mindre end tusind, hundrede (som rundes ned)
Indtjeningsbidraget er 1.000.000<br>
**Input** 917

**Output** 999
<br>

**Actual**
Kan ikke skrive decimaler: Failed <br> Note: Kan ikke skrive 917 da det ville være et decimal tal pga. beløb angive i 1000kr.
<br><br>


### TestCase09: Tal mindre end tusind, hundrede (som rundes ned)
**Input** 312

**Output** 1.000
<br>

**Actual**
Kan ikke skrive decimaler: Failed <br> Note: Kan ikke skrive 312 da det ville være et decimal tal pga. beløb angive i 1000kr.
<br><br>

### TestCase10: Procenttegn
**Input** %

**Output**  Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet). 
<br>

**Actual**
Der kommer ingen fejlmeddelse: Failed
<br><br>


### TestCase11: Input er større end Indtjeningsbidraget<br>
Indtjeningsbidraget er 1.000.000<br>
**Input** 2000000

**Output** -1.000
<br>

**Actual**
"-1000": Passed
<br><br>

### TestCase12: Input er mindre end Indtjeningsbidraget<br>
Indtjeningsbidraget er 1.000.000<br>
**Input** 800000

**Output** 200

**Actual**
"200": Passed
