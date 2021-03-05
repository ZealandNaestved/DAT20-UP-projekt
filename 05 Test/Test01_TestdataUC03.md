# Testdata til brug i UC03 (Markedsføringsbidrag):

I testen antages det at Bruttofortjenesten er angivet samt, at Markedsføringsbidraget findes ved, at trække de salgsfremmende omkostninger fra bruttofortjenesten.
Brugeren indtaster selv "Salgsfremmende omkostninger" som her angives som input. Alle tallene er angivet i tusinder.


### TestCase01: Tekst
**Input** To millioner

**Output**
Tekst kan ikke benyttes. Du skal angive et heltal.
<br><br>


### TestCase02: Negative tal
**Input** -40163000

**Output** Negative tal kan ikke benyttes. Du skal angive et heltal.
<br><br>


### TestCase03: Punktum
**Input** 4.0163.000

**Output** Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).
<br><br>


### TestCase04: Komma
**Input** 401.630,00

**Output** Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).
<br><br>


### TestCase05: Negativt tal og komma
**Input** -401630,00

**Output** Negative tal kan ikke benyttes. Du skal angive et heltal.
<br><br>


### TestCase06: Tallet nul
**Input** 0

**Output**
<br><br>


### TestCase07: Tal mindre end tusind, enere
**Input** 2

**Output**
<br><br>


### TestCase08: Tal mindre end tusind, tiere
**Input** 28

**Output**
<br><br>


### TestCase09: Tal mindre end tusind, hundrede (som rundes op)
**Input** 917

**Output**
<br><br>


### TestCase09:  Tal mindre end tusind, hundrede (som rundes ned)
**Input** 312

**Output**
<br><br>


### TestCase10:
**Input** %

**Output**  Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet). 
<br><br>


### TestCase11:
**Input** 

**Output**
<br><br>
