**Operation** :<br> beregn_Markedfoeringsbidrag(double salgsfremmendeomkostninger, double bruttofortjeneste)

**Cross References**: <br>Use case 03 beregn markedsfoeringsbidrag

**Preconditions**: <br>
Høk-studerende høk eksisterer <br>
View v eksisterer <br>
ResultatBudget rb existerer <br>
rb.bruttofortjeneste skal være sat ud fra Use case 02<br> 
Lommeregner l eksisterer <br>
l implementerer Begrænsinger<br>
rb.salgsfremmendeomkostninger skal være angivet<br>

**Postconditions**: <br>
rb.markedsføringsbidrag bliver sat til værdien beregnet af l.<br>
v præsenterer rb.markedsføringsbidrag.<br>
