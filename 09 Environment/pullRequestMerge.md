

# Merge af pull request

#### Kort beskrivelse med review
1. Vælg ***“Pull request”*** i menuen i toppen af Github. 
2. Vælg den pull request, som du ønsker at reviewe inden den merges ind i masteren ***“View pull request”***.
3. Tryk på ***“Add your review”***. 
4. Check flueben på de filer, som du har gennemset (Viewed).
5. Review changes  
   a. Tilføj en kommentar.   
   b. Vælg enten ***“Comment”***, ***“approve”*** eller ***“Request changes”***. Alt efter hvad du ønsker der skal ske med det du lige har gennemgået af kode eller artefakt.     
   c. ***“Submit review”***.  

6. If(mergeConflicts)  
   a. ***“Resolve conflict”***.    
   b. Så bliver der vist alt den kode, som konflikter.     
   c. Du skal slette det kode, som ikke skal bruges. Du kan se sammenligningerne fra pull request mellem master og de ændringer, der er lavet i den nye branch.       
   <<<<<<, og =========, >>>>>>>>> og ==========.   
   d. Husk at slet både filnavnene og tegnene 
  <<<<<<, =========, >>>>>>>>>.   
   e. Tryk på ***“Commit merge”***.  

7. Tryk **'“Merge pull request”*'*.  
   a. Vælg **ALTID** ***“Create a merge commit”**.  
   b. Confirm merge.   
   c. Husk at delete din branch efter at den er merged ind i masteren. 

#### Kort beskrivelse uden review
1. Vælg ***“pull request”**' i menuen i toppen af Github. 
2. Vælg den pull request, som du ønsker at merge ind i mastern. 
3. Tryk ***“Merge pull request”***.  
   a. Vælg **ALTID** ***“Create a merge commit”***.    
   b. Confirm merge.   
   c. Husk at delete din branch efter at den er merged ind i masteren. 



![Image1](https://github.com/sasaje/Test/blob/master/imgGuidePullRequestMerge/img1.png)

Nu er der sendt en request om at MMadsen99 har oprettet en pull request, som han ønsker et review af på mail (den mail tilknyttet din GitHub konto). Her findes et link til den aktuelle pull request, som du skal review.

Du kan også finde de afventende “Pull requests” under menuen i toppen punkt 3 “Pull request”. 

Tryk på ***“Add your review”***.

Gennemgå det ændringer, som der er foretaget.  
Sæt flueben ved filerne, når du har gennemgået dem. 

Tryk på ***“Review changes”***.
Så kommer der en dropdown menu, hvori du skal tilføje eventuelle kommentarer du måtte have til det pågældende kode eller artefakt. 


![Image2](https://github.com/sasaje/Test/blob/master/imgGuidePullRequestMerge/img4.png)

Vælg en af de følgende ***“Comment”***, ***“Approve”*** eller ***“Request Changes”***. 

**APPROVE** vælges hvis alt er godt og kan godkendes uden ændringer.   
**COMMENT** vælges hvis der er kommentarer til det pågældende.  
**REQUEST** CHANGES vælges hvis der skal foretages ændringer af den som har lavet pull requestet. 
 
![Image3](https://github.com/sasaje/Test/blob/master/imgGuidePullRequestMerge/img3.png)

Tryk på ***“Merge pull request”***. 


![Image4](https://github.com/sasaje/Test/blob/master/imgGuidePullRequestMerge/img5.png)

**“Create a merge commit”**	
- Hvis man har lavet flere commits, bliver de alle sammen commited til masteren.

**“Squash and merge”**	
- Hvis man har lavet flere commits, så lægger den dem sammen i en samlet ny branch. (Fjerner de lokale commits).

**“Rebase and merge”**
- Hvis man har lavet flere commits, så lægger den alle de enkelte commits til en samlet branch. 

VÆLG **ALTID** CREATE A MERGE COMMIT.


![Image5](https://github.com/sasaje/Test/blob/master/imgGuidePullRequestMerge/img6.png)

**Husk** at delete din branch efter den er merged ind i masteren. 











