# Test scenarie UseCase 06 Resultat: 
## Test Scenarie 1: 
Indtast begge tal som positive tal, programmet laver de nødvendige beregninger og giver et resultat. 

 Test Data: Resultat før renter 2000000, Renteomkostninger -1000000,

## Test 1:  
1. Indtast Resultat før renter som et positivt tal. 
2. Indtast Renteomkostninger som et negativt tal.  
3. klik på beregn knappen. 

*Forventet Resultat:* 
Brugeren bliver præsenteret for et slut resultat, hvor talende er blevet lagt til hinanden og det korrekte resultat vises.
output = 3000000


## Test scenarie 2: 
Indtast begge tal som negative tal, programmet præsentere resultatet. 
*Test Data:* Resultat før renter 2000000, Renteomkostninger 1000000
1. Indtast Resultat før renter som et positivt tal. 
2. Indtast Renteomkostninger som et positivt tal.  
3. klik på beregn knappen. 

*Forventet Resultat:* 
Brugeren bliver præsenteret for et slut resultat, hvor talende er blevet trukket fra  hinaden hinanden og det korrekte resultat vises.
output = 1000000



## Test scenarie 3: 
Bruger glemmer at indtaste et tal. Programmet melder dette i en exception.  

*Test Data:* Resultat før renter 2.028, Renteomkostninger -- 

## Test 3: 
1. Indtast Resultat før renter som et positivt tal. 
2. Indtast intet i Renteomkostninger.  
3. klik på beregn knappen. 

*Forventet Resultat:* 
Fejlmeddelelse “Indput mangler” 
Brugeren bliver præsenteret for en fejlmeddelelse af programmet der medler om en manglede indtastning. 


## Test scenarie 4: 
Bruger indtaster ikke understøttet data. i.e bogstaver eller symboler. 
*Test Data:* Resultat før renter 2.028, Renteomkostninger g 

## Test 4: 
1. Indtast Resultat før renter som et positivt tal. 
2. Indtast Renteomkostninger som g.  
3. klik på beregn knappen. 

*Forventet Resultat:*  
Fejlmeddelelse “Ikke understøtte data, benyt kun tal” 
Brugeren bliver præsenteret for en fejlmeddelelse af programmet der melder om input af data som ikke er understøttet . 
