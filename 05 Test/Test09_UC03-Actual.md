# Test mod Usecase03 & TestData

## Test mod Usecase03 (Usecase)

#### Høk1: 
HØK Studerende angiver negativt tal i kontante omkostninger.
#### Antaget: 
Systemet oplyser at kontante omkostninger ikke må være negativ. og beder om et nyt tal.
#### Actual: 
(pass). Note: Negative tal besked er forskellige i “omsætninger” i forhold til “Markedføringsomkostninger”

<br /> 

#### HØK2:
HØK Studerende angiver non numeriske tegn i kontante omkostninger.
#### Systemet:
oplyser at kontante omkostninger skal beskrives med tal. og beder om et nyt indput.
#### Actual: 
(Pass) Programmet beder om et nyt input der skal være et helt tal uden tegn.


## Test-cases for Use-case 3 (Testdata)

### Test1: 
Input: Salgsfremmede_omkostninger = -20, Bruttofortjeneste = 16

Output: Markedsføringsbidgraet = -4 (Pass)

#### Afprøvning:

Salgsfremmede_omkostninger kan og må ikke skrives i minus, hvilket medføre at test1 er en (Fail)

<br /> 

### Test2: 

Input: Salgsfremmede_omkostninger = -9, Bruttofortjeneste = 13

Output: Markedsføringsbidgraet = 4 (Pass)

#### Afprøvning:

Salgsfremmede_omkostninger kan og må ikke skrives i minus, hvilket medføre at test1 er en (Fail)

<br /> 

### Test3:

Input: Salgsfremmede_omkostninger = 5, Bruttofortjeneste = 10

Output: Markedsføringsbidgraet = 15 (Fail)

#### Afprøvning:

Bruttpfortjeneste 10 - Salgsfremmede_omkostninger 5 = 5. Hvilket er anderledes end forventet output = (Fail)

<br /> 

## Testdata til brug i UC03 (Markedsføringsbidrag) (Testdata)

### TestCase01: Tekst
Input To millioner

Output Tekst kan ikke benyttes. Du skal angive et heltal.

#### Afprøvning:
(pass) Du skal angive et heltal uden tegn (tegn kan f.eks. være kommaer, punktum, procent og meget andet).

<br /> 

### TestCase02: Negative tal
Input -40163000

Output Negative tal kan ikke benyttes. Du skal angive et heltal.

#### Afprøvning:
 (pass) Negative tal kan ikke benyttes. Du skal angive et heltal.

<br /> 

### TestCase03: Punktum
Input 4.0163.000

Output Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).

#### Afprøvning:
Du skal angive et heltal uden tegn (tegn kan f.eks. være kommaer, punktum, procent og meget andet). (pass)

<br /> 

### TestCase04: Komma
Input 401.630,00

Output Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).

#### Afprøvning:
Du skal angive et heltal uden tegn (tegn kan f.eks. være kommaer, punktum, procent og meget andet). (pass)

<br /> 

### TestCase05: Negativt tal og komma
Input -401630,00

Output Negative tal kan ikke benyttes. Du skal angive et heltal.

#### Afprøvning:
Negative tal kan ikke benyttes. (pass)

<br /> 

### TestCase06: Tallet nul
Bruttofortjenesten er 1.000.000, hvilket vises som 1.000 i feltet for bruttofortjeneste
Input 0

Output 1.000

#### Afprøvning:
(Fail) Da det er alpha test, hvilket ikke angiver det i “1000” endnu men anviser 1.000.000kr. som 1.000.000kr.

<br /> 

### TestCase07: Tal mindre end tusind, enere
Bruttofortjenesten er 1.000.000, hvilket vises som 1.000 i feltet for bruttofortjeneste
Input 2

Output 1.000

#### Afprøvning:
(Fail) Programmet er i Alpha, så 2 indskrevet svarer til 2.

<br /> 

### TestCase08: Tal mindre end tusind, tiere
Bruttofortjenesten er 1.000.000
Input 28

Output 1.000

#### Afprøvning:
(Fail) Programmet er i Alpha, så 28 indskrevet svarer til 28.

<br /> 

### TestCase09: Tal mindre end tusind, hundrede (som rundes ned)
Bruttofortjenesten er 1.000.000
Input 917

Output 999

#### Afprøvning:
(Fail) Programmet er i Alpha, så 917 indskrevet svarer til 917.

<br /> 

### TestCase09: Tal mindre end tusind, hundrede (som rundes ned)
Input 312

Output 1.000

#### Afprøvning:
(Fail) Programmet er i Alpha, så 312 indskrevet svarer til 312.

<br /> 

### TestCase10: Procenttegn
Input %

Output Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).

#### Afprøvning:
(pass) Tegn kan ikke benyttes. Du skal angive et heltal uden tegn (tegn kan f.eks. være kommer, punktum, procent og meget andet).

<br /> 

### TestCase11: Input er større end bruttofortjeneste
Bruttofortjenesten er 1.000.000
Input 2000000

Output -1.000

#### Afprøvning:
(Fail) Outputtet giver = 200.000. Da programmet er i Alpha og kun kan angive i resultatet som et minus regnestykke, men ikke om det er i 1000 eller i e 1’ere.



### TestCase12: Input er mindre end bruttofortjeneste
Bruttofortjenesten er 1.000.000
Input 800000

Output 200

#### Afprøvning:
(Fail) Outputtet giver = 200.000. Da programmet er i Alpha og kun kan angive i resultatet som et minus regnestykke, men ikke om det er i 1000 eller i e 1’ere.
