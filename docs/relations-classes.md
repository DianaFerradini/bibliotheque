# Relations entre les classes Livre et Emprunt

## Règle métier 

Un livre fait l'objet de plusieurs emprunts au cours de sa vie. Un emprunt ne concerne qu'une seul livre.

Livre 1 ----- * Emprunt

## Matérialisation dans le code

La classe Emprunt a pour attribut un objet Livre.