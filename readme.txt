Det første jeg gjorde var å legge til en plugin som heter surefire slik at jeg hadde mulighet til å kjøre testene mine på github.
Når dette var gjort published jeg prosjektet til github.
Da fant jeg ut at jeg trenger workflows for at det skal kunne registrere testene mine.

Ettersom Github har en funskjon som genererer det for deg brukte jeg denne funksjonen og la det inn i .github directory under workflows.
I workflows mappen lagde jeg en maven.yml fil hvor jeg la den YAML koden som skulle ligge der for at github skal kunne bygge og teste koden.

Når dette var ferdig og publisert kunne jeg se på actions og se om testene ble kjørt. Dette var ikke tilfellet. Jeg lestemeg derretter opp
på dokumentasjonen til testing på github og fant ut at test filen måtte ligge i en egen testfolder i roten og samtidig så måtte klassen ende på ordet Test.



